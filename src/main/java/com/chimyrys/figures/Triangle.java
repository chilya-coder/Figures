package com.chimyrys.figures;

import com.chimyrys.Colour;
import com.chimyrys.figures.Figure;

public class Triangle extends Figure {
    private double a;
    private double h;

    public Triangle(double a, double h, Colour colour) {
        this.a = a;
        this.h = h;
        this.colour = colour;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public double getArea() {
        return 1 / 2 * a * h;
    }

    @Override
    public String toString() {
        return "Triangle{"
                + "a=" + getA()
                + ", h=" + getH()
                + ", colour=" + getColour()
                + ", area=" + String.format("%.3f",  getArea())
                + '}';
    }
}
