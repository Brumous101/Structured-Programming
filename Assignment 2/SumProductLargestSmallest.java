//Kyle Johnson
//Structured Programming
//1/29/19 2:00
//Prof. Kosan

//Version 1.0.1
//The purpose of this program is to read two numbers in String form from the
// user, convert these two Strings to integers, compare the two numbers and then
// print the results of the comparison back out to the user.

//The import statement is a convenience statement that saves typing for the
// programmer.  The full name of the JOptionPane class is
// javax.swing.JOptionPane.  Every place in the program that we wanted to use
// the JOptionPane class we would have to use its full name if we did not use an
// import statement.  The import statement allows the programmer to only have to
// use the name JOptionPane to refer to this class instead of its full name.
//
//Import statements are not like C include statements and they do not copy any
// text into the source code.
import javax.swing.JOptionPane;

public class SumProductLargestSmallest
{
   //No parameter constructor.
   public SumProductLargestSmallest()
   {
     //Call parent's constructor so that it can construct the part of the object
     //that it is responsible for.
     super();
   }
   
   public void doCompare()
   {
      //Create two String variables for information input and one String variable
      //for information output.  These are not yet referring to any String objects.
      
      //Kyle adds inputThree
      String inputOne, inputTwo, inputThree, answer;
      
      //Create two integer variables.
      
      //Kyle adds 5 variables. num3, large, small, product, and sum.
      int num1, num2, num3, large, small, product, sum;         

      //Input the first number from the user as a String.
      inputOne = JOptionPane.showInputDialog( "Enter first number: " );

      //Input second number from user as a String.
      inputTwo = JOptionPane.showInputDialog( "Enter second number: " );   
      
      //Kyle has third number input from user as a String.
      inputThree = JOptionPane.showInputDialog( "Enter third number: " ); 

      //Use the static utility method parseInt(String) in the Integer class to
      // convert the String numbers received from the user into integer numbers.
      num1 = Integer.parseInt( inputOne );
      num2 = Integer.parseInt( inputTwo );
      
      //Kyle adds num3
      num3 = Integer.parseInt( inputThree );
      
      //Set the answer String variable to a empty String.
      answer = "";
      
      large = 0;
      
      small = 0;
      
      product = 0;
      
      sum = 0;

      if ( num1 >= num3 & num1 >= num2)
      {
      	  	 large = num1;	  
      }
      
      if ( num2 >= num3 & num2 >= num1)
      {
      	  	 large = num2; 	  
      }

      if ( num3 >= num2 & num3 >= num1)
      {
      	  	 large = num3; 	  
      }

      if ( num1 <= num3 & num1 <= num2)
      {
      	  	 small = num1;	  
      }
      
      if ( num2 <= num3 & num2 <= num1)
      {
      	  	 small = num2; 	  
      }

      if ( num3 <= num2 & num3 <= num1)
      {
      	  	 small = num3; 	  
      }
      
      sum = (num1 + num2+ num3);
      
      product = (num1 * num2 * num3);
      
      answer =
      "The sum of the numbers is " + sum +
      ".\nThe product of the numbers is " + product +
      ".\nThe largest number is " + large + 
      ".\nThe smallest number is " + small + ".";
      
      //Output results in a Dialog box.
      JOptionPane.showMessageDialog(
         null, answer, "Sum, Product, Largest, Smallest",
         JOptionPane.INFORMATION_MESSAGE );

      //Shut down the JVM (which ends the program).
      System.exit( 0 );
   }
   
   public static void main( String args[] )
   {
      SumProductLargestSmallest pt = new SumProductLargestSmallest();
      pt.doCompare();
   }
}

