public class CheckProcurementException extends KalaProcurement
{
    public void checkname() throws CreatException
    {

        if (getNamekala().equals(" ")) throw new CreatException("field is empty yet you should enter some thing! ");
        else System.out.println(" Successfully registered <"+getNamekala()+"> :)) ");
    }
    public void checkspecification() throws CreatException
    {

        if (getMoshakhasatkala().equals(" ")) throw new CreatException("field is empty yet you should enter some thing! ");
        else System.out.println(" Successfully registered <"+getMoshakhasatkala()+"> :)) ");
    }
    public void checkprice() throws CreatException
    {

        if (getGheymatkala()<0) throw new CreatException("it is unacceptable price should be zero or more! ");
        else System.out.println(" Successfully registered <"+getGheymatkala()+"> :)) ");
    }
    public void checkweigh() throws CreatException
    {

        if (getVaznkala()<0) throw new CreatException("it is unacceptable weigh should be more than zero! ");
        else System.out.println(" Successfully registered <"+getVaznkala()+"> :)) ");
    }
}
