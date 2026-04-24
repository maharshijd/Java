package case_studies.scenario_based;
import java.sql.*;
import java.util.Scanner;


public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter roll number: ");
        int roll = sc.nextInt();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/student_details", "root", "jvmd1331");

            PreparedStatement ps = con.prepareStatement(
                    "select * from Student where rollno = ?");
            ps.setInt(1, roll);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                System.out.println("Roll No: " + rs.getInt("rollno"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Marks: " + rs.getInt("marks"));
            } else {
                System.out.println("No student found");
            }

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
