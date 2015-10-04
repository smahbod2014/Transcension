package com.koda.transcension.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.koda.transcension.Transcension;

public class MenuState extends GameState {

	private BitmapFont font;
	
	public MenuState() {
		
		FreeTypeFontGenerator generator = new FreeTypeFontGenerator(Gdx.files.internal("calibri.ttf"));
        FreeTypeFontGenerator.FreeTypeFontParameter params = new FreeTypeFontGenerator.FreeTypeFontParameter();
        params.size = 46;
        params.genMipMaps = true;
        params.magFilter = Texture.TextureFilter.Linear;
        params.minFilter = Texture.TextureFilter.Linear;
        font = generator.generateFont(params);
        generator.dispose();
	}
	
	
	
	@Override
	public void input(float dt) {
		if (Gdx.input.isKeyJustPressed(Keys.ESCAPE)) {
			Gdx.app.exit();
		}
	}


	@Override
	public void render(SpriteBatch sb) {
		Transcension.s_GlyphLayout.setText(font, Transcension.GAME_TITLE);
		float width = Transcension.s_GlyphLayout.width;
		float height = Transcension.s_GlyphLayout.height;
		
		font.draw(sb, Transcension.GAME_TITLE, Gdx.graphics.getWidth() / 2 - width / 2,
				Gdx.graphics.getHeight() / 2 + height /2);
	}
}
