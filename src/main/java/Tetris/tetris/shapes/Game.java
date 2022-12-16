package Tetris.tetris.shapes;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private final int[][] bord = {
            {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2},
            {2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2},
            {2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2},
            {2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2},
            {2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2},
            {2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2},
            {2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2},
            {2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2},
            {2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2},
            {2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2},
            {2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2},
            {2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2},
            {2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2},
            {2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2},
            {2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2},
            {2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2},
            {2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2},
            {2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2},
            {2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2},
            {2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2},
            {2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2},
            {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}
    };
    private Shape shape;

    public Game() {
        shape = ShapeFactory.getRandomShape();
    }

    public void update() {
        clearBord();
        shape.addY();
        placeShape(shape);
    }

    public void placeShape(Shape shape) {
        final List<String> list = new ArrayList<>();
        final int[][] shapes = shape.getShapes();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (shapes[i][j] == 1) {
                    int x = shape.getX() + j;
                    int y = shape.getY() + i;
                    list.add(x + ":" + y);
                }
            }
        }

        for (String str : list) {
            int x = Integer.parseInt(str.split(":")[0]);
            int y = Integer.parseInt(str.split(":")[1]);

            if (get(x, y) == 2 || get(x,y) == 3) {
                this.shape.reduceY();
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4; j++) {
                        if (shapes[i][j] == 1) {
                            int a = shape.getX() + j;
                            int b = shape.getY() + i;

                            confirmShade(a, b);
                        }
                    }
                }

                this.shape = ShapeFactory.getRandomShape();
                return;
            }
        }

        for (String str : list) {
            int x = Integer.parseInt(str.split(":")[0]);
            int y = Integer.parseInt(str.split(":")[1]);

            fill(x, y);
        }
    }


    public void clearBord() {
        for (int i = 0; i < 22; i++) {
            for (int j = 0; j < 12; j++) {
                if (bord[i][j] == 1) {
                    bord[i][j] = 0;
                }
            }
        }
    }

    public void fill(int x, int y) {
        bord[y + 1][x + 1] = 1;
    }

    public void clear(int x, int y) {
        bord[y + 1][x + 1] = 0;
    }

    public int get(int x, int y) {
        return bord[y + 1][x + 1];
    }

    public void confirmShade(int x, int y) {
        bord[y + 1][x + 1] = 3;
    }

    public void consolPrint() {
        for (int i = 0; i < 22; i++) {
            for (int j = 0; j < 12; j++) {
                System.out.print(bord[i][j]);
            }
            System.out.println("");
        }
    }

    public int[][] getBord() {
        return bord;
    }

    public Shape getShape() {
        return shape;
    }
}
