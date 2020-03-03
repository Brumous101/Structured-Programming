//Kyle Johnson
//Structured Programming TR 2:00
//1/29/19
//Prof. Kosan

package Assignment4.Assignment3;

import java.awt.*;
import javax.swing.JPanel;

public class graphic1happy extends JPanel
{
  Point circleCenter = new Point(38,38);
  
  Point leftEye = new Point(22,16);
  
  Point rightEye = new Point(43,16);
  
  Point mouth = new Point(35,42);

  public graphic1happy()
  {
    super();
 
    this.setPreferredSize(new Dimension(75,75));
  }

  public void paint (Graphics g)
  {
    //clear panel.
    Dimension di = this.getSize();
    g.clearRect(0,0,(int)di.getWidth(),(int)di.getHeight());

    //Draw a line around this Panel.
    g.drawRect(0,0,(int)di.getWidth()-1,(int)di.getHeight()-1);

    //Drawing a smiley face with arms and legs    
    
    //Drawing the face with black border
    
    g.setColor(Color.black);
    g.drawOval(circleCenter.x-25,circleCenter.y-25,50,50); 
    
    g.setColor(Color.yellow);
    g.fillOval(circleCenter.x-25,circleCenter.y-25,50,50);        
    
    //Drawing the left eye with border
    g.setColor(Color.black);
    g.fillOval(leftEye.x,leftEye.y,15,15);
    
    g.setColor(Color.white);
    g.fillOval(leftEye.x+2,leftEye.y,11,13);
    
    //Drawing the right eye with border
    g.setColor(Color.black);
    g.fillOval(rightEye.x,rightEye.y,15,15);
    
    g.setColor(Color.white);
    g.fillOval(rightEye.x+2,rightEye.y,11,13);
    
    //Draw a black oval for mouth.
    g.setColor(Color.black);
    g.fillOval(mouth.x,mouth.y,10,10);
    
    //draw a line for left arm
    g.setColor(Color.black);
    g.drawLine(16,48,9,15);
    
    //draw a line for right arm
    g.setColor(Color.black);
    g.drawLine(62,48,69,15);
    
    //draw a line for left leg
    g.setColor(Color.black);
    g.drawLine(24,58,18,69);
    
    g.setColor(Color.black);
    g.drawLine(52,58,56,69);

    //Draw a purple "Happy"
    g.setColor(Color.magenta);
    g.drawString("Happy",25,12);
    }
}