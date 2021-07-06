package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {

    private final String kodillaMentor;
    private int tasksCount;

    public Mentor(String kodillaMentor) {
        this.kodillaMentor = kodillaMentor;
    }

    @Override
    public void update(TaskQueue taskQueue) {
        System.out.println(kodillaMentor + " : New task in queue " + taskQueue.getKodillaUser() + "\n" +
                " (total: " + taskQueue.getTasks().size() + " tasks)");
        tasksCount++;
    }

    public int getTasksCount() {
        return tasksCount;
    }
}
