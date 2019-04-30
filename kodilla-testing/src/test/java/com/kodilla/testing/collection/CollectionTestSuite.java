package com.kodilla.testing.collection;
import org.junit.Assert;
import org.junit.After;
import org.junit.Test;
import org.junit.Before;
import java.util.ArrayList;

public class CollectionTestSuite {

    @Before
    public void starting()
    {
        System.out.println("Test is starting...");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList()
    {
        //Given
        OddNumbersExterminator exterminator1 = new OddNumbersExterminator();
        ArrayList<Integer> number = new ArrayList<>();
        //When
        ArrayList result = exterminator1.exterminate(number);
        //Than
        Assert.assertTrue(result.isEmpty());

    }

    @Test
    public void testOddNumbersExterminatorNormalList()
    {
        //Given
        OddNumbersExterminator exterminator2 = new OddNumbersExterminator();
        ArrayList<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(5);
        //When
        exterminator2.exterminate(number);
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        oddNumbers.add(2);
        oddNumbers.add(4);
        ArrayList result = exterminator2.exterminate(number);
        //Than
        Assert.assertEquals(oddNumbers,result);
    }

    @After
    public void ending()
    {
        System.out.println("Test is ending...");
    }
}
