import java.util.Scanner;
public class currentversion
{
   public static void main(String[] args)
{
   Scanner sc=new Scanner (System.in);
   String a;
   System.out.println("Enter the value");
   a=sc.next();
switch(a)
{
case "java":System.out.println("current versionis 17.0");
            break;
case "python":System.out.println("current version 12.0");
             break;
case "c":System.out.println("current version 18.0");
        break;
default:System.out.println("invalid");
       break;
}
}
}