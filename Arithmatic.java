import java.util.Scanner;
class Addition
{
   public static void main(String[] args)
{
   Scanner sc= new Scanner(System.in);
   int a,b;
   System.out.println("Enter the first numbers.......:");
   a=sc.nextInt();
   System.out.println("Enter the second numbers.......:");
   b=sc.nextInt();
   System.out.println("Addition: "+(a+b));
   System.out.println("Subtraction: "+(a-b));
   System.out.println("Multiplication: "+(a*b));
   System.out.println("division: "+(a/b));
   System.out.println("Module: "+(a%b));
}
}