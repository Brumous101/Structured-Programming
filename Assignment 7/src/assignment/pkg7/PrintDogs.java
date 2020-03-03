//Kyle Johnson
//ETEC 1101 2:00PM
//3/21/19 
//Professor Kosan
package assignment.pkg7;

public class PrintDogs implements Runnable
{
  private Dog[] dogArray = new Dog[]
  {
  new Dog("Baby", "Chorkie"),
  new Dog("Peanut", "Cockerspaniel"),
  new Dog("Toodle", "Poodle"),
  new Dog("Fireball", "Pitbull"),
  new Dog("Kitty", "German Shepherd")
  };
                                             
  private int threadNumber;

  private String printSpaces;

  public PrintDogs()
  {
    super();
    
    threadNumber = 1;
  }
  
  @Override
  public void run()
  {
    while (true)
    {      
      try
      {
        Thread.sleep(threadNumber * 2000);
      }
      catch (InterruptedException ie)
      {
        ie.printStackTrace();
      }
      
      for (int g=0; g<=5; g++)
      {
          if( g == 5 )
          {
            g = 0;
          }
          
          System.out.println(dogArray[g]);
      }   
    }
  }

  public static void main(String args[])
  {
    PrintDogs pd;
    
    pd = new PrintDogs();
    Thread thread = new Thread(pd);
      
    //Tell the Thread object to start running the 'run' method of the Runnable
    //object we passed it.
    thread.start();    
  }
}

