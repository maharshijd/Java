package day3;

class day3_q5 {

    int rollNo;
    String name;

    day3_q5(int r, String n) {
        rollNo = r;
        name = n;
    }

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        day3_q5 s1 = new day3_q5(101, "Amit");
        s1.display();
    }
}

