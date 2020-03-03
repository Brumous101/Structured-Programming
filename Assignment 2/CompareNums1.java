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

public class CompareNums1 
{
   //No parameter constructor.
   public CompareNums1()
   {
     //Call parent's constructor so that it can construct the part of the object
     //that it is responsible for.
     super();
   }
   
   public void doCompare()
   {
      //Create two String variables for information input and one String variable
      //for information output.  These are not yet referring to any String objects.
      String inputOne, inputTwo, answer;
      
      //Create two integer variables.
      int num1, num2;         

      //Input the first number from the user as a String.
      inputOne = JOptionPane.showInputDialog( "Enter first number: " );

      //Input second number from user as a String.
      inputTwo = JOptionPane.showInputDialog( "Enter second number: " );          

      //Use the static utility method parseInt(String) in the Integer class to
      // convert the String numbers received from the user into integer numbers.
      num1 = Integer.parseInt( inputOne );
      num2 = Integer.parseInt( inputTwo );
      
      //Set the answer String variable to a empty String.
      answer = "";

      if ( num1 == num2 )
      {
         answer = "The numbers are equal.";
      }

      if ( num1 > num2 )
      {
         answer = num1 + " is greater than " + num2;
      }

      if ( num1 < num2 )
      {
         answer = num1 + " is less than " + num2;
      }


      //Output results in a Dialog box.
      JOptionPane.showMessageDialog(
         null, answer, "Answer",
         JOptionPane.INFORMATION_MESSAGE );

      //Shut down the JVM (which ends the program).
      System.exit( 0 );
   }
   
   public static void main( String args[] )
   {
      CompareNums1 pt = new CompareNums1();
      pt.doCompare();
   }
}

