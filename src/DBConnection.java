
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author naingminkhant
 */
public class DBConnection {

    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;
    PreparedStatement preparedStatement = null;

    private final String url = "jdbc:mysql://localhost:3306/RepairDB";
    private final String driver = "com.mysql.jdbc.Driver";
    private final String username = "nmk";
    private final String password = "123456";

    public DBConnection() {
        try {
            connection = DriverManager.getConnection(url, username, password);
            statement = connection.createStatement();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

}
