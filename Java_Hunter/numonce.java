import java.util.*;
import java.lang.*;
import java.io.*;
package examples;


public class numonce {
    public static int numarronce(int a[]){
        int r=0;
        for(int i=0;i<a.length;i++){
            r=r^a[i];
        }
        return r;
        
    }
    public static void main(String args[]){
        int a[]={2,4,6,8,10,2,4,8,10};
        
        System.out.println(numarronce(a));
}
}
