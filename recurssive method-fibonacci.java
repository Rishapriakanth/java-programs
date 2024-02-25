//recurrsive method-Fibonacci numbers
class Fib
{
    int fibonacci(int n)
    {
        if(n==0 ||n<2)
        {
            return n;
        }
        else
        {
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }
}
class Main 
{
    public static void main(String Str[])
    {
        
        Fib fibo=new Fib();
        for (int i=0; i<10; i++)
        {
            System.out.println(fibo.fibonacci(i)+"   ");
            
        }
    }
}
