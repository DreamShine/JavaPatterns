package JavaUtilObserverExample;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by DreamShine on 11/10/2016.
 */
public class ForecastDisplay implements Observer, Display
{
    private Observable observable;
    private float currentPressure = 29.29F;
    private float lastPressure;

    public ForecastDisplay(Observable ob)
    {
        observable = ob;
        observable.addObserver(this);
    }

    public void display() {
        System.out.println("Previous pressure: " + lastPressure+
        "  Current pressure: "+ currentPressure);
    }

    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData)
        {
            WeatherData weatherData = (WeatherData) observable;
            lastPressure = currentPressure;
            currentPressure = weatherData.getPressure();
            display();
        }
    }
}
