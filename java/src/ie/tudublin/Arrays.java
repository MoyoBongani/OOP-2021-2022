package ie.tudublin;

import processing.core.PApplet;

public class Arrays extends PApplet {

	float[] rainfall = { 45, 37, 55, 27, 38, 50, 79, 48, 104, 31, 100, 58 };
    String[] months = {"JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"};

    float[] a1 = new float[100];
    float[] a2;

    int minVal = 0;
    int maxVal = 0;
    int totVal = 0;

	public void settings() 
    {
		size(500, 500);
	}

	public void setup() 
    {
        /*
        for (int i = 0; i < rainfall.length; i++)
        {
            println(rainfall[i] + "\t" + months[i]);
        }

        int j = 0;
        for (float r:rainfall)
        {
            println(r + "\t" + months[j]);
            j++;
        }

        for (int i = rainfall.length - 1; i >= 0; i--)
        {
            println(rainfall[i] + "\t" + months[i]);
        }
        */

        
        for (int i = 0; i < rainfall.length; i++)
        {
            if (rainfall[i] < rainfall[minVal])
            {
                minVal = i;
            }
            else if (rainfall[i] > rainfall[maxVal])
            {
                maxVal = i;
            }

            totVal += rainfall[i];
        }

        println("Max Rainfall: " + rainfall[maxVal] + " in month " + months[maxVal]);
        println("Min Rainfall: " + rainfall[minVal] + " in month " + months[minVal]);
        println("Average Rainfall: " + totVal/12);
        println("Total Rainfall: " + totVal);
	}

    public void draw()
	{
        background(0);
        colorMode(HSB);
        float w = width / (float)rainfall.length;
        for (int i = 0; i < rainfall.length; i++)
        {
            float x = map(i, 0, rainfall.length, 0, width);
            int c = (int)map(i, 0, rainfall.length, 0, 255);
            fill(c, 255, 255);
            float h = map(rainfall[i], 0, rainfall[maxVal], 0, -height);
            rect(x, height, w, h);
            fill(255);
            textAlign(CENTER, CENTER);
            text(months[i], x + (w / 2), height - 50);
        }
	}
}