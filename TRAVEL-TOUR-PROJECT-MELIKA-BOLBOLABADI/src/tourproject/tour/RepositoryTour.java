package tourproject.tour;

        import java.sql.Connection;
        import java.sql.DriverManager;
        import java.sql.SQLException;
        import java.sql.Statement;

public class RepositoryTour {

    protected static Connection connection;
    protected static Statement statement;

    public RepositoryTour() {
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

    public  static void insertTour(EntityTour entity)
    {

        String inserttxt = "INSERT INTO `tours`(`code`, `name`,`range`,`vehicle`,`people`,`totalpayment`,`manager`,`hotelname`,`places`) VALUES ('" + entity.getCode() + "','" + entity.getName() + "','" + entity.getRange()+ "','" +entity.getVehicle()+ "','" +entity.getPeople()+ "','" +entity.getPayment()+"','" +entity.getManager()+"','" +entity.getHotelName()+"','" +entity.getPlaces()+"')";
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

    public static void updateTour(EntityTour entity)
    {
        deleteTour(entity.getCode());
        insertTour(entity);
    }

    public static void deleteTour(long code)
    {
        String deletetxt = "DELETE FROM `tours` WHERE `code`=" + code;
        try
        {
            statement.execute(deletetxt);
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }


}
