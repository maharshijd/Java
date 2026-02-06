package day6;

abstract class Calc
{
    abstract int add(int a, int b);
    abstract int sub(int a, int b);
    abstract int mul(int a, int b);
    abstract int div(int a, int b);
}

class A extends Calc
{
    int add(int a, int b)
    {
        return a + b;
    }

    int sub(int a, int b)
    {
        return a - b;
    }

    int mul(int a, int b)
    {
        return a * b;
    }

    int div(int a, int b)
    {
        return a / b;
    }
}

public class day6_q2
{
    public static void main(String[] args)
    {
        Calc c = new A();

        System.out.println(c.add(10, 5));
        System.out.println(c.sub(10, 5));
        System.out.println(c.mul(10, 5));
        System.out.println(c.div(10, 5));
    }
}

