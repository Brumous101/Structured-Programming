//Kyle Johnson
//Structured Programming TR 2:00
//2/19/19
//Prof. Kosan
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4;

import Assignment4.Assignment1.Hello;
import Assignment4.Assignment2.ButtonCardinalDirections;
import Assignment4.Assignment2.ChangingButtonColor;
import Assignment4.Assignment2.CompareNums1;
import Assignment4.Assignment2.SumProductLargestSmallest;
import Assignment4.Assignment2.WordCompoundingUsingStringBuilder;
import Assignment4.Assignment3.ClickToDeterminePointerLocation;
import Assignment4.Assignment3.DrawingSmileyFace;
import Assignment4.Assignment3.SwitchGraphicsOnClick;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Kyle_Johnson
 */
public class Assignment4 extends JFrame implements ActionListener
{
  JButton button1;
  JButton button2;
  JButton button3;
  JButton button4;
  JButton button5;
  JButton button6;
  JButton button7;
  JButton button8;
  JButton button9;
  JFrame f;
  
  public Assignment4(String frameName)
  {    
      super(frameName);
      
      f = new JFrame();
      
      button1 = new JButton("Hello");      
      button1.setBackground(Color.yellow);    
      button1.addActionListener(this);
      
      button2 = new JButton("Button's Stating Cardinal Directions");      
      button2.setBackground(Color.yellow);
      button2.addActionListener(this);
      
      button3 = new JButton("Changing Button Color");      
      button3.setBackground(Color.yellow);
      button3.addActionListener(this);
      
      button4 = new JButton("CompareNums1");      
      button4.setBackground(Color.yellow);
      button4.addActionListener(this);
      
      button5 = new JButton("Sums, Products, Largest, and Smallest Numbers");      
      button5.setBackground(Color.yellow);
      button5.addActionListener(this);
      
      button6 = new JButton("Word Compounding Using String Builder");      
      button6.setBackground(Color.yellow);
      button6.addActionListener(this);
      
      button7 = new JButton("Click To Determine Pointer Location");      
      button7.setBackground(Color.yellow);
      button7.addActionListener(this);
      
      button8 = new JButton("Drawing of a Smiley Face");      
      button8.setBackground(Color.yellow);
      button8.addActionListener(this);
      
      button9 = new JButton("Switch Between Graphics on Click");      
      button9.setBackground(Color.yellow);
      button9.addActionListener(this);
      
      JPanel panel = new JPanel();
      
      panel.setLayout(new GridLayout(9,0));
      
      Container frameContainer = this.getContentPane();
      panel.add(button1);
      panel.add(button2);
      panel.add(button3);
      panel.add(button4);
      panel.add(button5);
      panel.add(button6);
      panel.add(button7);
      panel.add(button8);
      panel.add(button9);
      
      frameContainer.add(panel);
    
      this.addWindowListener(
      new WindowAdapter() {
        public void windowClosing( WindowEvent e )
        {
          System.exit( 0 );
        }
      }
    );      
    
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
    else if (src == button6)
    {
      this.doButton6Action();
    }
    else if (src == button7)
    {
      this.doButton7Action();
    }
    else if (src == button8)
    {
      this.doButton8Action();
    }
    else if (src == button9)
    {
      this.doButton9Action();
    }
    

  }
  
  protected void doButton1Action()
  {
    button1.setBackground(Color.green);
    
    Hello h1 = new Hello("Are you having fun yet?");
    Hello h2 = new Hello("Yes I am!");

    h1.printMessage();
    h2.printMessage();
    
    h1.printHellos(4);
    h2.printHellos(5);

    h1.sayGoodbye();
    h2.sayGoodbye();
    
    h1.printIntegers(5);
    h1.setMessage("My new message.");
    h1.printMessage();
    h1.printPattern(5, "*");
  }
  
  protected void doButton2Action()
  {
    button2.setBackground(Color.green);
    ButtonCardinalDirections frame = new ButtonCardinalDirections("Button Cardinal Directions");
  }
  
  protected void doButton3Action()
  {
    button3.setBackground(Color.green);
    ChangingButtonColor frame = new ChangingButtonColor("Changing Button Color");
  }
  
  protected void doButton4Action()
  {
    button4.setBackground(Color.green);
    CompareNums1 pt = new CompareNums1();
    pt.doCompare();
  }
  
  protected void doButton5Action()
  {
    button5.setBackground(Color.green);
    SumProductLargestSmallest pt = new SumProductLargestSmallest();
    pt.doCompare();
  }
  
  protected void doButton6Action()
  {
    button6.setBackground(Color.green);
    WordCompoundingUsingStringBuilder frame = new WordCompoundingUsingStringBuilder("Click to Compound Words");
  }
  
  protected void doButton7Action()
  {
    button7.setBackground(Color.green);
    ClickToDeterminePointerLocation frame = new ClickToDeterminePointerLocation("Click To Determine Pointer Location");

  }
  
  protected void doButton8Action()
  {
    button8.setBackground(Color.green);
    DrawingSmileyFace frame = new DrawingSmileyFace("Drawing Smiley Face");   
  }
  
  protected void doButton9Action()
  {
    button9.setBackground(Color.green);
    SwitchGraphicsOnClick frame = new SwitchGraphicsOnClick("Click to Switch Graphics");   
  }

  public static void main(String[] args) 
  {
    Assignment4 g = new Assignment4("Select an Assignment to View");
  }
    
}
