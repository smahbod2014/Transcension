package com.koda.transcension.states;

import java.util.HashMap;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GameStateManager {
	
	private static final HashMap<String, GameState> s_StateMap = new HashMap<String, GameState>();
	private static GameState s_CurrentState;
	
	public static void addState(String name, GameState state) {
		s_StateMap.put(name, state);
	}
	
	public static void setState(String name) {
		GameState state = s_StateMap.get(name);
		if (state == null) {
			System.out.println("NO SUCH STATE");
		}
		
		s_CurrentState = state;
	}
	
	public static void input(float dt) {
		s_CurrentState.input(dt);
	}
	
	public static void update(float dt) {
		s_CurrentState.update(dt);
	}
	
	public static void render(SpriteBatch sb) {
		s_CurrentState.render(sb);
	}
	
	public static void pause() {
		s_CurrentState.pause();
	}
	
	public static void resume() {
		s_CurrentState.resume();
	}
	
	public static void dispose() {
		s_CurrentState.dispose();
	}
}
