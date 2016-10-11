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
        for(Observer observer : observers)
        {
            observer.update(engineTemperature, crewNumber, cruisingSpeed);
        }
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObservers(Observer o) {
        int i = observers.indexOf(o);
        if(i >= 1)
            observers.remove(i);

    }
}
