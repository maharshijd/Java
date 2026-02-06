package day6;

interface A
{
    void show();
}

interface B extends A
{
    default void show()
    {
        System.out.println("B");
    }
}

interface C extends A
{
    default void show()
    {
        System.out.println("C");
    }
}

class D implements B, C
{
    public void show()
    {
        B.super.show();
        C.super.show();
    }
}

public class day6_q3
{
    public static void main(String[] args)
    {
        D d = new D();
        d.show();
    }
}

