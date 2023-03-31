package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import jdk.internal.util.xml.impl.Input;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture fon, mag, peasant, spear, crossbow, robber, sniper, monk;

	public static final int GANG_SIZE = 10;
	public static ArrayList<BaseUnit> whiteSide = new ArrayList<>();
	public static ArrayList<BaseUnit> darkSide = new ArrayList<>();
	private static int step = 0;
	private static float dx, dy;


	
	@Override
	public void create () {
		batch = new SpriteBatch();
		fon = new Texture("fons/" + (new Random().nextInt(5)) + ".jpg");
		Init();

		int my = 0;
		mag = new Texture("units/Mag.jpg");
		my = mag.getHeight();
		peasant = new Texture("units/Peasant.jpg");
		if (my < peasant.getHeight()) my = peasant.getHeight();
		spear = new Texture("units/Spear.jpg");
		if (my < spear.getHeight()) my = spear.getHeight();
		crossbow = new Texture("units/Crossbow.jpg");
		if (my < crossbow.getHeight()) my = crossbow.getHeight();
		robber = new Texture("units/Robber.jpg");
		if (my < robber.getHeight()) my = robber.getHeight();
		sniper = new Texture("units/Sniper.jpg");
		if (my < sniper.getHeight()) my = sniper.getHeight();
		monk = new Texture("units/Monk.jpg");
		if (my < monk.getHeight()) my = monk.getHeight();
		dx = my;
		dxy= Gd.graphics.getHeight() / 10;
	}

	@Override
	public void render () {
//		ScreenUtils.clear(1, 0, 0, 1);
		if (step == 0) Gdx.graphics.setTiile("Первый ход"); else Gdx.graphics.setTiile("Ход №" + step);
		batch.begin();
		batch.draw(fon, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());

		whiteSide.forEach(n ->{
			switch (n.getInfo()){
				case "Crossbow": if(n.isAlive())batch.draw(crossbow,n.getPosition().getX() * dx, n.getPosition().getY()) * dy; break;
				case "Mag": if(n.isAlive())batch.draw(mag,n.getPosition().getX() * dx, n.getPosition().getY()) * dy; break;
				case "Robber": if(n.isAlive())batch.draw(robber,n.getPosition().getX() * dx, n.getPosition().getY()) * dy; break;
				case "Sniper": if(n.isAlive())batch.draw(sniper,n.getPosition().getX() * dx, n.getPosition().getY()) * dy;  break;
			}
		});

		darkSide.forEach(n ->{
			switch (n.getInfo()){
				case "Crossbow": if(n.isAlive())batch.draw(crossbow,n.getPosition().getX() * dx, n.getPosition().getY()) * dy; break;
				case "Monk": if(n.isAlive())batch.draw(monk,n.getPosition().getX() * dx, n.getPosition().getY()) * dy; break;
				case "Peasant": if(n.isAlive())batch.draw(peasant,n.getPosition().getX() * dx, n.getPosition().getY()) * dy; break;
				case "Spear": if(n.isAlive())batch.draw(spear,n.getPosition().getX() * dx, n.getPosition().getY()) * dy; break;
			}
		});


		batch.end();


		if (Gdx.input.isButtonJustPressed(Input.Buttons.LEFT)) {
//			step++;
			step();
		}

	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
