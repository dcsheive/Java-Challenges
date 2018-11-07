import java.util.*; 
import java.io.*;

class FirstReverse {  
  public static String FirstReverseMethod(String str) { 
  
    String newStr = ""; 
    for (int i = str.length()-1; i>=0;i--){
        newStr = newStr + str.charAt(i);
    }
    return newStr;
    
  } 
  
  public static void main (String[] args) {  
    System.out.print(FirstReverseMethod("Hello")); 
    System.out.print(FirstReverseMethod("Heck")); 
  }   
  
}