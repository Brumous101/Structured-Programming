//Kyle Johnson
//ETEC 1101 2:00PM
//3/21/19 
//Professor Kosan
package assignment.pkg7;

public class Dog
{ 
  private String dogName;
    
  private String dogType;

  public Dog(String dName, String dType)
  {
    super();
  //We assign the 
    dogName = dName;
    
    dogType = dType;
    
    System.out.println(this);
  }

//Overrides the toString function from the Object class
  @Override
  public String toString()
  {
    return("This good boy's name is " + dogName + ". He is a " + dogType + ".");
  }

  public static void main(String[] args) 
    {
        Dog dg = new Dog("Baby", "Chorkie");

    }
}

