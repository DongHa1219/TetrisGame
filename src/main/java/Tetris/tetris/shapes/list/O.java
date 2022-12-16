package Tetris.tetris.shapes.list;

import Tetris.tetris.shapes.Shape;

import java.awt.*;

public class O extends Shape {

    private final int[][] shapes = {
            {1, 0, 0, 0},
            {1, 0, 0, 0},
            {1, 0, 0, 0},
            {1, 0, 0, 0}
    };

    public O() {
        super(Color.lightGray);
    }

    @Override
    public int[][] getShapes() {
        return shapes;
    }
}
