package ManualObserverExample;

import java.util.ArrayList;

/**
 * Created by DreamShine on 11/10/2016.
 */
public class PersonData implements Subject
{
    private Float mass;

    private ArrayList<Observer> observers;

    public PersonData()
    {
        observers = new ArrayList();
    }

    public void notifyObservers() {
        for(Observer observer : observers)
        {
            observer.update(mass);
        }
        System.out.printf("Subject has finished updating updating observers..%n%n");
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObservers(Observer o) {
        int i = observers.indexOf(o);
        if(i >= 1)
            observers.remove(i);

    }

    public void setPersonSpecifications(Float mass)
    {
        this.mass = mass;
        notifyObservers();
    }
}
