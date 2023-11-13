class Agecalculation
{
   public static void main(String[] args)
{
   String name= "rt";
   int previous_year= 2001;
   int present_year= 2023;
   int age= present_year-previous_year;
   System.out.println("age= "+age);
   int total_days= 365;
   total_days= age*365;
   System.out.println("total_days= "+total_days);
   int months= 12;
   months= total_days*months;
   System.out.println("months= "+months);
   int hours= 24;
   hours=months*hours;
   System.out.println("hours= "+hours);
   int weeks= 7;
   weeks= hours*weeks;
   System.out.println("weeks= "+weeks);
   int minutes= 60;
   minutes= minutes*weeks;
   System.out.println("minutes= "+minutes);
   int seconds= 60;
   seconds=seconds*minutes;
   System.out.println("seconds= "+seconds);
}
}

    
     

