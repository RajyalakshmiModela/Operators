import java.util.Scanner;
public class age
{
   public static void main(String[] args)
{
   Scanner sc=new Scanner(System.in);
   int age=21;
switch(age)
{
case 10:System.out.println("you are children");
        break;
case 18:System.out.println("you are eligible to marry");
        break;
case 65:System.out.println("you are over age");
          break;
default:System.out.println("invvalid");
       break;
}
}
}