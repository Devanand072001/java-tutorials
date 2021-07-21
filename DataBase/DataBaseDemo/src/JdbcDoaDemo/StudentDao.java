package JdbcDoaDemo;

import java.sql.*;

public class StudentDao {
    String url = "jdbc:mysql://localhost:3306/students";
    String userName = "root";
    String userPassword = "root";
    Connection connection = DriverManager.getConnection(url, userName, userPassword);


    public StudentDao() throws SQLException {
    }

    public Student getStudent(int sRollNo) throws SQLException {
        Student student = new Student();
        student.sRollNo = sRollNo;

        String getQuery = "select sname from student where rollno =" + sRollNo;
        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery(getQuery);
        result.next();
        String name;
        name = result.getString(1);
        student.sName = name;

        return student;
    }

    public void addStudent(int rollno , String name) throws SQLException {
        Student insertStudent = new Student();
        insertStudent.sName = name;
        insertStudent.sRollNo = rollno;
        String insertQuery = "insert into student values (?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
        preparedStatement.setInt(1, insertStudent.sRollNo);
        preparedStatement.setString(2, insertStudent.sName);
        preparedStatement.executeUpdate();
        System.out.println("Data updated successfully with:");
        System.out.println("Rollno\t\tName");
        System.out.println(insertStudent.sRollNo + "\t\t" + insertStudent.sName);
    }
}

