//interface eg
interface stringinter{
    void print();
    void show();
    
}
public class StringInterface implements stringinter {

    @Override
    public void show() {
         System.out.println("inside show implementation part in main class");
    }
    @Override
    public void print() {
       System.out.println("inside print implementation part in main class");
    }
    public static void main(String args[]){
        StringInterface st=new StringInterface();
        st.print();
        st.show();
    }
}

//abstract rg
abstract class abclasseg {
    void print(){
        System.out.println("Inside abstract class with print method defined");
    }
    abstract void show();
}
public class abstractclass extends abclasseg{
    
    @Override
    void show() {
        System.out.println("Inside show method of abstract class but implemented separately ");
    }

 
    public static void main(String args[]){
        abstractclass abc=new abstractclass();
        abc.print();
        abc.show();
        
    }
}
