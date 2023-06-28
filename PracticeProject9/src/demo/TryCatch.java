package demo;
import java.util.*;
public class TryCatch {
	public static void main(String args[]) {
	      int num1, num2;
	      try {
	         num1 = 0;
		 System.out.println("Sending the Exception");
	         num2 = 62 / num1;
	         System.out.println(num2);
	               }
	      catch (ArithmeticException e) { 
	         System.out.println("We can’t divide any number by zero");
	      }
	      catch (Exception e) {
	         System.out.println("Exception occurred");
	      }
	      System.out.println("Try-Catch ended.");
	   }

}
