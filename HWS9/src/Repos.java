import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Repos
{
    protected static  Connection connection;
    protected static Statement statement;

    public Repos() throws Exception
    {
        DBConnection();
    }

    public static void DBConnection()
    {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/product", "root", "melikabolbolabadi");
            statement = (Statement) connection.createStatement();
            System.out.println("its ok");

        } catch (Exception e) {
            System.out.println(e.getMessage() );
            e.printStackTrace();
        }
    }

    public  static void insert(Entity entity)
    {
        String sqlinsert = "INSERT INTO `product`(`code`, `name`,`gender`,`color`,`price`) VALUES ('" + entity.getCode() + "','" + entity.getName() + "','" + entity.getGender()+ "','" +entity.getColor()+ "','" +entity.getPrice()+"')";
        try {
            statement.execute(sqlinsert);
        } catch (SQLException e) {
            System.out.println(e.getMessage() + " its ok ");
            e.printStackTrace();
        }

    }

    public static void update(Entity entity)
    {
        delete(entity.getCode());
        insert(entity);
    }

    public static void delete(int code)
    {
        String sqldelete = "DELETE FROM `peoples` WHERE `code`=" + code;
        try {
            statement.execute(sqldelete);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
