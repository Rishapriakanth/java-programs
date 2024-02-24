//initialising using reference
class Student{
    int id;
    String name;
}
class Main{
    public static void main(String args[])
    {
        Student s1=new Student();
        Student s2=new Student();
        s1.id=01;
        s1.name="Risha";
        s2.id=02;
        s2.name="Neel";
        System.out.println(s1.id+" "+s1.name);
        System.out.println(s2.id+" "+s2.name);
    }
}