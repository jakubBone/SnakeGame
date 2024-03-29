package com.mygdx.game;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import game.SnakeGame;

public class DesktopLauncher {
	public static void main(String[] arg) {
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
		config.setTitle("SnakeGame");
		config.setWindowedMode(768, 768);
		config.setForegroundFPS(60);
		config.useVsync(true);

			new Lwjgl3Application(new SnakeGame(), config);
	}
}