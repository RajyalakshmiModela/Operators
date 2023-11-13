class Employeeapplication
{
   public static void main(String[] args)
{
   String name= "vk";
   int id= 7;
   int esalary= 32000;
   int workingdays= 31;
   int eleavedays= 7;
   double edaywise_salary=esalary/workingdays;
   System.out.println("edaywise_salary= "+edaywise_salary);
   int etotal_workingdays=workingdays-eleavedays;
   System.out.println("etotal_workingdays= "+etotal_workingdays);
   double salary= edaywise_salary*etotal_workingdays;
   System.out.println("salary= "+salary);
}
}
   
   
   
   
   