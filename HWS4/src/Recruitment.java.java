import java.util.Scanner;
public class Recruitment
{
    Scanner scanner=new Scanner(System.in);
    String Name;
    String Familyname;
    String Fathersname;
    String Reshtetahsili;
    String Madraktahsili;
    int Hoghogh;
    public void setName()
    {
        System.out.println("enter name: ");
        Name=scanner.nextLine();
    }
    public String getName()
    {
        return Name;
    }

    void setFamilyname()
    {
        System.out.println("pls enter Family name: ");
        Familyname=scanner.nextLine();
    }
    String getFamilyname()
    {
        return Familyname;
    }

    void setFathersname()
    {
        System.out.println("pls enter father name: ");
        Fathersname=scanner.nextLine();
    }
    String getFathersname()
    {
        return Fathersname;
    }

    void setReshtetahsili()
    {
        System.out.println("pls enter field of study: ");
        Reshtetahsili=scanner.nextLine();
    }
    String getReshtetahsili()
    {
        return Reshtetahsili;
    }

    void setMadraktahsili()
    {
        System.out.println("pls enter degree of education: ");
        Madraktahsili=scanner.nextLine();
    }
    String getMadraktahsili()
    {
        return Madraktahsili;
    }

    void setHoghogh()
    {
        System.out.println("pls enter proposed salary: ");
        Hoghogh=scanner.nextInt();
    }
    int getHoghogh()
    {
        return Hoghogh;
    }
}
