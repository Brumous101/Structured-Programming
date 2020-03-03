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

public class ClickToDeterminePointerLocation extends JFrame
{
  JPanel graphicsContainer;
  
  graphic1happy graphicsPanel;
  
  public ClickToDeterminePointerLocation(String frameName)
  {     
    super(frameName);
    
    addMouseListener(new MouseAdapter()
    {
        public void mousePressed(MouseEvent e)
        {
            int x = e.getX();
            
            int y = e.getY();
            
            System.out.println("The mouse was pressed at: " + x + " , " + y);
        }
    });
    
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
    ClickToDeterminePointerLocation frame = new ClickToDeterminePointerLocation("Click To Determine Pointer Location");
    
  }
}