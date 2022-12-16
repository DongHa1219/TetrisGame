package Tetris.tetris.shapes;

import Tetris.tetris.shapes.list.*;

import java.util.Random;

public class ShapeFactory {
    public static Shape getRandomShape() {
        final int randomInt = new Random().nextInt(7);

        if (randomInt == 0) {
            return new A();
        } else if (randomInt == 1) {
            return new B();
        } else if (randomInt == 2) {
            return new C();
        } else if (randomInt == 3) {
            return new D();
        } else if (randomInt == 4) {
            return new E();
        } else if (randomInt == 5) {
            return new O();
        } else {
            return new F();
        }
    }
}
