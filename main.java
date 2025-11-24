/*Integer inputNum is read from input. Write a loop that iterates while inputNum is not equal to 1. In each iteration of the loop:

Output "Still waiting for 1" and a newline.
Read integer inputNum from input.*/

import java.util.Scanner;

public class SimpleWhileLoop {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
		int inputNum;

		inputNum = scnr.nextInt();

      while (inputNum != 1) {

         System.out.println("Still waiting for 1");
         inputNum = scnr.nextInt();

      }

		System.out.println("Encountered 1!");
   }
}
