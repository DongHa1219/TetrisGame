package Tetris.tetris.shapes.list;

import Tetris.tetris.shapes.Shape;

import java.awt.*;

public class C extends Shape {
    private final int[][] shapes = {
            {1, 0, 0, 0},
            {1, 0, 0, 0},
            {1, 1, 0, 0},
            {0, 0, 0, 0}
    };

    public C() {
        super(Color.MAGENTA);
    }

    @Override
    public int[][] getShapes() {
        return shapes;
    }
}
