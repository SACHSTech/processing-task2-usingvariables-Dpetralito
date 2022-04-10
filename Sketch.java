import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(700, 700);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(36, 175, 255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	// sample code, delete this stuff
  fill(44, 148, 33);
  //rect(0, 400, 500, 400);
  rect((0), (float) (height * 0.8), (float) (width / 1), (float) (height * 0.8), (float) (width * 0.8));

  fill(184, 48, 48);
  //rect(100, 300, 300, 200);
  rect((float) (width * 0.2), (float) (height * 0.6), (float) (width * 0.6), (float) (height * 0.4));
    
  fill(163, 163, 163);
  //triangle(50, 300, 250, 100, 450, 300);
  triangle((float) (width * 0.1), (float) (height * 0.6), (float) (width * 0.5), (float) (height * 0.2), (float) (width * 0.9), (float) (height * 0.6));
    
  fill(255);
  //rect(200, 400, 100, 250);
  rect((float) (width * 0.4), (float) (height * 0.8), (float) (width * 0.2), (float) (height * 0.5));
    
  fill(247, 165, 0);
  //ellipse(275, 460, 15, 15);
  ellipse((float) (width * 0.55), (float) (height * 0.92), (float) (width * 0.03), (float) (height * 0.03));
    
  fill(153, 219, 255);
  //ellipse(250, 210, 75, 75);
  ellipse((float) (width * 0.5), (float) (height * 0.42), (float) (width * 0.15), (float) (height * 0.15));
    
  fill(0);
  //line(250, 172, 250, 247);
  line((float) (width * 0.5), (float) (height * 0.344), (float) (width * 0.5), (float) (height * 0.494));
    
  fill(0);
  //line(211, 210, 286, 210);
  line((float) (width * 0.422), (float) (height * 0.42), (float) (width * 0.572), (float) (height * 0.42));
    
  fill(247, 165, 0);
  //ellipse(0, 0, 150, 150);
  ellipse((0), (0), (float) (width * 0.3), (float) (height * 0.3));
    
  }
  
  // define other methods down here.
}