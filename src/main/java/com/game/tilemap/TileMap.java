package com.game.tilemap;

import com.game.constant.CommanConstant;
import com.game.image.ImageUtility;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TileMap {
    private char[][] map;

    // LOAD MAP
    public void loadMap(String s) {
       try {
           // READ MAP FILE
           InputStream in = getClass().getResourceAsStream(s);
           assert in != null;
           BufferedReader br = new BufferedReader(new InputStreamReader(in));

           // MAP SIZE
           map = new char[CommanConstant.ROW_COUNT][CommanConstant.COLUMN_COUNT];

           // SET MAP
           for (int row = 0; row < CommanConstant.ROW_COUNT; row++) {
               String line = br.readLine();
               for (int col = 0; col < CommanConstant.COLUMN_COUNT; col++) {
                   char column = line.charAt(col);
                   map[row][col] = column;
               }
           }

       } catch (Exception e) {
           e.printStackTrace();
       }
    }

    // DRAW TILE
    public void draw(Graphics2D g) {
        for (int row = 0; row < CommanConstant.ROW_COUNT; row++) {
            for (int col = 0; col < CommanConstant.COLUMN_COUNT; col++) {

                // TILE SIZE AND X, Y POSITION
                int tileSize = CommanConstant.TILE_SIZE;
                int x = col * tileSize;
                int y = row * tileSize;

                // TEMP IMAGE
                BufferedImage image = switch (map[row][col]){
                    case 'X' -> ImageUtility.WALL;
                    case 'r' -> ImageUtility.RED_GHOST;
                    case 'b' -> ImageUtility.BLUE_GHOST;
                    case 'p' -> ImageUtility.PINK_GHOST;
                    case 'o' -> ImageUtility.ORANGE_GHOST;
                    case 'P' -> ImageUtility.PACMAN_DOWN;
                    default -> null;
                };

                // DRAW WALL IF TRUE
                if (image != null) {
                    g.drawImage(image, x, y, tileSize, tileSize, null);
                } else if (map[row][col] == ' ') {
                    g.drawImage(ImageUtility.FOOD, x+14, y+14, 4, 4, null);
                }

            }
        }
    }

}
