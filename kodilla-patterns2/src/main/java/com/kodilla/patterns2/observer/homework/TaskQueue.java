package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class TaskQueue implements Observable {

    private final List<Observer> observers;
    private final List<String> tasks;
    private final String kodillaUser;

    public TaskQueue(String kodillaUser) {
        this.kodillaUser = kodillaUser;
        observers = new ArrayList<>();
        tasks = new ArrayList<>();
    }

    public void addTask(String taskName) {
        tasks.add(taskName);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer){
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    public List<String> getTasks() {
        return tasks;
    }

    public String getKodillaUser() {
        return kodillaUser;
    }

    public List<Observer> getObservers() {
        return observers;
    }
}
