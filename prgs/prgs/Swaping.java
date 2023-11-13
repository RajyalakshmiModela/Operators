class Swaping
{
   public static void main(String[] args)
{
   int x=2,y=6;
   System.out.println("beforeswaping");
   System.out.println(x+"  "+y);
   x=x^y;
   y=x^y;
   x=x^y;
   System.out.println("afterswaping");
   System.out.println(x+"  "+y);
}
}
