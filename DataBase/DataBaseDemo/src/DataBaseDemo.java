import java.sql.*;
import java.util.Scanner;

public class DataBaseDemo {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/students";
        String userName = "root";
        String userPassword = "root";
        String getValueQuery = "select sname from student where rollno = 1";

       /* Class.forName("com.mysql.jdbc.Driver"); //this is unnecessary, the driver is registered automatically*/
        Connection connection = DriverManager.getConnection(url, userName, userPassword);
        System.out.println("data base connected successfully");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(getValueQuery);
        resultSet.next();
        System.out.println(resultSet.getString("sname"));


        ResultSet resultSet1 = statement.executeQuery("select * from student");
        resultSet1.next();
        System.out.println("get values by column label:");
        //get by column label
        System.out.println(resultSet1.getInt("rollno") + ": " + resultSet1.getString("sname"));

        ResultSet wholeResult = statement.executeQuery("select * from student");
        System.out.println("getting values by column index:");
        while (wholeResult.next()) {
            //get by column index
            String studentData = wholeResult.getInt(1) + " : " + wholeResult.getString(2);
            System.out.println(studentData);
        }
        /*-------------- dynamic input -------------------------------------------*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter roll no: ");
        int inputRollNo = scanner.nextInt();

        System.out.println("Enter name: ");
        String inputName = scanner.next();
        System.out.println();

        String insertValueQuery = "insert into student values( ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(insertValueQuery);

        preparedStatement.setInt(1, inputRollNo);
        preparedStatement.setString(2, inputName);

        int updateCount = preparedStatement.executeUpdate();
        System.out.println(updateCount + "row/rows updated");

        scanner.close();
        statement.close();
        connection.close();

    }
}
