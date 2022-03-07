package ie.tudublin;

import processing.core.PApplet;

public class Life extends PApplet {
	
	LifeBoard board;


	public void settings() {
		size(1000, 1000);
		board = new LifeBoard(250, this);
		board.randomise();
		println(board.countCellsAround(1, 1));
	}

	public void setup() {
		colorMode(RGB);

	}

	
	public void draw() {
		background(0);
		board.render();
		board.update();
	}
}
