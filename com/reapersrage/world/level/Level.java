package com.reapersrage.world.level;

import com.reapersrage.gfx.Screen;

/**
 * Created with IntelliJ IDEA.
 * User: Soulevoker
 * Date: 10/24/13
 * Time: 5:51 PM
 * Copyright © Reapers' Rage 2013
 */
public abstract class Level {
    protected int width, height;
    protected int[] tiles;

    public Level(int width, int height) {
        this.width = width;
        this.height = height;
        tiles = new int[width * height];
        generateLevel();
    }

    public Level(String path) {
        loadLevel(path);
    }



    protected void generateLevel() {

    }

    public void loadLevel(String path) {

    }

    protected abstract void update();

    protected abstract void render(int xScroll, int yScroll, Screen screen);

    protected abstract void time();
}
