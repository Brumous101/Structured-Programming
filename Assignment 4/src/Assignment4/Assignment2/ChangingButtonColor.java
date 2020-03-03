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
import javax.swing.JColorChooser;

public class ChangingButtonColor extends JFrame implements ActionListener
{
  Box guiBox;
  JTextField messageTextField;
  JButton button1;
  
  public ChangingButtonColor(String frameName)
  {
      super(frameName);
      
      guiBox = new Box(BoxLayout.Y_AXIS);
      messageTextField = new JTextField();
      guiBox.add(messageTextField);
      
      button1 = new JButton("Change my color?");      
      button1.setBackground(Color.green);      
      button1.addActionListener(this);
      guiBox.add(button1);     
      
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
  }
      
  protected void doButton1Action()
  {
    Color color = JColorChooser.showDialog(this,"Button Color", button1.getBackground());
    button1.setBackground(color);
    messageTextField.setText("Thanks!");
  }

  public static void main (String args[])
  {
    ChangingButtonColor frame = new ChangingButtonColor("Changing Button Color");
  }

}