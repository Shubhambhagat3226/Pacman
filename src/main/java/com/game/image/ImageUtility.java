package com.game.image;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class ImageUtility {

    // WALL
    public static final BufferedImage WALL = getImage("/wall.png");

    // GHOST
    public static final BufferedImage BLUE_GHOST = getImage("/ghost/blueGhost.png");
    public static final BufferedImage RED_GHOST = getImage("/ghost/redGhost.png");
    public static final BufferedImage ORANGE_GHOST = getImage("/ghost/orangeGhost.png");
    public static final BufferedImage PINK_GHOST = getImage("/ghost/pinkGhost.png");
    public static final BufferedImage SCARED_GHOST = getImage("/ghost/scaredGhost.png");

    // PACMAN
    public static final BufferedImage PACMAN_UP = getImage("/pacman/pacmanUp.png");
    public static final BufferedImage PACMAN_DOWN = getImage("/pacman/pacmanDown.png");
    public static final BufferedImage PACMAN_LEFT = getImage("/pacman/pacmanLeft.png");
    public static final BufferedImage PACMAN_RIGHT = getImage("/pacman/pacmanRight.png");

    // FOOD
    public static final BufferedImage CHERRY = getImage("/cherry.png");
    public static final BufferedImage CHERRY2 = getImage("/cherry2.png");
    public static final BufferedImage FOOD = getImage("/powerFood.png");


    //  PROVIDE IMAGE BY PATH OF IMAGE
    public static BufferedImage getImage(String imagePath) {
        try {
            BufferedImage image = ImageIO.read(ImageUtility.class.getResourceAsStream(imagePath));
            return image;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
