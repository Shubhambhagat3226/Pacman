package com.game.gameManager;

public abstract class GameState {

    // GAME STATE MANAGER
    protected GameStateManager gsm;

    // BASIC METHOD THAT SHOULD BE INITIALIZED
    public abstract void init();
    public abstract void draw(java.awt.Graphics2D g);
    public abstract void keyPressed(int k);
    public abstract void keyReleased(int k);
}

