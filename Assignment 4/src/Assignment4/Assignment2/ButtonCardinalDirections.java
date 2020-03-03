//Kyle Johnson
//Structured Programming TR 2:00
//1/29/19
//Prof. Kosan

package Assignment4.Assignment2;

import javax.swing.JFrame;
import javax.swing.Box;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.*;
import java.awt.*;

public class ButtonCardinalDirections extends JFrame implements ActionListener
{
  Box guiBox;
  JTextField messageTextField;
  JButton button1;
  JButton button2;
  JButton button3;
  JButton button4;
  
  public ButtonCardinalDirections(String frameName)
  {
      super(frameName);
      
      messageTextField = new JTextField();
      
      button1 = new JButton("North");      
      button1.setBackground(Color.green);      
      button1.addActionListener(this);
      
      button2 = new JButton("South");      
      button2.setBackground(Color.red);      
      button2.addActionListener(this);
      
      button3 = new JButton("West");      
      button3.setBackground(Color.blue);      
      button3.addActionListener(this);
      
      button4 = new JButton("East");      
      button4.setBackground(Color.pink);      
      button4.addActionListener(this);
      
      Container frameContainer = this.getContentPane();
      frameContainer.add(button1,BorderLayout.NORTH);
      frameContainer.add(button2,BorderLayout.SOUTH);
      frameContainer.add(button3,BorderLayout.WEST);
      frameContainer.add(button4,BorderLayout.EAST);
      frameContainer.add(messageTextField,BorderLayout.CENTER);
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
 
  public void actionPerformed(ActionEvent ae)
  {
    Object src = ae.getSource();

    if (src == button1)
    {
      this.doButton1Action();
    }
    else if (src == button2)
    {
      this.doButton2Action();
    }
    else if (src == button3)
    {
      this.doButton3Action();
    }
    else if (src == button4)
    {
      this.doButton4Action();
    }
  }
      
  protected void doButton1Action()
  {
    String north = "North";
    messageTextField.setText(north);
  }

  protected void doButton2Action()
  {
    String south = "South";
    messageTextField.setText(south);
  }
  
  protected void doButton3Action()
  {
    String west = "West";
    messageTextField.setText(west);
  }
  
  protected void doButton4Action()
  {
    String east = "East";
    messageTextField.setText(east);
  }
  

  public static void main (String args[])
  {
    ButtonCardinalDirections frame = new ButtonCardinalDirections("Button Cardinal Directions");
  }

}