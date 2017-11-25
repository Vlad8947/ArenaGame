package com.geek.rpg.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class RpgGame extends Game {
    private SpriteBatch batch;

    public static final int SCREEN_WIDTH = 1280;
    public static final int SCREEN_HEIGHT = 720;

    @Override
    public void create() {
        batch = new SpriteBatch();
        //Create ScrMenager
        ScreenManager.getInstance().init(this, batch);
        //Set the MenuScreen
        ScreenManager.getInstance().switchScreen(ScreenManager.ScreenType.MENU);
    }

    @Override
    public void render() {
        float dt = Gdx.graphics.getDeltaTime();
        //Render the current screen
        this.getScreen().render(dt);
    }

    @Override
    public void dispose() {
        batch.dispose();
    }
}