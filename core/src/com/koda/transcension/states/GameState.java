package com.koda.transcension.states;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public abstract class GameState {

	public GameState() {
		
	}
	
	public void pause() {}
	public void resume() {}
	public void dispose() {}
	public void input(float dt) {}
	public void update(float dt) {}
	public abstract void render(SpriteBatch sb);
}
