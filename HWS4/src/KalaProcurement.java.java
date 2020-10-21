import java.util.Scanner;
public class KalaProcurement
{
    Scanner scanner=new Scanner(System.in);
    String Namekala;
    String Moshakhasatkala;
    int Gheymatkala;
    int Vaznkala;
   public void setNamekala(){
        System.out.println("pls enter product name: ");
        Namekala=scanner.nextLine();
    }
    String getNamekala(){
        return Namekala;
    }

    public void setMoshakhasatkala(){
        System.out.println("pls enter Product specifications: ");
        Moshakhasatkala=scanner.nextLine();
    }
    String getMoshakhasatkala(){
        return Moshakhasatkala;
    }

    public void setGheymatkala(){
        System.out.println("pls enter product price: ");
        Gheymatkala=scanner.nextInt();
    }
    int getGheymatkala(){
        return Gheymatkala;
    }

    public void setVaznkala(){
        System.out.println("pls enter product weigh: ");
        Vaznkala=scanner.nextInt();
    }
    int getVaznkala(){
        return Vaznkala;
    }
}
