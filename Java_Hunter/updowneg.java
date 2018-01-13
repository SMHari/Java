package examples;

/**
 *
 * @author Code_W!z
 */
//upcasting:int -> long, float, double
public class updowneg {
    public static void main(String args[]){
        int a=10;
        long b=a;
        float c=b;
        double d=c;
        System.out.println("\nInteger:"+a+"\nlong:"+b+"\nfloat:"+c+"\ndouble:"+d);
    }
}


//downcasting
package examples;

/**
 *
 * @author Code_W!z
 */
//downcasting:double -> byte, short, char, int, long, float 
public class updowneg {
    public static void main(String args[]){
        double a=100;
        long b= (long)a;
        float c= (float)b;
        int d=(int) c;
        System.out.println("\ndouble:"+a+"\nlong:"+b+"\nfloat:"+c+"\nInteger:"+d);
    }
}
