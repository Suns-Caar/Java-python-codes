//Take an integer input from the user and check if it is palindrome.
import java.util.*;   
class palindrome 
{  
   public static void main(String args[])  
   {  
      String original, reverse = ""; // Objects of String class  
      Scanner in = new Scanner(System.in);   
      System.out.println("Enter a number to check if it is a palindrome");  
      original = in.nextLine();   
      int length = original.length();   
      for ( int i = length - 1; i >= 0; i-- )  
         reverse = reverse + original.charAt(i);  
      if (original.equals(reverse))  
         System.out.println("Int is a palindrome.");  
      else  
         System.out.println("INt isn't a palindrome.");   
   }  
}  
