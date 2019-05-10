package com.kodilla.testing.shape;

public class Triangle implements Shape
{

    private String name = "Triangle";
    private double side;
    private double height;

    public Triangle(String name, double side, double height) {
        this.side = side;
        this.height = height;
    }

    public String getShapeName()
    {
       return name;
    }

    public double getField() {
        return side * height * 0.5;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (Double.compare(triangle.side, side) != 0) return false;
        if (Double.compare(triangle.height, height) != 0) return false;
        return name != null ? name.equals(triangle.name) : triangle.name == null;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        temp = Double.doubleToLongBits(side);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
