package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    private static final String LIST_NAME = "Homework";

    @Test
    public void testFindByListName(){

        //Given
        TaskList taskList = new TaskList(LIST_NAME,"Kodilla tasks");
        taskListDao.save(taskList);

        //When
        List<TaskList> readList = taskListDao.findByListName(LIST_NAME);

        //Then
        Assert.assertEquals(1,readList.size());

        //CleanUp
        int id = readList.get(0).getId();
        taskListDao.deleteById(id);

    }

}
