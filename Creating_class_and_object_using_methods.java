//initialising using initialising through method
class Student{
    int rollno;
    String name;
    void insertRecord(int r,String n)
    {
        rollno=r;
        name=n;
    }
    void displayInformation()
    {
        System.out.println(rollno+" "+name);
        
    } 
}
class Main{
    public static void main(String args[])
    {
        Student s1=new Student();
        Student s2=new Student();
        s1.insertRecord(01,"Risha");
        s2.insertRecord(02,"Neel");
        s1.displayInformation();
        s2.displayInformation();
        
    }
}