package ManualObserverExample;

import java.util.ArrayList;

/**
 * Created by DreamShine on 11/10/2016.
 */
public class ShipData implements Subject
{
    private Float engineTemperature;
    private int crewNumber;
    private double cruisingSpeed;

    private ArrayList<Observer> observers;

    public ShipData()
    {
        observers = new ArrayList();
    }

    public void notifyObservers() {
        for(int i = 0; i < observers.size(); i++)
        {
            Observer observer = observers.get(i);
            observer.update(engineTemperature, crewNumber, cruisingSpeed);
        }
    }

    public void registerObserver(Observer o) {

    }

    public void removeObservers(Observer o) {

    }
}
