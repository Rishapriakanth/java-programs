//static variable
class Student{  
   int rollno;  
   String name;  
   static String college ="VIT"; 
   //constructor  
   Student(int r, String n)
   {  
   rollno = r;  
   name = n;  
   }  
   
   
   void display ()
   {
       System.out.println(rollno+" "+name+" "+college);
       
   }  
}  

 
public class Main{  
 public static void main(String args[]){  
 Student s1 = new Student(1,"Risha");  
 Student s2 = new Student(2,"Neel");  
 s1.display();  
 s2.display();  
 }  
}  