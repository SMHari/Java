package examples;

/**
 *
 * @author Code_W!z
 */
public class stringinherit {
    static double number_send=10;
    public static void main(String args[]){
        System.out.println("In parent class and the value in double is :"+number_send);
    }
}

/**
 *
 * @author Code_W!z
 */

public class numberstring extends stringinherit{
        public void printnum(){
             System.out.println("Value from parent class and converted to string:"+Double.toString(number_send));
        }
    public static void main(String args[]){
        numberstring n=new numberstring();
        System.out.println("In sub class");
        n.printnum();
    }
}
  
