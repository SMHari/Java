import java.util.*;
/**
 *
 * @author Code_W!z
 */
public class Stringcmp {

   public void Compare(String s1,String s2){
      
      
       if(s1.equals(s2))
       {
           System.out.println("Strings are equal");
       }
       else
       {
           System.out.println("Strings are unequal");
       }
   
 }   
public static void main(String args[]){
    Stringcmp cmp=new Stringcmp();
     Scanner s=new Scanner(System.in);
      String s1,s2;
       s1=s.nextLine();
       s2=s.nextLine();
       cmp.Compare(s1, s2);
}
}
