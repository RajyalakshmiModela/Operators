class Implicittypecasting
{
   public static void main(String[] args)
{
   int a= 3;
   char b= 'a';
   a= (char)b;
   System.out.println("a= "+a);
   int c=6;
   double d= 44.2;
   d=(int)d;
   System.out.println("d= "+d);
   float e =33.2f;
   char f ='a';
   e=(char)a;
   System.out.println("e= "+e);
   float g= 44.3f;
   double h= 23.7;
   h=(float)g;
   g=(float)g;
   System.out.println("h= "+h);
   System.out.println("g= "+g);
   short i= 7;
   double j=33.7;
   j=(short)i;
   System.out.println("j= "+j);
   int x=257;
   byte y;
   y= (byte)x;
   System.out.println("y= "+y);
   
   
   
   
   

   
   
   
   
   
   
}
}