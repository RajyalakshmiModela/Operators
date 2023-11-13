class Product
{
   public static void main(String[] args)
{
   String product_name= "tops";
   String product_id= "19nf1a0467";
   double product_price= 700;
   double product_quality= 2;
   double total_price= product_price*product_quality;
   System.out.println("total_price= "+total_price);
   double product_discount= (15.0/100)* product_price;
   System.out.println("product_discount= "+product_discount);
   double bank_offer= (7.0/100)* product_price;
   System.out.println("bank_offer= "+bank_offer);
   double gst=(4.0/100)* product_price;
   System.out.println("gst= "+gst);
   double final_price=total_price-product_discount-bank_offer+gst;
   System.out.println("final_price= "+final_price);
}
}

