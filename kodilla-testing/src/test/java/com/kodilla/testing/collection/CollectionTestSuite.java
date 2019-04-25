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
        OddNumbersExterminator numbersTest1 = new OddNumbersExterminator();
        ArrayList<Integer> number = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        //When
        numbersTest1.exterminate(number,odd);
        //Than
        Assert.assertTrue(odd.isEmpty());

    }

    @Test
    public void testOddNumbersExterminatorNormalList()
    {
        //Given
        OddNumbersExterminator numbersTest2 = new OddNumbersExterminator();
        ArrayList<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(5);
        ArrayList<Integer> odd = new ArrayList<>();
        //When
        numbersTest2.exterminate(number,odd);
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        oddNumbers.add(2);
        oddNumbers.add(4);
        //Than
        Assert.assertEquals(oddNumbers,odd);
    }

    @After
    public void ending()
    {
        System.out.println("Test is ending...");
    }
}
