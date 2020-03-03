//Kyle Johnson
//ETEC 1101
//2:00 TR
//Ted Kosan

public class Hello
{

  private String message;

  public Hello(String mess)
  {
    this.message = mess;
  }

  public void printMessage()
  {
    System.out.print("The message is: ");
    System.out.println(message);
    System.out.println();
  }

  public void sayGoodbye()
  {
    System.out.println("Goodbye!");
  }
  
    public void printIntegers(int upTo)
  {
      int index = 1;
      while(index <= upTo)
      {
            System.out.println(index);
            index = index + 1;
      }
      System.out.println();
  }
  
  public void setMessage(String mess)
  {
       this.message = mess;
  }
  
  public void printPattern(int rowCount, String patternCharacter)
  {
      rowCount = rowCount - 1;
      
      int index = 0;     
      
      int number = 0;
      
      while(index <= rowCount)
      {
          System.out.println();
          number = 0;
              while(number <= index)
              {
                  System.out.print(patternCharacter);
                  
                  number = number + 1;     
              }
           
              
          index = index + 1;
      }    
  }
  
  public void printHellos(int total)
  {
    int count = 0;
    while(count < total)
    {
      System.out.println("Hello " + count);
      count = count + 1;
    }
    System.out.println();
  }
  
  public static void main(String args[])
  {
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
}