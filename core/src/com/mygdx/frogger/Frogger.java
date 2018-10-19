package com.mygdx.frogger;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.viewport.ExtendViewport;

import java.util.HashMap;

public class Frogger extends ApplicationAdapter {

	final HashMap<String, Sprite> sprites = new HashMap<String, Sprite>();
	TextureAtlas textureAtlas;
	SpriteBatch batch;
	OrthographicCamera camera;
	ExtendViewport viewport;

	@Override
	public void create () {
		batch = new SpriteBatch();
		camera = new OrthographicCamera();
		viewport = new ExtendViewport(800,600,camera);
		textureAtlas = new TextureAtlas("froger-sprites.txt");
		addSprites();

	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

	}
	
	@Override
	public void dispose () {
	    sprites.clear();
	    batch.dispose();
	}

	private void addSprites(){
		Array<TextureAtlas.AtlasRegion> regions = textureAtlas.getRegions();
	}
}
