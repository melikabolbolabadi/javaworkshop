import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(System.in);
        LapTopsTable lapTopsTable=new LapTopsTable();
        BrandsTable brandsTable=new BrandsTable();
        System.out.println("wanna update laptops informations? : 1)yes 2)no :");
        int n=scanner.nextInt();
        if (n==1)
        {
            UpdateLaptop updateLaptop=new UpdateLaptop();
            System.out.println("any thing else? 1)yes 2)no :");
            int p=scanner.nextInt();
            if (p==1)    updateLaptop = new UpdateLaptop();
        }


        System.out.println("wanna delet any row? 1)yes 2)no :");
        int k=scanner.nextInt();
        if (k==1)
        {
            DeleteLaptop deleteLaptop=new DeleteLaptop();
        }
    }
}
