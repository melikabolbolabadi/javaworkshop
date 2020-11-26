import oracle.jdbc.proxy.annotation.Pre;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BrandsTable
{
    String[] brand={"dell","surface","asus","apple","lenovo","samsung","huawei"};
    public BrandsTable() throws Exception
    {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection connection= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","melikabolbolabadi","melika");
        PreparedStatement statement=connection.prepareStatement("insert into brands (id,bname) values (?,?)");

        for (int j=0;j<7;j++)
        {
            statement.setInt(1,j+1);
            statement.setString(2,brand[j]);

        }

    }
}
