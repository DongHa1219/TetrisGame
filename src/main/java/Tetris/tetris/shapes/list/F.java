package Tetris.tetris.shapes.list;

import Tetris.tetris.shapes.Shape;

import java.awt.*;

public class F extends Shape {
    private final int[][] shapes = {
            {1, 1, 0, 0},
            {0, 1, 1, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0}
    };

    public F() {
        super(Color.RED);
    }

    @Override
    public int[][] getShapes() {
        return shapes;
    }
}
