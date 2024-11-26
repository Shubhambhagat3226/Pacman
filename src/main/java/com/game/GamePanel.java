package com.game;

import com.game.constant.CommanConstant;
import com.game.tilemap.TileMap;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {
    TileMap tileMap;

    public GamePanel() {
        // SET SIZE WITH PREFERRED METHOD SO PACK OF FRAME WORK
        setPreferredSize(new Dimension(CommanConstant.BOARDER_WIDTH, CommanConstant.BOARDER_HEIGHT));

        // CHANGE BACKGROUND TO BLACK COLOR
        setBackground(Color.black);

        // TILE MAP
        tileMap = new TileMap();
        tileMap.loadMap("/map/map.txt");
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        tileMap.draw((Graphics2D) g);
    }
}
