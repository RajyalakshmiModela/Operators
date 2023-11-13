import java.util.Scanner;
public class calculator
{
    public static void main(String[] args)
{
    Scanner sc= new Scanner(System.in);
    int num1;
    System.out.println("Enter the first number");
    num1=sc.nextInt();
    int num2;
    System.out.println("Enter the second number");
   num2=sc.nextInt();
   char operator;
   System.out.println("Enter the operator");
   
switch(operator)
{
case '+':System.out.println("addition operator is: "+(num1+num2));
        break;
case '-':System.out.println("subtraction operator is: "+(num1-num2));
          break;
case '*':System.out.println("multiplication operator is: "+(num1*num2));
         break;
case '/':System.out.println("divide operator is: "+(num1/num2));
        break;
case '%':System.out.println("division operator is: "+(num1%num2));
         break;
default:System.out.println("invalid");
}
}
}