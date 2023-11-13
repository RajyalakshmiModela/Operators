import java.util.Scanner;
public class Swapingwithoutusingthird
{
   public static void main(String[] args)
{
   Scanner sc= new Scanner(System.in);
   int x=4,y=2;
   x=x+y;
   x=x-y;
   y=x-y;
   System.out.println("before swaping:");
   System.out.println(x+"  "+y);
   System.out.println("Enter the first value:");
   x=sc.nextInt();
   System.out.println("Enter the second value:");
   y=sc.nextInt();
   System.out.println("before swaping:");
   System.out.println(x+"  "+y);
   }
}
   