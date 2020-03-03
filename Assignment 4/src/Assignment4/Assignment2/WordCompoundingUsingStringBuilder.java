//Kyle Johnson
//Structured Programming TR 2:00
//1/29/19
//Prof. Kosan

package Assignment4.Assignment2;

import javax.swing.JFrame;
import javax.swing.Box;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.event.*;
import java.awt.*;


public class WordCompoundingUsingStringBuilder extends JFrame implements ActionListener
{
  Box guiBox;
  JTextField messageTextField;
  JButton button1;
  JButton button2;
  JButton button3;
  JButton button4;
  JButton button5;
  StringBuilder appendString = new StringBuilder("");
  
  public WordCompoundingUsingStringBuilder(String frameName)
  {
      super(frameName);
      
      guiBox = new Box(BoxLayout.Y_AXIS);
      messageTextField = new JTextField();
      guiBox.add(messageTextField);
      
      button1 = new JButton("Button 1");      
      button1.setBackground(Color.green);      
      button1.addActionListener(this);
      guiBox.add(button1);
      
      button2 = new JButton("Button 2");      
      button2.setBackground(Color.red);      
      button2.addActionListener(this);      
      guiBox.add(button2);
      
      button3 = new JButton("Button 3");      
      button3.setBackground(Color.blue);      
      button3.addActionListener(this);      
      guiBox.add(button3);
      
      button4 = new JButton("Button 4");      
      button4.setBackground(Color.pink);      
      button4.addActionListener(this);      
      guiBox.add(button4);
      
      button5 = new JButton("Post");      
      button5.setBackground(Color.yellow);      
      button5.addActionListener(this);      
      guiBox.add(button5);
      
      Container frameContainer = this.getContentPane();
      frameContainer.add(guiBox,BorderLayout.NORTH);
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
    else if (src == button5)
    {
      this.doButton5Action();
    }

  }
      
  protected void doButton1Action()
  {
    String doug = "Doug";
    messageTextField.setText(doug);
    appendString.append("Doug ");
  }

  protected void doButton2Action()
  {
    String dimmadome = "Dimmadome ";
    messageTextField.setText(dimmadome);
    appendString.append("Dimmadome ");
  }
  
  protected void doButton3Action()
  {
    String dimmsdale = "Dimmsdale ";
    messageTextField.setText(dimmsdale);
    appendString.append("Dimmsdale ");
  }
  
  protected void doButton4Action()
  {
    String dimmadang = "Dimmadang ";
    messageTextField.setText(dimmadang);
    appendString.append("Dimmadang ");
  }
  
  protected void doButton5Action()
  {
    messageTextField.setText("StringBuilder: " + appendString);
    appendString.delete(0,appendString.length());
  }

  public static void main (String args[])
  {
    WordCompoundingUsingStringBuilder frame = new WordCompoundingUsingStringBuilder("Click to Compound Words");
  }

}