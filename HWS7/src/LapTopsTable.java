import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class LapTopsTable
{
    public String[] name = {"Dell XPS 15-9560","Microsoft Surface Go","Asus N552VW","Apple MacBook Pro 15 2019",
    "Lenovo Ideapad Z5070","Microsoft Surface Pro 6","ASUS ROG G703GX","Samsung Galaxy Book S","Lenovo Ideapad V330",
    "Asus R542UN","Lenovo V145","Asus VivoBook K542UF","Lenovo Ideapad Z50-70","Samsung Notebook 9 Pen",
    "Huawei MateBook D 15 2020"} ;
    public long[] price= {23678,27637,721881,287368,12380,1238709,283811,973811,281791,123872,123869,123987,21879,239879,129800 };
    public int[] ram={16,4,8,16,16,8,32,8,8,12,8,8,8,8,8};
    public double[] weight={2.0,0.52,2.53,1.83,2.5,0.775,4.7,0.96,1.7,2.2,2.1,2.3,2.5,1.12,1.62 };
    public double[] inch={15.6,10,15.6,15.4,15.6,12.3,17.3,15.6,15.6,15.6,15.6,15.6,15.6,13.3,15.6 };


    public  LapTopsTable() throws Exception
{
    Class.forName("oracle.jdbc.driver.OracleDriver");
    Connection connection= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","melikabolbolabadi","melika");
    PreparedStatement preparedStatement=connection.prepareStatement
            ("insert into laptop (id,name,price,ram,weight,inch) values (?,?,?,?,?,?)" );


    for (int i=0; i<15 ;i++)
    {
        preparedStatement.setInt(1,i+1);
        preparedStatement.setString(2,name[i]);
        preparedStatement.setLong(3,price[i]);
        preparedStatement.setInt(4,ram[i]);
        preparedStatement.setDouble(5,weight[i]);
        preparedStatement.setDouble(6,inch[i]);
    }
}}
