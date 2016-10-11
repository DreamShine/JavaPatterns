package ManualObserverExample;

/**
 * Created by DreamShine on 11/10/2016.
 */
public interface Subject
{
    public abstract void notifyObservers();
    public abstract void registerObserver(Observer o);
    public abstract void removeObservers(Observer o);

}
