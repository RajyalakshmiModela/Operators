import java.util.Scanner;
class season
{
   public static void main(String[] args)
{
   Scanner sc=new Scanner(System.in);
   int season= 7;
switch(season)
{
case 3:
case 4:
case 5:System.out.println("Spring");
       break;
case 6:
case 7:
case 8:System.out.println("summer");
       break;
case 9:
case 10:
case 11:System.out.println("fall");
       break;
case 12:
case 1:
case 2:System.out.println("winter");
       break;
default:System.out.println("invalid");
}
}
}
         