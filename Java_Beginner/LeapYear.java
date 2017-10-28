import java.util.*;
import java.lang.*;
import java.io.*;
public class LeapYear
{
	public static void main (String[] args) throws java.lang.Exception
	{
        int i;
        System.out.println("Leap years between 1900-2020 is:");
        for(i=1900;i<=2020;i++)
        {
            if((i%400==0)||(i%4==0 && i%100!=0))
            {
                System.out.println(i);
            }
        }
        
        }
}
