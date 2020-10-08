import java.util.Scanner;
public class MAIN
{
    public static void main(String[] args)
    {
        SQUARE square=new SQUARE();
        CIRCLE circle= new CIRCLE();
        System.out.println("search which one? \n 1:oval \n 2:rectangle \n 3:square \n 4:circle");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        switch (n)
        {
            case 1:
            {
                System.out.println("tool nim mehvar asli va nim mehvar kuchak ra vared konid : ");
                circle.a=scanner.nextDouble();
                circle.b=scanner.nextDouble();
                System.out.println("area : "+circle.ovalareacalculate()+"\nenvironment"+circle.ovalenvironmentcalculate());
            }
            case 2:
            {
                System.out.println("enter length and width : ");
                square.length=scanner.nextDouble();
                square.width=scanner.nextDouble();
                System.out.println("area : "+square.rectangleareacalculate()+"\nenvironment"+square.rectangleenvironmentcalculate());
            }
            case 3:
            {
                System.out.println("enter side : ");
                square.side=scanner.nextDouble();
                System.out.println("area : "+square.areacalculate()+"\nenvironment"+square.environmentcalculate());
            }
            case 4:
            {
                System.out.println("enter radious : ");
                circle.radios=scanner.nextDouble();
                System.out.println("area : "+circle.areacalculate()+"\nenvironment"+circle.environmentcalculate());
            }
            default: System.out.println("not find! ");
        }
    }
}
