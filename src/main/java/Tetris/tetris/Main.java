package Tetris.tetris;

import Tetris.tetris.graphic.Display;

public class Main {
    private static Display display;

    public static void main(String[] args) {
        display = new Display();
    }

    public static Display getDisplay() {
        return display;
    }
}
