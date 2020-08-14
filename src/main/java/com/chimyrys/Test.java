package com.chimyrys;

import com.chimyrys.figures.Figure;
import com.chimyrys.figures.FigureFactory;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        FigureFactory factory = new FigureFactory();
        List<Figure> figures = new ArrayList<>();
        RandomGenerator generator = new RandomGenerator();
        int randomInt = generator.generateRandomInt(10);
        for (int i = 0; i < randomInt; ++i) {
            figures.add(factory
                    .createFigure(generator.generateRandomFigureType()));
            System.out.println(figures.get(i));
        }
    }
}
