package opps;

public class Classes_Object {

    public static void main(String[] args) {

//        student s1 = new student();
//        s1.name = "manmohan";
//        s1.Password = "abc";
//        s1.rollNo= 45;

//
//        student s2 = new student(s1);
//        s1.name = "rahul";
//        s2.Password = "password";
//        System.out.println(s2.rollNo);
//        System.out.println(s2.name);
//        System.out.println(s2.Password);

         student.rollNo = 323;
         student.Password = "abc";
         student.setName();
        System.out.println(student.name);
        System.out.println(student.Password);

}
}
class student{
   static String name;
    static int rollNo;
   static String Password;


   public static void setName(){
       System.out.println("set name what you want :");
   }

    // --- non parameterized constructor ----
    student(){
        System.out.println("Non parameterized constructor");

    }

    // ---- parameterized constructor ---
    student(String name){
        this.name = name;
    }

    // --- copy constructor ----
    student(student s1){
        this.name = s1.name;
        this.rollNo = s1.rollNo;
        this.Password = s1.Password;
    }

}