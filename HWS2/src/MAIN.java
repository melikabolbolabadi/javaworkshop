import java.util.Scanner;
import java.util.Random;
class name
{
    Scanner mi=new Scanner(System.in);
    public String name[]=new String[5];
    public void recievename( int i)
    {

        System.out.println("write 5 names : ");
        for (i=0;i<5;i++)
            name[i]=mi.next();
    }
}
class code
{
Scanner mi=new Scanner(System.in);
Random ni=new Random();
    public int code[]=new int[5];
public void recievecode(int i)
{

    for (i=0;i<5;i++)
    code[i]=ni.nextInt();
}
}

public class MAIN
{
    public static void main(String[] args)
    {
        int i=0;
        name x=new name();
        code y=new code();
        x.recievename(i);
        y.recievecode(i);
    for (i=0;i<5;i++)
    {
        System.out.print("name: ("+x.name[i]+")__");
        System.out.println("her/his code: ("+y.code[i]+")");
    }
    }
}
