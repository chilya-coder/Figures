package com.chimyrys.figures;

import com.chimyrys.Colour;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius, Colour colour) {
        this.radius = radius;
        this.colour = colour;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * 2 * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{"
                + "radius=" + getRadius()
                + ", area=" + String.format("%.3f",  getArea())
                + ", colour=" + getColour()
                + '}';
    }
}
