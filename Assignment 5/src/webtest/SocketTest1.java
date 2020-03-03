//Kyle Johnson
//Structured Programming
//3/2/19
//Prof. Kosan
//v.02

//This program opens a socket connection to an HTTP server, requests a resource
// and receives the response. Version 1.0.1

package webtest;

import java.net.*;
import java.io.*;
import javax.swing.JOptionPane;
//import javax.swing.JTextArea;
//import javax.swing.JScrollPane;

public class SocketTest1
{

  private BufferedReader in;
  private PrintWriter out;
  private String inputLine;
  private Socket socket;

  //No parameter constructor.
  public SocketTest1()
  {
    //Call parent's constructor so that it can construct the part of the object
    //that it is responsible for.
    super();
  }
     
  public void doSocketTest()
  {
      
    String input, answer, path = "/";
    int length, periods, tags, a;
    //This StringBuffer will hold the html response received from a web server.
    StringBuilder htmlCode = new StringBuilder();

    input = JOptionPane.showInputDialog( "Enter the address of the website you would like to visit: " );
    
    try
    {
        InetAddress iAddress = InetAddress.getByName(input);

      //Open a socket connection to the desired server using the specified port.
      socket = new Socket(iAddress, 80);

      //Open an output stream to the server so we can send information to it.
      out = new PrintWriter(socket.getOutputStream());

      //Open an input stream to the server so we can receive information from it.
      in = new BufferedReader(new InputStreamReader(socket.getInputStream()));


      //Send an HTTP 'GET' request to the server.
      //out.print("GET /TINI/index.html HTTP/1.0\r\n\n");
      out.print("GET " + path + " HTTP/1.0\r\n\n");
      out.flush();


      //Read the HTML response from the server a line at a time until the whole
      //response has been received.
      while((inputLine = in.readLine()) != null)
      {
        //Print each line as it is received to standard out.
        System.out.println(inputLine);

        //Copy each line into a StringBuffer so that we can display it later.
        htmlCode.append(inputLine);
        htmlCode.append("\n");
      }

      //Close the socket connection
      socket.close();
      
      //Instantiate a JTextArea and initialize it with the contents of
      //htmlCode, configure it, place it into a JScrollPane and
      //then show it in a JOptionPane dialog box.
      
      //JTextArea ta = new JTextArea(htmlCode.toString());
      //ta.setColumns(80);
      //ta.setRows(24);
      //ta.setEditable(false);
      //JScrollPane sp = new JScrollPane(ta);
      //JOptionPane.showMessageDialog(null,sp);
      
      length = htmlCode.length();
      periods = 0;
      tags = 0;
      a = 0;
      
      for(int index = 0; index < length; index++)
      {
          if(htmlCode.charAt(index) == '.')
          {
               periods++;
          }
          if(htmlCode.charAt(index) == '<')
          {
               tags++;
          }
          if(htmlCode.charAt(index) == 'a')
          {
               a++;
          }
      }

      answer = "The total number of periods in the string was: " + periods + 
              ". \nThe total number of HTML start tags in the string was: " + tags +
              ". \nThe total number of times the lowercase letter a in the string was: " + a + ".";
      
      JOptionPane.showMessageDialog(null, answer, "Answer", JOptionPane.INFORMATION_MESSAGE );
      
    }//end try
    catch (UnknownHostException uhe)
    {
      uhe.printStackTrace();
    }
    catch (IOException ioe)
    {
      ioe.printStackTrace();
    }
    catch (Exception e)
    {
        e.printStackTrace();
    }
    

  }//end method


  public static void main(String args[])
  {
    SocketTest1 st = new SocketTest1();
    st.doSocketTest();
  }
}//end class
