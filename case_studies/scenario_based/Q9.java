package case_studies.scenario_based;

class Countdown extends Thread {
    public void run() {
        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}

public class Q9 {
    public static void main(String[] args) {
        Countdown t = new Countdown();
        t.start();
    }
}
