package com.koda.transcension;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.GlyphLayout;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.koda.transcension.states.GameStateManager;
import com.koda.transcension.states.MenuState;
import com.koda.transcension.states.PlayState;

public class Transcension extends ApplicationAdapter {
	
	public static final String GAME_TITLE = "Transcension";
	
	public static GlyphLayout s_GlyphLayout = new GlyphLayout();
	SpriteBatch sb;
	
	@Override
	public void create() {
		sb = new SpriteBatch();
		
		GameStateManager.addState("Menu", new MenuState());
		GameStateManager.addState("Play", new PlayState());
		GameStateManager.setState("Menu");
	}

	@Override
	public void render() {
		Gdx.gl.glClearColor(0, 0, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		float dt = Gdx.graphics.getDeltaTime();
		GameStateManager.input(dt);
		GameStateManager.update(dt);
		sb.begin();
		GameStateManager.render(sb);
		sb.end();
	}
	
	public void pause() {
		GameStateManager.pause();
	}
	
	public void resume() {
		GameStateManager.resume();
	}
	
	public void dispose() {
		GameStateManager.dispose();
	}
}
