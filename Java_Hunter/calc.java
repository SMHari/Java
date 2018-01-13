import java.util.*;
import java.lang.*;
import java.io.*;
package examples;


public class calc {
    static int a,b,c;
    
    public void add(int i,int j){
        c=a+b;
        System.out.println("a+b="+c);
    }
    public void sub(int i,int j){
        c=a-b;
        System.out.println("a-b="+c);
    }
    public void mul(int i,int j){
        c=a*b;
        System.out.println("a*b="+c);
    }
    public void div(int i,int j){
        
        c=a/b;
        System.out.println("a/b="+c);
    }
    public static void main(String args[])
    {
        calc c=new calc();
        a=5;
        b=3;
        System.out.println("a:"+a+"b:"+b);
        c.add(a,b);
        c.sub(a,b);
        c.mul(a,b);
        c.div(a,b);
    }
}
