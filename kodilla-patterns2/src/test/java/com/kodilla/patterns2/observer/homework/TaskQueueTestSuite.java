package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TaskQueueTestSuite {

    @Test
    public void testUpdate(){
        //Given
        TaskQueue smith_queue = new TaskQueue("John Smith");
        TaskQueue escobar_queue = new TaskQueue("Ivone Escobar");
        TaskQueue pinkam_queue = new TaskQueue("Jessie Pinkam");
        Mentor mentor1 = new Mentor("Rob Anderson");
        Mentor mentor2 = new Mentor("Ludovico Lancetto");
        smith_queue.registerObserver(mentor1);
        escobar_queue.registerObserver(mentor1);
        pinkam_queue.registerObserver(mentor2);
        //When
        smith_queue.addTask("Facade pattern");
        smith_queue.addTask("Decorator pattern");
        escobar_queue.addTask("Aspect programming");
        pinkam_queue.addTask("Observer pattern");
        smith_queue.addTask("Adapter pattern");
        //Then
        assertEquals(4,mentor1.getTasksCount());
        assertEquals(1,mentor2.getTasksCount());
    }
}
