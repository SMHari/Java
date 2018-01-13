/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;

/**
 *
 * @author Code_W!z
 */
public class Stringpoly {

   
    String finalval;
    Object a;
   public void setdata(int a){
       
       System.out.println("inside int");
       this.a = a;
   }
   public void setdata(double a){
       System.out.println("inside double");
       this.a =  a;
   }
   public void setdata(float a){
       System.out.println("inside float");
       this.a = a;
   }
   
   public String storetostring(){
       
       String finalval=String.valueOf(a);
       System.out.println("Final value is:"+finalval);
       return finalval;
   }
   
    public static void main(String args[]){
        Stringpoly sp=new Stringpoly();
        sp.setdata(5);
        sp.storetostring();
        sp.setdata(10.13131231);
        sp.storetostring();
        sp.setdata(2.5);
        sp.storetostring();

    }
}
