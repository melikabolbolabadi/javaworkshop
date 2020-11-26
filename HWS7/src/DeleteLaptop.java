import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteLaptop
{
    public DeleteLaptop() throws Exception
    {
        Scanner scanner=new Scanner(System.in);
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection connection= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","melikabolbolabadi","melika");
        System.out.println("enter id of laptop which you want delete : ");
        int m=scanner.nextInt();
              PreparedStatement preparedStatement=connection.prepareStatement("delete from laptop where id=?");
            preparedStatement.setInt(1,m);
          preparedStatement.executeUpdate();
         preparedStatement.close();
    }
}
