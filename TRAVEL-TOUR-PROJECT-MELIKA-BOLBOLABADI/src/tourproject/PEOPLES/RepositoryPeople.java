package tourproject.PEOPLES;

        import java.sql.Connection;
        import java.sql.DriverManager;
        import java.sql.SQLException;
        import java.sql.Statement;

public class RepositoryPeople {

    protected static Connection connection;
    protected static Statement statement;

    public RepositoryPeople() {
        Connect();
    }

    public static void Connect()
    {
        try
        {
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


    public static void insertPerson(EntityPeople entity)
    {
        String inserttxt = "INSERT INTO `peoples`(`codemelli`, `fullname`,`phone`,`address`,`tourcode`) VALUES ('" + entity.getCode() + "','" + entity.getFullName() + "','" + entity.getPhone() + "','" + entity.getAddress() + "','" + entity.getTourCode() + "')";
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


    public static void updatePerson(EntityPeople entity)
    {
        deletePerson(entity.getCode());
        insertPerson(entity);
    }

    public static void deletePerson(long codemelli)
    {
        String deletetxt = "DELETE FROM `peoples` WHERE `code`=" + codemelli;
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
