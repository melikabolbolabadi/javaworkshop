import java.util.Scanner;
public class KalaSale
{
    Scanner scanner=new Scanner(System.in);
    String Namemahsol;
    int Gheymatmahsol;
    int Vaznmahsol;
  public   void setNamemahsol(){
        System.out.println("pls enter your Name mahsol");
        Namemahsol=scanner.nextLine();
    }
    String getNamemahsol(){
        return Namemahsol;
    }

   public void setGheymatmahsol(){
        System.out.println("pls enter your gheymat mahsol");
        Gheymatmahsol = scanner.nextInt();
    }
    int getGheymatmahsol(){
        return Gheymatmahsol;
    }

    public void setVaznmahsol(){
        System.out.println("pls enter your vazn mahsol");
        Vaznmahsol=scanner.nextInt();
    }
    int getVaznmahsol(){
        return Vaznmahsol;
    }
}
