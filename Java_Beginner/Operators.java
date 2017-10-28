import java.util.*;
import java.lang.*;
import java.io.*;
public class Operators
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner s=new Scanner(System.in);
        int a,b,c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14;
        boolean c15,c16,c17;
        a=s.nextInt();
        b=s.nextInt();
        c1=a+b;
        c2=a-b;
        c3=a*b;
        c4=b/a;
        c5=b%a;
        c6=b++;
        c7=b--;
        c8=a&b;
        c9=a|b;
        c10=a^b;
        c11=~a;
        c12=a<<2;
        c13=a>>2;
        c14=a>>>2;
        
        c15=(a>=0)&&(b>=0);
        c16=(a>=0)||(b<=0);
        c17=!(a>0)&&(b>1);
       System.out.println("Values are:");
       System.out.println(c1+"\n"+c2+"\n"+c3+"\n"+c4+"\n"+c5+"\n"+c6+"\n"+c7+"\n"+c8+"\n"+c9+"\n"+c10+"\n"+c11+"\n"+c12+"\n"+c13+"\n"+c14+"\n"+c15+"\n"+c16+"\n"+c17);
        
        }
}
