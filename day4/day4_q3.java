package day4;

class A {
    int x = 10;
}

class B {
    int y = 20;
}

class day4_q3 {
    int z = 30;

    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();
        day4_q3 obj3 = new day4_q3();
        System.out.println("Value of x = " + obj1.x);
        System.out.println("Value of y = " + obj2.y);
        System.out.println("Value of z = " + obj3.z);
    }
}

