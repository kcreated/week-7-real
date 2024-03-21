/***********
 * Programmer: Kate Chae
 * Date: March 21st
 * Program Name:Grades
 *********/
import java.util.*;
public class Grades

{
   public static void main(String[] args)
   {
      int grade;

      Scanner input = new Scanner(System.in);
      System.out.print("Enter a number grade: ");
      grade = input.nextInt();
      input.close();

      if(grade >= 90) 
      {
         System.out.println("Impressive, you got an A");
      }
      else if(grade >= 80) 
      {
         System.out.println("Your average self got a B");
      }
      else if(grade >= 70) 
      {
         System.out.println("You somehow got a C");
      }
      else if(grade >= 60)
      {
         System.out.println("Ofcourse you got a D");
      }
      else
      {
         System.out.println("Impressive, you got an F");
      }
   }
}			