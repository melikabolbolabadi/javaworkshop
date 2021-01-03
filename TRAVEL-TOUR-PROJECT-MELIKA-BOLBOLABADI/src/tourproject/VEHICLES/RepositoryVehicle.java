
package tourproject.VEHICLES;
        import java.sql.Connection;
        import java.sql.DriverManager;
        import java.sql.SQLException;
        import java.sql.Statement;
public class RepositoryVehicle {

    protected static Connection connection;
    protected static Statement statement;

    public RepositoryVehicle() {
        Connect();
    }

    public static void Connect()
    {
        try
        {
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


    public void insertVehicle(EntityVehicle entity)
    {
        String inserttxt = "INSERT INTO `vehicles`(`code`, `name`,`property`) VALUES ('" + entity.getvCode() + "','" + entity.getvName() + "','" + entity.getvSpecifi()+"')";
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

    public void updateVehicle(EntityVehicle entity)
    {
        deleteVehicle(entity.getvCode());
        insertVehicle(entity);
    }

    public void deleteVehicle(int code)
    {
        String deletetxt = "DELETE FROM `vehicles` WHERE `code`=" + code;
        try {
            statement.execute(deletetxt);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }



}