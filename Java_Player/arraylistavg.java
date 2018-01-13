
package examples;

import java.util.ArrayList;


public class arraylistavg {
    public static void main(String args[]){
        int i;
        ArrayList<Integer> a=new ArrayList();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        int sum=0;
        int n= a.size();
        for(i=0;i<n;i++){
            sum=sum+a.get(i);
         }
        int avg=sum/n;
        System.out.println("Avg is :"+avg);
    }
}
