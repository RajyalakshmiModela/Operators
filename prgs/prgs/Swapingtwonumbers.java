import java.util.Scanner;
class Swapingtwonumbers
{
   public static void
 main(String[] args);
{
   int a= 10;
   int b= 7;
   int c;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter first number:");
   a=sc.nextInt();
   System.out.println("Enter the second number:");
   b=sc.nextInt();
   System.out.println("before swaping");
   System.out.println(a+"  "+b); 
   c= a;//c=10
   a= b;//a=7
   b= c;//b=10
   System.out.println("after swaping");
   System.out.println(a+"  "+b);
   
}
}
   
   