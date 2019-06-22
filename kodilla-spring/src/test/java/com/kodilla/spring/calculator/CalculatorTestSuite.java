package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testCalculations(){

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double sum = calculator.add(2,2);
        double subtract = calculator.sub(2,2);
        double product = calculator.mul(2,2);
        double quotient = calculator.div(2,2);

        //Then
        Assert.assertEquals(sum, 4, 0.01);
        Assert.assertEquals(subtract, 0, 0.01);
        Assert.assertEquals(product, 4, 0.01);
        Assert.assertEquals(quotient, 1, 0.01);

    }
}
