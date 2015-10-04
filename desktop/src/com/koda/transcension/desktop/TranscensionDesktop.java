package com.koda.transcension.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.koda.transcension.Transcension;

public class TranscensionDesktop {
	
	public static void main(String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.width = 1024;
        config.height = 768;
        config.fullscreen = true;
        config.title = Transcension.GAME_TITLE;
        config.resizable = false;
		new LwjglApplication(new Transcension(), config);
	}
}
