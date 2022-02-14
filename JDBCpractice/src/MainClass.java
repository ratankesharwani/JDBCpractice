import java.sql.*;
public class MainClass {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // DAO data access object;
        String URL = "jdbc:mysql://localhost:3306/testing";
        String userName = "ratan";
        String passWord = "Ratan@1234";
        int id =132;
        String address ="naini";
        String firstName ="Rajan";
        String  MiddleName = "Kumar";
        String lastName = "Kesharwani";
        String Mo_no = " 3456784567" ;
        String query = "insert into employee values(?,?,?,?,?,?)";
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection(URL, userName, passWord);
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1,id);
        preparedStatement.setString(2,address);
        preparedStatement.setString(3,firstName);
        preparedStatement.setString(4,MiddleName);
        preparedStatement.setString(5,lastName);
        preparedStatement.setString(6,Mo_no);
//        ResultSet resultSet = statement.executeQuery(query);
        int resultSet = preparedStatement.executeUpdate();

//        String userData;
//        while (resultSet.next()) {
//            userData = resultSet.getString(1) + ":" + resultSet.getString(2);
//            System.out.println(userData);
//
//        }

        System.out.println(resultSet+"rows effected");
        preparedStatement.close();
        connection.close();
    }
}