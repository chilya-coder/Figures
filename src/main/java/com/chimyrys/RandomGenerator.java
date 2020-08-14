package com.chimyrys;

import com.chimyrys.figures.FigureType;

public class RandomGenerator {

    public int generateRandomInt(int max) {
        return (int) (Math.random() * max);
    }

    public double generateRandomDouble(double max) {
        return Math.random() * max;
    }

    public FigureType generateRandomFigureType() {
        FigureType[] figures = FigureType.values();
        return figures[generateRandomInt(figures.length)];
    }
    public Colour generateRandomColour() {
        Colour[] colours = Colour.values();
        return colours[generateRandomInt(colours.length)];
    }
}
