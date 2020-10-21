import java.util.Scanner;
import java.lang.String;
public class MAIN
{
    public static void main(String[] args) throws CreatException
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("\n1.Recruitment\n2.product procurement\n3.kala sale\nchoose a service you want :");
        int n=scanner.nextInt();
       switch (n)
       {
           case 1:
           {
               IfFirst ifFirst=new IfFirst();
               ifFirst.IfFirst();
           }
           case 2:
           {
               IfSecond ifSecond=new IfSecond();
               ifSecond.IfSecond();
           }
           case 3:
           {
               IfThird ifThird=new IfThird();
               ifThird.IfThird();
           }
       }
    }
}
