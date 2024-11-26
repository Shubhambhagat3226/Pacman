package com.game.gameManager;

import java.util.ArrayList;

public final class GameStateManager {
    public static final int LEVEL_1 = 0;

    // STATES OF LEVEL IN GAME
    private ArrayList<GameState> gameStates;
    private int currentState;

    // DEFAULT CONSTRUCTOR -
    // SET STATE AT START OF THE GAME
    public GameStateManager() {
        gameStates = new ArrayList<>();

        currentState = LEVEL_1;

        gameStates.add(new Level_1(this));
    }

    // CHANGE STATE TO NEW STATE
    public void setState(int state) {
        currentState = state;
        gameStates.get(currentState).init();
    }


    // DRAW UPDATE STATE
    public void draw(java.awt.Graphics2D g) {
        gameStates.get(currentState).draw(g);
    }


    // GET KEY-PRESSED VALUE FROM --
    // GAME-PANEL AND PASS TO STATE
    public void keyPressed(int k) {
        gameStates.get(currentState).keyPressed(k);
    }


    // GET KEY-RELEASED VALUE FROM --
    // GAME-PANEL AND PASS TO STATE
    public void keyReleased(int k) {
        gameStates.get(currentState).keyReleased(k);
    }

}
