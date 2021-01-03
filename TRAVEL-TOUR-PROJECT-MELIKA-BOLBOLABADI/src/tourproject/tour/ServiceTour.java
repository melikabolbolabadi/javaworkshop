
package tourproject.tour;

public class ServiceTour {


    public void save(EntityTour entity) throws Exception
    {
        RepositoryTour repository = new RepositoryTour();
        repository.insertTour(entity);
    }

    public void edit(EntityTour entity) throws Exception
    {
        RepositoryTour repository = new RepositoryTour();
        repository.updateTour(entity);
    }

    public void delete(long code) throws Exception
    {
        RepositoryTour repository = new RepositoryTour ();
        repository.deleteTour(code);
    }

}
