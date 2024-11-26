package com.game;

import com.game.constant.CommanConstant;

import javax.swing.*;

public class app {
    public static void main(String[] args) {
        // MAKE FRAME
        JFrame frame = new JFrame("Pacman");

        // SET SIZE
        frame.setSize(CommanConstant.BOARDER_WIDTH, CommanConstant.BOARDER_HEIGHT);

        // MAKE NOT RESIZABLE
        frame.setResizable(false);

        // WINDOW APPEAR AT CENTER
        frame.setLocationRelativeTo(null);

        // CLOSE BY CLICKING CROSS OF WINDOW
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        // GAME PANEL
        GamePanel gamePanel = new GamePanel();
        frame.add(gamePanel);

        // MAKE FRAME TO FULLY PANEL SIZE
        frame.pack();

        // SET VISIBLE
        frame.setVisible(true);

    }
}
