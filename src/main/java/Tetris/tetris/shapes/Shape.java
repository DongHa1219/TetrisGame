package Tetris.tetris.shapes;

import java.awt.*;

public abstract class Shape {
    private int x = 0;
    private int y = -1;
    private final Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void addX() {
        x++;
    }

    public void addY() {
        y++;
    }

    public void reduceY() {
        y--;
    }

    public abstract int[][] getShapes();

    public Color getColor() {
        return color;
    }
}
