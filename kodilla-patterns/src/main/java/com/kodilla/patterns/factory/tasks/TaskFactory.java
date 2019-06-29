package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    private static final String SHOPPING_TASK = "ShoppingTask";
    private static final String PAINTING_TASK = "PaintingTask";
    private static final String DRIVING_TASK = "DrivingTask";

    public Task makeTask(String taskClass) {
        switch (taskClass) {
            case (SHOPPING_TASK):
                return new ShoppingTask("shopping", "T-Shirts", 3.0);
            case (PAINTING_TASK):
                return new PaintingTask("Portrait", "Colorful", "Jan Kowalski");
            case (DRIVING_TASK):
                return new DrivingTask("Trip", "Italy", "Plane");
            default:
                return null;
        }
    }
}
