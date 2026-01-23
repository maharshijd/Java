package day3;

class day3_q4 {

    static String college = "ABC Engineering College";
    int rollNo;
    String name;

   day3_q4(int r, String n) {
        rollNo = r;
        name = n;
    }

    // static method
    static void showCollege() {
        System.out.println("College Name: " + college);
    }

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        day3_q4 s1 = new day3_q4(101, "Rahul");

        day3_q4.showCollege();
        s1.display();   
    }
}

