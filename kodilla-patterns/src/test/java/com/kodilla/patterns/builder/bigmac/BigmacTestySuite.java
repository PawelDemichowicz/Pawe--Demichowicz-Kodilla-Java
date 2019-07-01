package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestySuite {

    @Test
    public void testNewBigmac() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("With sesame")
                .burgers(2)
                .sauce("barbecue")
                .ingredient("onion")
                .ingredient("cheese")
                .build();
        System.out.println(bigmac);

        //When
        int howManyIngredients = bigmac.getIngredients().size();

        //Then
        Assert.assertEquals(2,howManyIngredients);
    }
}
