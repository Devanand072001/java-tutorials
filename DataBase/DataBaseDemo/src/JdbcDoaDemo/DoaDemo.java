package JdbcDoaDemo;

import java.sql.SQLException;
import java.util.Scanner;

public class DoaDemo {
    public static void main(String[] args) throws SQLException {
        StudentDao studentDao = new StudentDao();
        //get values

        Student student1 = studentDao.getStudent(1);
        Student student2 = studentDao.getStudent(5);
        System.out.println(student1.sName);
        System.out.println(student2.sName);

        //insert values

        Student student3 = new Student();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student rollno: ");
        int rollno = scanner.nextInt();

        System.out.println("Enter student name: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        studentDao.addStudent(rollno, name);

        scanner.close();
    }
}