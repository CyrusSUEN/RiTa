package rita.render.test;

import processing.core.PApplet;
import rita.*;
import rita.support.RiTimer;

public class BoundingBoxFeatures extends PApplet {
  
	public void setup() {
	  
		size(400, 800);

    RiText.defaults.showBounds = true;
		RiText.defaultFont("Times", 20);
		
		RiText rt = new RiText(this, "Grayscale Fill", 200,  100);
		rt.boundingBoxFill(155);
		
		RiText rt2 = new RiText(this, "Grayscale Fill & Alpha", 200,  110);
		rt2.boundingBoxFill(10,100);

		new RiText(this, "Color Fill", 200, 150).align(CENTER).boundingBoxFill(255,255,0);
		float[] c = {255,0,0};
		new RiText(this, "Color Fill", 200, 220).align(CENTER).boundingBoxFill(c);
		new RiText(this, "Color Fill & Alpha", 200, 200).align(CENTER).boundingBoxFill(255,255,0,100);

	//TODO	boundingBoxPadding
		/*
		new RiText(this, "Bounding Box Stroke", 200, 300).align(RIGHT).boundingBoxPadding(50);
		new RiText(this, "Bounding Box Stroke", 200, 340).align(RIGHT).boundingBoxPadding(200);
		System.out.println(new RiText(this, "Bounding Box Stroke", 200, 380).align(RIGHT).boundingBoxPadding(200).boundingBoxPadding());
		*/
		
		new RiText(this, "Bounding Box Stroke", 200, 300).align(RIGHT).boundingBoxStroke(200);
		new RiText(this, "Bounding Box Stroke", 200, 350).align(RIGHT).boundingBoxStroke(200,100);
		
		new RiText(this, "Bounding Box Stroke", 200, 400).align(RIGHT).boundingBoxStroke(0,0,255);
		new RiText(this, "Bounding Box Stroke", 200, 450).align(RIGHT).boundingBoxStroke(0,0,255,150);
		float[] c2 = {255,0,0};
		new RiText(this, "Bounding Box Stroke", 200, 500).align(RIGHT).boundingBoxStroke(c2);
		new RiText(this, "Bounding Box Stroke", 200, 550).align(RIGHT).boundingBoxStroke(255,0,0,150);

		//TODO boundingBoxWeight 
		/*
		new RiText(this, "Bounding Box Stroke", 200, 600).boundingBoxStroke(c2).boundingBoxWeight(50);
		new RiText(this, "Bounding Box Stroke", 200, 650).boundingBoxStroke(c2).boundingBoxWeight(-2);
		System.out.println(new RiText(this, "Bounding Box Stroke", 200, 680).boundingBoxStroke(c2).boundingBoxWeight(-50).boundingBoxWeight());
*/

		RiText rt3 = new RiText(this, "Grayscale Fill & Alpha", 200,  600).align(LEFT);// TODO weird x-offset caused X position incorrect
		float[] i = rt3.center();
		new RiText(this, "X: "+i[0] +"Y: " +i[1], i[0], i[1]).align(CENTER).fontSize(10);
		RiText rt4 = new RiText(this, "Grayscale Fill & Alpha", 200,  675).align(CENTER);
		float[] i2 = rt4.center();
		new RiText(this, "X: "+i2[0] +"Y: " +i2[1], i2[0], i2[1]).align(CENTER).fontSize(10);
		
		RiText rt5 = new RiText(this, "Grayscale Fill & Alpha", 200,  750).align(RIGHT);
		float[] i3 = rt5.center();
		new RiText(this, "X: "+i3[0] +"Y: " +i3[1], i3[0], i3[1]).align(CENTER).fontSize(10);
		
		background(255);
		line(200, 0, 200, 800);
		RiText.drawAll();	
	}

}