package Tetris.tetris.shapes.list;

import Tetris.tetris.shapes.Shape;

import java.awt.*;

public class A extends Shape {
    private final int[][] shapes = {
            {1, 1, 0, 0},
            {1, 1, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0}
    };

    public A() {
        super(Color.YELLOW);
    }

    @Override
    public int[][] getShapes() {
        return shapes;
    }


}
