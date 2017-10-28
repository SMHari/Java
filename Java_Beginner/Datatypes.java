import java.util.*;
import java.lang.*;
import java.io.*;
public class Datatypes
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
     Scanner s=new Scanner(System.in);
     String name=s.nextLine();
     String city=s.nextLine();
     byte age=s.nextByte();
     float height=s.nextFloat();
     boolean married=s.nextBoolean();
      String sex=s.next();
     int pop=s.nextInt();
      System.out.println("Name:"+name+"\nCity:"+city+"\nAge:"+age+"\nHeight:"+height+"\nMarried:"+married+"\nSex:"+sex+"\nCity Population:"+pop);
	}
}
