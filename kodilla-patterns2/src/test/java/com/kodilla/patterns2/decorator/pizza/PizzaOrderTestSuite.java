package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testPizzaOrderWithMeatGetCost(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new MushroomsDecorator(theOrder);
        theOrder = new HamDecorator(theOrder);
        theOrder = new OnionDecorator(theOrder);
        System.out.println(theOrder.getCost());
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(19),calculatedCost);
    }

    @Test
    public void testPizzaOrderWithMeatGetIngredients(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new MushroomsDecorator(theOrder);
        theOrder = new HamDecorator(theOrder);
        theOrder = new OnionDecorator(theOrder);
        System.out.println(theOrder.getIngredient());
        //When
        String ingredients = theOrder.getIngredient();
        //Then
        assertEquals("Base(Dough, tomatoes, cheese) + mushrooms + ham + onion",ingredients);
    }

    @Test
    public void testPizzaOrderWithoutMeatGetCost(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();;
        theOrder = new SeafoodDecorator(theOrder);
        theOrder = new OlivesDecorator(theOrder);
        System.out.println(theOrder.getCost());
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(19.5),calculatedCost);
    }

    @Test
    public void testPizzaOrderWithoutMeatGetIngredients(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new SeafoodDecorator(theOrder);
        theOrder = new OlivesDecorator(theOrder);
        System.out.println(theOrder.getIngredient());
        //When
        String ingredients = theOrder.getIngredient();
        //Then
        assertEquals("Base(Dough, tomatoes, cheese) + seafood + olives",ingredients);
    }
}
