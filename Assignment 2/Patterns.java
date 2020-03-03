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

public class Patterns
{
   //No parameter constructor.
   public Patterns()
   {
     //Call parent's constructor so that it can construct the part of the object
     //that it is responsible for.
     super();
   }
   
   public void printPattern()
   {
      //Create two String variables for information input and one String variable
      //for information output.  These are not yet referring to any String objects.
      
      //Kyle adds inputThree
      String inputOne, answer, pattern1, pattern2, pattern3, pattern4, error1, error2;
      
      //Create two integer variables.
      
      //Kyle adds 5 variables. num3, large, small, product, and sum.
      int num1;        

      //Input the first number from the user as a String.
      inputOne = JOptionPane.showInputDialog( "Enter a whole number between 1 and 4" );

      //Use the static utility method parseInt(String) in the Integer class to
      // convert the String numbers received from the user into integer numbers.
      num1 = Integer.parseInt( inputOne );
      
      //Set the answer String variable to a empty String.
      answer = "";
      
      pattern1 = 
        "*" + 
      "\n**" +
      "\n***" + 
      "\n****" +
      "\n*****";
      
      pattern2 = 
        "*****" + 
      "\n****" +
      "\n***" + 
      "\n**" +
      "\n*";
      
      pattern3 = 
        "    *" + 
      "\n   **" +
      "\n  ***" + 
      "\n ****" +
      "\n*****";
      
      pattern4 =
        "*****" + 
      "\n ****" +
      "\n  ***" + 
      "\n   **" +
      "\n    *";
      
      error1 = "The number entered was a whole number greater than 4.";
      
      error2 = "The number entered was a whole number less than 1.";
      
      if (num1 == 1)
      {
          answer = pattern1;
      }
      
      if (num1 == 2)
      {
          answer = pattern2;
      }
      
      if (num1 == 3)
      {
          answer = pattern3;
      }
      
      if (num1 == 4)
      {
          answer = pattern4;
      }
      
      if (num1 > 4)
      {
          answer = error1;
      }
      
      if (num1 < 1)
      {
          answer = error2;
      }
      
      //Output results in a Dialog box.
      JOptionPane.showMessageDialog(
         null, answer, "Pattern",
         JOptionPane.INFORMATION_MESSAGE );

      //Shut down the JVM (which ends the program).
      System.exit( 0 );
   }
   
   public static void main( String args[] )
   {
      Patterns pt = new Patterns();
      pt.printPattern();
   }
}

