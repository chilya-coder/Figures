package com.chimyrys.figures;

import com.chimyrys.Colour;
import com.chimyrys.figures.Figure;

public class Square extends Figure {
    private double side;

    public Square(double side, Colour colour) {
        this.side = side;
        this.colour = colour;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public String toString() {
        return "Square{"
                + "side=" + getSide()
                + ", colour=" + getColour()
                + ", area=" + String.format("%.3f",  getArea())
                + '}';
    }
}
