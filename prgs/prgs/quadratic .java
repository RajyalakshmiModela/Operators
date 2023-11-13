class duadratic
{
    public static void main(String[] args)
{
    double a,b,c;
    double root1,root2;
    System.out.println("the value of a,b and c:");
    a=sc.nextDouble;
    b=sc.nextDouble;
    c=sc.nextDouble    
    double determinite d=(b*b)-4*a*c;/d=Math.pow(b,2)-4*a*c;
if(d==0)
{
    System.out.println("roota are real and equal");
    root1=root2=-b/2.0*a;
    System.out.println("root1= "+root1);
    System.out.println("root2= "+root2);
}
else if(d>=0)
{
    System.out.println("roots are real and distinct");
    root1=-b+Math.sqrt(d)/2.0*a;
    root2=-b-Math.sqrt(d)/2.0*a;
    System.out.println("root1= "+root1);
    System.out.println("root2  "+root2);
}
else
{
    System.out.println("roots are distinct and imaginary
    root1 =-b/2.0*a;
    root2 =Math.sqrt(-d);
    System.out.println("root1= "+root1);
    System.out.println("root2= "+root2);
}
}
}
    
   