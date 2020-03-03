//Kyle Johnson
//Structured Programming TR 2:00
//1/29/19
//Prof. Kosan

package Assignment4.Assignment3;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.Border.*;
import javax.swing.BorderFactory;

public class DrawingSmileyFace extends JFrame
{
  JPanel graphicsContainer;
  
  graphic1happy graphicsPanel;
  
  public DrawingSmileyFace(String frameName)
  {
      
    super(frameName);
    
    graphicsContainer = new JPanel();
    graphicsContainer.setBorder(BorderFactory.createRaisedBevelBorder());

    graphicsPanel = new graphic1happy();
    graphicsContainer.add(graphicsPanel);

    Container frameContainer = this.getContentPane();
    frameContainer.add(graphicsContainer,BorderLayout.CENTER);
    /*
    this.addWindowListener(
      new WindowAdapter() {
        public void windowClosing( WindowEvent e )
        {
          System.exit( 0 );
        }
      }
    );
    */
    this.pack();
    this.setSize(400,300);
    this.setVisible(true);
  }
  
  public static void main (String args[])
  {     
    DrawingSmileyFace frame = new DrawingSmileyFace("Drawing Smiley Face");   
  }
}