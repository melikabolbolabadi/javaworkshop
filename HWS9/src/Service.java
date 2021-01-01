public class Service
{

    public void save (Entity entity) throws Exception
    {
        Repos repository = new Repos();
        repository.insert(entity);
    }

    public void edit (Entity entity) throws Exception
    {
        Repos repository = new Repos();
        repository.update(entity);
    }

    public void delete (int code) throws Exception
    {
        Repos repository=new Repos ();
        repository.delete(code);

    }
}
