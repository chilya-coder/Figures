package com.chimyrys.figures;

import com.chimyrys.*;

public class FigureFactory {

    private RandomGenerator generator = new RandomGenerator();

    public Figure createFigure(FigureType type) {
        switch (type) {
            case CIRCLE:
                return new Circle(generator.generateRandomInt(10),
                        generator.generateRandomColour());
            case SQUARE:
                return new Square(generator.generateRandomInt(10),
                        generator.generateRandomColour());
            case TRIANGLE:
                return new Triangle(generator.generateRandomInt(10),
                        generator.generateRandomInt(10),
                        generator.generateRandomColour());
            case TRAPEZOID:
                return new Trapezoid(generator.generateRandomInt(10),
                        generator.generateRandomInt(10),
                        generator.generateRandomInt(10),
                        generator.generateRandomColour());
        }
        throw new IllegalArgumentException("Unexpectable figure type: " + type);
    }
}
