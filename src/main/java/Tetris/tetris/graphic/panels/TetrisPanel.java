package Tetris.tetris.graphic.panels;

import Tetris.tetris.shapes.Game;
import javax.swing.*;
import java.awt.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TetrisPanel extends JPanel {
    private static final ScheduledExecutorService SCHEDULED_EXECUTOR_SERVICE = Executors.newScheduledThreadPool(1);
    private final Game game = new Game();

    public TetrisPanel() {
        final Runnable runnable = () -> {
            game.update();
            repaint();
        };

        SCHEDULED_EXECUTOR_SERVICE.scheduleAtFixedRate(runnable, 1, 900, TimeUnit.MILLISECONDS);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        g.drawRect(0, 0, 360, 660);

        allClear(g);

        int x = 0;
        int y = 0;

        int[][] bord = game.getBord();

        for (int i = 0; i < 22; i++) {
            for (int j = 0; j < 12; j++) {
                if (bord[i][j] == 2) {
                    g.setColor(Color.BLACK);
                    g.fillRect(x, y, 30, 30);
                } else if (bord[i][j] == 0) {
                    g.setColor(Color.WHITE);
                    g.drawRect(x, y, 30, 30);
                } else if (bord[i][j] == 1) {
                    g.setColor(game.getShape().getColor());
                    g.fillRect(x, y, 30, 30);
                } else if (bord[i][j] == 3) {
                    g.setColor(Color.DARK_GRAY);
                    g.fillRect(x, y, 30, 30);
                }
                x += 30;
            }
            x = 0;
            y += 30;
        }
    }

    public void allClear(Graphics g) {
        int x = 0;
        int y = 0;

        for (int i = 0; i < 22; i++) {
            for (int j = 0; j < 12; j++) {
                g.clearRect(x, y, 30, 30);
                x += 30;
            }
            x = 0;
            y += 30;
        }
    }

}