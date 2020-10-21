public class CheckSaleException extends KalaSale
{
    public void checkneme() throws CreatException
    {

        if (getNamemahsol().equals(" ")) throw new CreatException("it is unacceptable price should be zero or more! ");
        else System.out.println(" Successfully registered <"+getNamemahsol()+"> :)) ");
    }
    public void checkprice() throws CreatException
    {

        if (getGheymatmahsol()<0) throw new CreatException("field is empty yet you should enter some thing! ");
        else System.out.println(" Successfully registered <"+getGheymatmahsol()+"> :)) ");
    }
    public void checkweigh() throws CreatException
    {

        if (getVaznmahsol()<0) throw new CreatException("it is unacceptable weigh should be more than zero! ");
        else System.out.println(" Successfully registered <"+getVaznmahsol()+"> :)) ");
    }
}
