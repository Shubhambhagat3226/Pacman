package com.game;

import com.game.constant.CommanConstant;
import com.game.gameManager.GameStateManager;
import com.game.tilemap.TileMap;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
    TileMap tileMap;

    GameStateManager gsm;

    // GAMELOOP
    Timer gameLoop;
    public GamePanel() {
        // SET SIZE WITH PREFERRED METHOD SO PACK OF FRAME WORK
        setPreferredSize(new Dimension(CommanConstant.BOARDER_WIDTH, CommanConstant.BOARDER_HEIGHT));

        // CHANGE BACKGROUND TO BLACK COLOR
        setBackground(Color.black);

        // GAME STATE MANAGER
        gsm = new GameStateManager();

        // GAME LOOP
        gameLoop = new Timer(50,this);
        gameLoop.start();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        gsm.draw((Graphics2D) g);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {
        gsm.keyPressed(e.getKeyCode());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        gsm.keyReleased(e.getKeyCode());
    }

}
