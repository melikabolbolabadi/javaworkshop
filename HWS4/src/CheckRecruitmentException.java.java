public class CheckRecruitmentException extends Recruitment
{
    public void checkname() throws CreatException
    {

      if (getName().equals(" ")) throw new CreatException("field is empty yet you should enter some thing! ");
      else System.out.println(" Successfully registered <"+getName()+"> :)) ");
    }
    public void checkfamilyname() throws CreatException
    {
        if (getFamilyname().equals(" ")) throw new CreatException("field is empty yet please enter some thing! ");
        else System.out.println("Successfully registered <"+getFamilyname()+"> :))");
    }
    public void checkfathername() throws CreatException
    {
        if (getFathersname().equals(" ")) throw new CreatException("field is empty yet please enter some thing! ");
        else System.out.println("Successfully registered <"+getFathersname()+"> :))");
    }
    public void checkfieldofstudy() throws CreatException
    {
        if (getReshtetahsili().equals(" ")) throw new CreatException("field is empty yet please enter some thing! ");
        else System.out.println("Successfully registered <"+getReshtetahsili()+"> :))");
    }
    public void checkdegreeofeducation() throws CreatException
    {
        if (getMadraktahsili().equals(" ")) throw new CreatException("field is empty yet please enter some thing! ");
        else System.out.println("Successfully registered <"+getMadraktahsili()+"> :))");
    }
    public void checksalary() throws CreatException
    {
        if (getHoghogh()==0) throw new CreatException("field is empty yet please enter some thing! ");
        else if (getHoghogh()>0) System.out.println("Successfully registered <"+getHoghogh()+"> :))");
    }

}
