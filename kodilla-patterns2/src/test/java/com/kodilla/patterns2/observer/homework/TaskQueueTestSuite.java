package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TaskQueueTestSuite {

    @Test
    public void testRegisterObserver(){
        //Given
        TaskQueue smithQueue = new TaskQueue("John Smith");
        TaskQueue escobarQueue = new TaskQueue("Ivone Escobar");
        TaskQueue pinkamQueue = new TaskQueue("Jessie Pinkam");
        Mentor mentor1 = new Mentor("Rob Anderson");
        Mentor mentor2 = new Mentor("Ludovico Lancetto");
        smithQueue.registerObserver(mentor1);
        escobarQueue.registerObserver(mentor1);
        pinkamQueue.registerObserver(mentor2);
        //When
        smithQueue.addTask("Facade pattern");
        smithQueue.addTask("Decorator pattern");
        escobarQueue.addTask("Aspect programming");
        pinkamQueue.addTask("Observer pattern");
        smithQueue.addTask("Adapter pattern");
        //Then
        assertEquals(4,mentor1.getTasksCount());
        assertEquals(1,mentor2.getTasksCount());
    }

    @Test
    public void testRemoveObserver(){
        //Given
        TaskQueue smithQueue = new TaskQueue("John Smith");
        TaskQueue escobarQueue = new TaskQueue("Ivone Escobar");
        TaskQueue pinkamQueue = new TaskQueue("Jessie Pinkam");
        Mentor mentor1 = new Mentor("Rob Anderson");
        Mentor mentor2 = new Mentor("Ludovico Lancetto");
        smithQueue.registerObserver(mentor1);
        escobarQueue.registerObserver(mentor1);
        pinkamQueue.registerObserver(mentor2);
        smithQueue.removeObserver(mentor1);
        //When
        smithQueue.addTask("Facade pattern");
        smithQueue.addTask("Decorator pattern");
        escobarQueue.addTask("Aspect programming");
        pinkamQueue.addTask("Observer pattern");
        smithQueue.addTask("Adapter pattern");

        //Then
        assertEquals(1,mentor1.getTasksCount());
        assertEquals(1,mentor2.getTasksCount());
        assertEquals(0,smithQueue.getObservers().size());
    }

    @Test
    public void testNotifyObserver(){
        //Given
        TaskQueue smithQueue = new TaskQueue("John Smith");
        Mentor mentor = new Mentor("Rob Anderson");
        smithQueue.registerObserver(mentor);
        //When
        smithQueue.notifyObservers();
        int result = mentor.getTasksCount();
        //Then
        assertEquals(1,mentor.getTasksCount());
    }
}
