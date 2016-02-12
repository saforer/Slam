package com.slam.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import screens.ScreenMgr;

public class Slam extends ApplicationAdapter {
    ScreenMgr sm;
	SpriteBatch sb;
	
	@Override
	public void create () {
		sb = new SpriteBatch();
        sm = ScreenMgr.getInst();
        Gdx.input.setInputProcessor(sm);
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		sb.begin();
		sm.render(sb);
		sb.end();
	}
}
