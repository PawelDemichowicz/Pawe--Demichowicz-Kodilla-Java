package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    private Shape shape;
    private ArrayList<ShapeCollector> shapes = new ArrayList<>();

    public ShapeCollector(Shape shape)
    {
        this.shape = shape;
    }

    public void addFigure(Shape shape)
    {

    }

    public void removeFigure(Shape shape)
    {

    }

    public void getFigure(int n)
    {

    }

    public String showFigures()
    {
    }

    public ArrayList<ShapeCollector> getShapes()
    {
        return shapes;
    }
}
