class Bankdetails
{
   public static void main(String[] args)
{
   String bank_name= "sbi";
   String person_name= "lakshmi";
   int bank_ifsc_code= 123456;
   double bank_balance= 45000;
   double bank_deposit= 2000;
   double bank_withdraw= 44567;
   double bank_current_balance=bank_balance+bank_deposit-bank_withdraw;
   System.out.println("bank_current_balance= "+bank_current_balance);
}
}
   
   
   
   