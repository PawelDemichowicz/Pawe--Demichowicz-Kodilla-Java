package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape
{

    private String name;
    private double field;

    public Triangle(String name, double field) {
        this.name = name;
        this.field = field;
    }

    @Override
    public String getShapeName()
    {
        return name;
    }

    @Override
    public double getField()
    {
        return field;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.field, field) == 0 &&
                name.equals(triangle.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, field);
    }
}
