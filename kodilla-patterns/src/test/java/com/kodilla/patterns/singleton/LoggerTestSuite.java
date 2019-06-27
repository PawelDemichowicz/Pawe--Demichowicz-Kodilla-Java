package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void getLastLog(){
        //Given
        Logger.getInstance().log("Fatal error.");

        //When
        String log = Logger.getInstance().getLastLog();

        //Then
        Assert.assertEquals(log, "Fatal error.");
    }
}
