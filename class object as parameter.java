//class objects as parameters in methods
class Farm
{
    double length;
    double width;
    Farm(double l,double w)
    {
        length=l;
        width=w;
    }
    void equals(Farm farm)
    {
        if(farm.length*farm.width==length*width)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}
class Main{
    public static void main(String Str[])
    {
        Farm farm1=new Farm(25,10);
        Farm farm2=new Farm(30,20);
        Farm farm3=new Farm(15,40);
        farm3.equals(farm1);
        farm3.equals(farm2);
        
    }
}