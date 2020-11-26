import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateLaptop
{
    Scanner scanner=new Scanner(System.in);

    public UpdateLaptop() throws Exception
    {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection connection= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","melikabolbolabadi","melika");
        System.out.println("enter id of laptop which you want update : ");
        int m=scanner.nextInt();
        System.out.println("which parameter do you wanna update?\n1.name  2.price  3.ram  4.weight  5.inch : ");
        int h=scanner.nextInt();

        switch (h)
        {
            case 1:
                System.out.println("enter a name you want update to: ");
                String updatename=scanner.nextLine();
                PreparedStatement preparedStatement=connection.prepareStatement("update laptop set name=? where id=?");
                preparedStatement.setString(1,updatename);
                preparedStatement.setInt(2,m);
                preparedStatement.executeUpdate();
                break;

            case 2:
                System.out.println("enter a price you want update to: ");
                long updateprice=scanner.nextLong();
                preparedStatement = connection.prepareStatement("update laptop set price=? where id=?");
                preparedStatement.setLong(1,updateprice);
                preparedStatement.setInt(2,m);
                preparedStatement.executeUpdate();
                break;
            case 3:
                System.out.println("enter a ram you want update to: ");
                int updateram=scanner.nextInt();
                preparedStatement = connection.prepareStatement("update laptop set ram=? where id=?");
                preparedStatement.setInt(1,updateram);
                preparedStatement.setInt(2,m);
                preparedStatement.executeUpdate();
                break;
            case 4:
                System.out.println("enter a weight you want update to: ");
                double updateweight=scanner.nextDouble();
                preparedStatement = connection.prepareStatement("update laptop set weight=? where id=?");
                preparedStatement.setDouble(1,updateweight);
                preparedStatement.setInt(2,m);
                preparedStatement.executeUpdate();
                break;
            case 5:
                System.out.println("enter a inch you want update to: ");
                double updateinch=scanner.nextDouble();
                preparedStatement = connection.prepareStatement("update laptop set inch=? where id=?");
                preparedStatement.setDouble(1,updateinch);
                preparedStatement.setInt(2,m);
                preparedStatement.executeUpdate();
                break;
        }
    }
}
