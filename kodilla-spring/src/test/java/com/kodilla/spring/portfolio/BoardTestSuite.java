package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {

    @Test
    public void testTaskAdd(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        TaskList doList = board.getToDoList();
        TaskList progressList = board.getInProgressList();
        TaskList doneList = board.getDoneList();

        doList.getTasks().add("Task1");
        progressList.getTasks().add("Task2");
        doneList.getTasks().add("Task3");

        //Then
        Assert.assertEquals(doList.getTasks().get(0),"Task1");
        Assert.assertEquals(progressList.getTasks().get(0),"Task2");
        Assert.assertEquals(doneList.getTasks().get(0),"Task3");

        System.out.println(doList.getTasks());

    }
}
