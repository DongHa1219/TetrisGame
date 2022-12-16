package Tetris.tetris.shapes.list;

import Tetris.tetris.shapes.Shape;

import java.awt.*;

public class B extends Shape {
    private final int[][] shapes = {
            {1, 1, 1, 0},
            {0, 1, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0}
    };

    public B() {
        super(Color.blue);
    }

    @Override
    public int[][] getShapes() {
        return shapes;
    }
}
