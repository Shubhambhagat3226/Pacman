package com.game.gameManager;

import com.game.tilemap.TileMap;

import java.awt.*;

public class Level_1 extends GameState{

    // TILE MAP OBJECT
    private TileMap tileMap;

    public Level_1(GameStateManager gsm) {
        this.gsm = gsm;
        init(); // change when menu add
    }

    @Override
    public void init() {

        // TILE MAP
        tileMap = new TileMap();
        tileMap.loadMap("/map/map1.txt");
    }

    @Override
    public void draw(Graphics2D g) {
        tileMap.draw((Graphics2D) g);
    }

    @Override
    public void keyPressed(int k) {

    }

    @Override
    public void keyReleased(int k) {

    }
}
