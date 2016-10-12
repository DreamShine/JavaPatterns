package JavaUtilObserverExample;

import java.util.Observable;

/**
 * Created by DreamShine on 11/10/2016.
 */
public class WeatherData extends Observable
{
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){ }

    public void measurementsChanged()
    {
        setChanged();
        //This means were using the PULL model.
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure)
    {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
