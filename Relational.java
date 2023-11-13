import java.util.Scanner;
class Relational
{
   public static void main(String[] args)
{
   Scanner sc= new Scanner(System.in);
   int a,b;
   System.out.println("Enter the first numbers.......:");
   a=sc.nextInt();
   System.out.println("Enter the second numbers.......:");
   b=sc.nextInt();
   System.out.println("greaterthan: "+(a>b));
   System.out.println("lessthan: "+(a<b));
   System.out.println("eualtoequal: "+(a==b));
   System.out.println("notequal: "+(a!=b));
   System.out.println("greaterthanequal: "+(a>=b));
 System.out.println("lessthanequal: "+(a<=b));
}
}