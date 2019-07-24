package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Autowired
    private ItemDao itemDao;

    @Autowired
    private ProductDao productDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product milk = new Product("Milk");
        Product flour = new Product("Flour");

        Item item = new Item(new BigDecimal(3), 200, new BigDecimal(600));
        Item item1 = new Item(new BigDecimal(5), 150, new BigDecimal(750));
        Item item2 = new Item(new BigDecimal(4), 100, new BigDecimal(400));

        Invoice invoice = new Invoice("01/2019");

        item.setProduct(milk);
        item1.setProduct(flour);
        item2.setProduct(milk);
        invoice.getItems().add(item);
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);

        //When
        productDao.save(milk);
        int milkId = milk.getId();
        productDao.save(flour);
        int flourId = flour.getId();

        itemDao.save(item);
        int itemId = item.getId();
        itemDao.save(item1);
        int item1Id = item1.getId();
        itemDao.save(item2);
        int item2Id = item2.getId();

        invoiceDao.save(invoice);
        int invId = invoice.getId();

        //Then
        Assert.assertNotEquals(0, invId);

        //CleanUp
        productDao.deleteById(milkId);
        productDao.deleteById(flourId);
        invoiceDao.deleteById(invId);

    }
}
