//Accessing private data members
class Farm
{
    private double length;
    private double width;
    void setValues(double l,double w)
    {
        length=l;
        width=w;
    }
    double getLength(){return length;}
    double getWidth(){return width;}
    double area(){return length*width;}
}
class Main
{
    public static void main(String Str[])
    {
        Farm f1=new Farm();
        Farm f2=new Farm();
        f1.setValues(40,20);
        f2.setValues(24,15);
        System.out.println("Area of f1 = "+f1.area());
        System.out.println("Length of f1 = "+f1.getLength());
        System.out.println("Width of f1 = "+f1.getWidth());
        System.out.println("Area of f2 = "+f2.area());
    }
}