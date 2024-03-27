import java.util.*;
public class NumSum
{
   public static void main(String[] args) 
   {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int number = input.nextInt();
        
        int digit = 1;
        int sum = 0;

        do {
          sum += digit; 
          System.out.println(digit); 
          digit += 1;
        } while(digit <= number);

        System.out.println(sum);
        
      input.close();

    
   }
}				