/*Kate Chae */

import java.util.*;
public class gcd

{
   public static void main(String[] args) 
 
   {

      int num1 = 0;
      int temp = 0;
      int num2 = 0;

      Scanner input = new Scanner(System.in);
      System.out.print("Enter a number: ");
      num1 = input.nextInt();
      System.out.print("Enter a second number: ");
      num2 = input.nextInt(); 

      while(num2 > 0) {
        temp = num1%num2;
        num1 = num2;
        num2 = temp; }

        System.out.println("The GCD is " + num1);

    }

}