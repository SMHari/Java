
package test;

import java.util.Scanner;


public class array {
    public static void main(String args[]){
        int a[],i;
        System.out.println("Enter the array size");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        a=new int[n];
        System.out.println("Enter the elements one by one:");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int max=a[0];
        int min=a[0];
        for(i=0;i<n;i++)
        {
            if(max<a[i])
            {
                max=a[i];
            }
            if(min>a[i])
            {
                min=a[i];
            }
        }
    System.out.println("Max:"+max+"min:"+min);
    }
}
