package Tetris.tetris.shapes.list;

import Tetris.tetris.shapes.Shape;

import java.awt.*;

public class E extends Shape {
    private final int[][] shapes = {
            {1, 0, 0, 0},
            {1, 1, 1, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0}
    };

    public E() {
        super(Color.green);
    }

    @Override
    public int[][] getShapes() {
        return shapes;
    }
}
