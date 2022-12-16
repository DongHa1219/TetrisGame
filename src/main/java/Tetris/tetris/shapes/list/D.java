package Tetris.tetris.shapes.list;

import Tetris.tetris.shapes.Shape;

import java.awt.*;

public class D extends Shape {
    private final int[][] shapes = {
            {0, 1, 1, 0},
            {1, 1, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0}
    };

    public D() {
        super(Color.pink);
    }

    @Override
    public int[][] getShapes() {
        return shapes;
    }
}
