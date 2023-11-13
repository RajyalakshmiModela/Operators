import java.util.Scanner;
class grade
{
   public static void main(String[] args)
{
   Scanner sc=new Scanner(System.in);
   char grade='B';
switch(grade)
{
case 'A':System.out.println("above 80");
         System.out.println("excellent");
         break;
case 'B':System.out.println("above 60");
         System.out.println("verygood");
         break;
case 'C':System.out.println("above 50");
         System.out.println("good");
         break;
case 'D':System.out.println("above 40");
         System.out.println("average");
         break;
default:System.out.println("fail");
}
}
}
         