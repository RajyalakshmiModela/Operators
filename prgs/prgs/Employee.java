class Employee 
{
   public static void main(String[] args)
{
   String employee_name= "rs";
   String employee_id= "19nf1a0467";
   int employee_basic_salary= 50000;
   double special_allowances;
   double travelling_allowances= 15.0/100*employee_basic_salary;
   double dearness_allowances= 10.0/100*employee_basic_salary;
   double house_rental_allowances= 20.0/1000*employee_basic_salary;
   System.out.println("travelling_allowances= "+travelling_allowances);
   System.out.println("dearness_allowances= "+dearness_allowances);
   System.out.println("house_rental_allowances="+house_rental_allowances);
   double bonus= 917;
   double tax= 12.0/100*employee_basic_salary;
   System.out.println("tax= "+tax);
   double gross_salary= employee_basic_salary+travelling_allowances+dearness_allowances+house_rental_allowances+bonus+tax;
   System.out.println("gross_salary= "+gross_salary);
   double providental_fund= 18.0/100*employee_basic_salary;
   System.out.println("providental_fund= "+providental_fund);
   double total_salary=gross_salary-providental_fund;
   System.out.println("total_salary= "+total_salary);   
   
}
}
   
   

