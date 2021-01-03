package tourproject.HOTEL;

        import java.sql.Connection;
        import java.sql.DriverManager;
        import java.sql.PreparedStatement;
        import java.sql.SQLException;
        import java.sql.Statement;

public class RepositoryHotel {
    protected static Connection connection;
    protected static Statement statement;

    public RepositoryHotel() {
        Connect();
    }

    public static void Connect()
    {
        try {
            //Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/traveltour", "root", "melikabolbolabadi");
            statement = (Statement) connection.createStatement();
            System.out.println("_D_D_D_D_D_");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage() + "_*_*_*_*_");
            e.printStackTrace();
        }
    }


    public static void insertHotel(EntityHotel entity)
    {
        String inserttxt = "INSERT INTO `hotels`(`code`, `name`,`address`,`phone`,`facilities`,`payment`) VALUES ('" + entity.gethCode() + "','" + entity.gethName() + "','" + entity.gethAddress() + "','" + entity.gethNumber() + "','" + entity.gethPossibl() + "','" + entity.gethPrice() + "')";
        try
        {
            statement.execute(inserttxt);
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage() + "_*_*_*_*_");
            e.printStackTrace();
        }
    }


    public static void updateHotel(EntityHotel entity)
    {
        deleteHotel(entity.gethCode());
        insertHotel(entity);
    }

    public static void deleteHotel(int code) {
        String deletetxt = "DELETE FROM `hotels` WHERE `code`=" + code;
        try
        {
            statement.execute(deletetxt);
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage() + "_*_*_*_*_");
        }
    }
}