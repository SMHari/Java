
package test;

import java.util.Scanner;

public class Sumarray {
    private int a[],b[],c[],i;
    
    public void addmatrix(){
        System.out.println("Enter the no.of elements in matrix 1 & 2");
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        a=new int[n1];
        b=new int[n1];
        System.out.println("Enter the matrix 1 elements");
        for(i=0;i<n1;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the matrix 2 elements");
        for(i=0;i<n1;i++){
            b[i]=sc.nextInt();
        }
        c=new int[n1];
         for(i=0;i<n1;i++){
            c[i]=a[i]+b[i];
        }
          for(i=0;i<n1;i++){
        System.out.println("The addition of two matrix is:"+c[i]);
          }
    }
   
    public static void main(String args[]){
        Sumarray s=new Sumarray();
        s.addmatrix();
    }
}
