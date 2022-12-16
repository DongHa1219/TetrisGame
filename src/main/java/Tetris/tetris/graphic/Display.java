package Tetris.tetris.graphic;

import Tetris.tetris.graphic.panels.ScorePanel;
import Tetris.tetris.graphic.panels.TetrisPanel;
import Tetris.tetris.graphic.panels.TimePanel;

import javax.swing.*;

public class Display extends JFrame {
    private final TetrisPanel tetrisPanel = new TetrisPanel();
    private final ScorePanel scorePanel = new ScorePanel();
    private final TimePanel timePanel = new TimePanel();

    public Display() {
        setTitle("Tetris");
        setVisible(true);
        setSize(600,690);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(2000,200);
        setResizable(false);
        setLayout(null);

        tetrisPanel.setBounds(0,0,500,700);

        add(tetrisPanel);
    }

    public TetrisPanel getTetrisPanel() {
        return tetrisPanel;
    }

    public ScorePanel getScorePanel() {
        return scorePanel;
    }

    public TimePanel getTimePanel() {
        return timePanel;
    }
}
