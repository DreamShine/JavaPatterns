package ManualObserverExample;

/**
 * Created by DreamShine on 11/10/2016.
 */
public interface Observer {
    public void update(Float engineTemperature, int numberOfCrew, Double cruisingSpeed);
}
