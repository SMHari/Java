
package examples;

public class person {
   private String name;
   private String idNum;
   private int age;

   public int getAge() {
      return age;
   }

   public String getName() {
      return name;
   }

   public String getIdNum() {
      return idNum;
   }

   public void setAge( int newAge) {
      age = newAge;
   }

   public void setName(String newName) {
      name = newName;
   }

   public void setIdNum( String newId) {
      idNum = newId;
   }

 
   public static void main(String args[]) {
      person p = new person();
      p.setName("Hari");
      p.setAge(20);
      p.setIdNum("12");

      System.out.print("Name : " + p.getName() + " Age : " + p.getAge()+" Id num : "+p.idNum);
   }
}
