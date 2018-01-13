package examples;
import java.util.*;
import java.lang.*;
import java.io.*;


enum zip{
    Dc3211("Washington DC"),Me4321("Mexico"),Ca4311("California");
    private String cityname;
    private zip(String c){
cityname=c;
}
public String getcity(){
    return cityname;
}}
public class enums{
    public static void main(String args[])
    {
    System.out.println(zip.Dc3211.getcity());
    System.out.println(zip.Me4321.getcity());
    System.out.println(zip.Ca4311.getcity());
    }
}


