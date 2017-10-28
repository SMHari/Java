import java.util.*;
import java.lang.*;
import java.io.*;
class CheckHitFlop
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
      int DaysInTheatre;
      System.out.println("Enter the num.of days:");
      Scanner s=new Scanner(System.in);
      DaysInTheatre=s.nextInt();
      if(DaysInTheatre >= 50)
      {
      System.out.println("Box Office Hit");
      }
      else
      {
      System.out.println("Flop");
      }
	}
}
