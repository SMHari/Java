import java.util.*;
import java.lang.*;
import java.io.*;
class GenerateCoupon
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
      double amount;
      System.out.println("Purchased Amount: Rs. ");
      Scanner s=new Scanner(System.in);
      amount=s.nextDouble();
     if(amount>=20000)
      {
          System.out.println("Free Trolley Suitcase ");
      }
      else if((amount>=10000)&&(amount<20000))
      {
          System.out.println("Free Travel Bag");
      }
       else if((amount>=5000)&&(amount<10000))
      {
          System.out.println("Free BackPck");
      }
        else
       {
          System.out.println("Collect money even for cover we give"); 
       }}
} 
