import java.io.*;
import java.util.*;


public class UserInput{

       public String textUserInput() {
       String inputLine = null;
       System.out.println("Input: " + " ");
       try {
         BufferedReader is = new BufferedReader(
         new InputStreamReader(System.in));
         inputLine = is.readLine();
        if (inputLine.length() == 0 ) return null;
         } catch (IOException e) {
        System.out.println("IOException: " + e);
        }

       return inputLine;
       }


}