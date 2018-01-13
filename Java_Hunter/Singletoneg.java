package examples;
class Singletoneg
{
       private static Singletoneg single_instance = null;
 
    public String s;

    private Singletoneg()
    {
        s = "Hello I'm Hari from ACCET";
    }
 
    // static method to create instance of Singleton class
    public static Singletoneg getInstance()
    {
        if (single_instance == null)
            single_instance = new Singletoneg();
 
        return single_instance;
    }
}
class Main
{
    public static void main(String args[])
    {
        // instantiating Singleton class with variable x
        Singletoneg x = Singletoneg.getInstance();
        x.s = (x.s).toUpperCase();
        System.out.println("String from x is " + x.s);
        
    }
}
