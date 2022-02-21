package ie.tudublin;

import processing.core.PApplet;

public class Loops extends PApplet {

	int mode = 0;

	public void settings() {
		size(500, 500);
	}

	public void setup() {
		colorMode(HSB);

	}

	public void keyPressed() {
		if (key >= '0' && key <= '9') {
			mode = key - '0';
		}
		println(mode);
	}

	float magicMap(float a, float b, float c, float d, float e) {
		float output;
		a -= b;
		c -= b;
		e -= d;

		output = ((a / c) * e) + d;

		return output;
	}

	float magicMap1(float a, float b, float c, float d, float e) {
		float r1 = c - b;
		float r2 = e - d;
		float howFar = a - b;

		return d + ((howFar / r1) * r2);
	}

	float offset = 0;

<<<<<<< HEAD
	public void draw()
	{
		
		switch(mode)	
		{
=======
	public void draw() {
		switch (mode) {
>>>>>>> 685932b121058406c40b9cf85c4606b4537b6cdd
			case 0:
			{
				background(0);
				colorMode(HSB);
				int bars = (int) (mouseX / 20.0f);
				float w = width / (float) bars;
				for (int i = 0; i < bars; i++) {
					noStroke();
					fill(map(i, 0, bars, 0, 255), 255, 255);
					rect(map(i, 0, bars, 0, 500), 0, w, height);
				}
				break;
			}

			case 1:
			{
				background(0);
				colorMode(HSB);
				int squares = (int) (mouseX / 20.0f);
				float h = width / (float) squares;
				for (int i = 0; i < squares; i++)
				{
					noStroke();
					fill(map(i, 0, squares, 0, 255), 255, 255);
					float x = map(i, 0, squares, 0, width);
					rect(x, x, h, h);
					rect((width - h) - x, x, h, h);
				}
<<<<<<< HEAD
				break;
<<<<<<< HEAD
				//map(a,b,c,d,e);
				//a = inputvalue
=======
			}
				break;
			case 2:
				background(255);
				int circles = (int) (mouseX / 20.0f);
				offset += (mouseY / 100.0f);
				float d = width / (float) circles;
				for (int j = 0; j < circles; j++) {
					for (int i = 0; i < circles; i++) {
						noStroke();
						float c = map((i + j + offset), 0, circles * 2, 0, 255) % 256;
						fill(c, 255, 255);
						float x = map(i, 0, circles - 1, d / 2.0f, width - (d / 2.0f)); 
						float y = map(j, 0, circles - 1, d / 2.0f, width - (d / 2.0f)); 
						circle(x, y, d);
					}
				}

				// map(a,b,c,d,e);
				// a = inputvalue
>>>>>>> 685932b121058406c40b9cf85c4606b4537b6cdd
				// b - c - start and end of the first range
				// d, e 0 - start and and of the end range

				// map(-2, 10, 90, 200, 233);
<<<<<<< HEAD
				case 2:
				background(255);
				int circles = (int) (mouseX / 20.0f);
				offset += (mouseY / 100.0f);
				float d = width / (float) circles;
				for (int j = 0; j < circles; j++) {
					for (int i = 0; i < circles; i++) {
						noStroke();
						float c = map((i + j + offset), 0, circles * 2, 0, 255) % 256;
						fill(c, 255, 255);
						float x = map(i, 0, circles - 1, d / 2.0f, width - (d / 2.0f)); 
						float y = map(j, 0, circles - 1, d / 2.0f, width - (d / 2.0f)); 
						circle(x, y, d);
=======
=======
			}
			
>>>>>>> loops
			case 2:
			{
				background(255);
				colorMode(HSB);
				int circles = (int) (mouseX / 20.0f);
				offset += (mouseY / 1000.0f);
				float d = width / (float) circles;
				for (int j = 0; j < circles; j++) {
					for (int i = 0; i < circles; i++) {
						noStroke();
						float c = map((i + j + offset), 0, circles * 2, 0, 255) % 256;
						fill(c, 255, 255);
<<<<<<< HEAD
						float x = map
						circle(map(i, 0, circles - 1, d / 2.0f, width - (d / 2.0f)));
>>>>>>> loops
=======
						float x = map(i, 0, circles - 1, d / 2.0f, width - (d / 2.0f)); 
						float y = map(j, 0, circles - 1, d / 2.0f, width - (d / 2.0f)); 
						circle(x, y, d);
>>>>>>> loops
					}
				}
				break;
			}

			case 3:
			{
				background(0);
				colorMode(RGB);
				float border = width * 0.1f;
				for (int i = -5; i <= 5; i++)
				{
					float x = map(i, -5, 5, border, width - border);
					stroke(0, 255, 0);
					line (x, border, x, height - border);
					line (border, x, width - border, x);
					fill(255);
					text(i, x, border * 0.5f);
					text(i, border * 0.5f, x);
				}
				break;
			}

			case 4:
			{
				background(0);
				colorMode(RGB);
				stroke(255);
				float cx = width / 2;
				float cy = height / 2;
				float radius = 200;
				int sides = (int)map(mouseX, 1, width, 0, 20);
				for (int i = 0; i < sides; i++)
				{
					float theta1 = map(i - 1, 0, sides, 0, TWO_PI);
					float x1 = cx + sin(theta1) * radius;
					float y1 = cy + cos(theta1) * radius;

					float theta2 = map(i, 0, sides, 0, TWO_PI);
					float x2 = cx + sin(theta2) * radius;
					float y2 = cy + cos(theta2) * radius;
					line (x1, y2, x2, y1);
				}
			}
		}
	}
}
