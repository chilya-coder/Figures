package com.chimyrys.figures;

import com.chimyrys.Colour;

public abstract class Figure {
    protected Colour colour;

    public void drawFigure() {
        System.out.println("Draw figure");
    }

    public abstract double getArea();

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

}
