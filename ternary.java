class ternary
{
   public static void main(String[] args)
{
   int num1=3,num2=7,num3=4;
   int result=(num1>num2)?(num1>num3? num1:num2):(num2>num3?num2:num3);   
   System.out.println("result= "+result);
}
}