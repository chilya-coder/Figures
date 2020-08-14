package com.chimyrys.figures;

import com.chimyrys.Colour;
import com.chimyrys.figures.Figure;

public class Trapezoid extends Figure {
    private double a;
    private double b;
    private double h;

    public Trapezoid(double a, double b, double h, Colour colour) {
        this.a = a;
        this.b = b;
        this.h = h;
        this.colour = colour;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public double getArea() {
        return ((a + b) * h) / 2;
    }

    @Override
    public String toString() {
        return "Trapezoid{"
                + "a=" + getA()
                + ", b=" + getB()
                + ", h=" + getH()
                + ", colour=" + getColour()
                + ", area=" + String.format("%.3f",  getArea())
                + '}';
    }
}
