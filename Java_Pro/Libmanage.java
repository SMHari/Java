/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;

import java.util.Scanner;

/**
 *
 * @author Code_W!z
 */
public class Libmanage {
 private static int book_no;
 private static String book_name;
 private static String author_name;
 private static boolean returned;
 public int getbookno(){
     return book_no;
 }
  public String getbookname(){
     return book_name;
 }
   public String getauthorname(){
     return author_name;
 }
    public Boolean getreturned(){
     return returned;
 }
    public void setbookno(int book_no){
        Libmanage.book_no=book_no;
    }
     public void setbookname(String book_name){
        Libmanage.book_name=book_name;
    }
       public void setauthorname(String author_name){
        Libmanage.author_name=author_name;
    }
       public void setreturned(boolean returned){
        Libmanage.returned=returned;
    }
 public void printdetails(){
    System.out.println("Book details are as follows");
    System.out.println("Book no:"+book_no);
    System.out.println("Book name:"+book_name);
    System.out.println("Author name:"+author_name);
    System.out.println("Return status:"+returned);
 }
 public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     Libmanage lb=new Libmanage();
     System.out.println("Enter Book no");
     book_no=sc.nextInt();
     System.out.println("Enter Book name:");
     book_name=sc.next();
      System.out.println("Enter Author name:");
     author_name=sc.next();
      System.out.println("Whether book returned or not(true/false):");
     returned=sc.nextBoolean();
     lb.getbookno();
     lb.getbookname();
     lb.getauthorname();
     lb.getreturned();
     lb.setbookno(book_no);
     lb.setbookname(book_name);
     lb.setauthorname(author_name);
     lb.setreturned(returned);
     lb.printdetails();
 }
}
