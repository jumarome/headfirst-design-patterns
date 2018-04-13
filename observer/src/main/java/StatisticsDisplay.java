import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements Observer,DisplayElement {
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum= 0.0f;
    private int numReadings;
    private Observable observable;

    public StatisticsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            WeatherData weatherData = (WeatherData) o;
            float temperature = weatherData.getTemperature();
            tempSum += temperature;
            numReadings++;
            if(temperature > maxTemp)
                maxTemp = temperature;
            if(temperature < minTemp)
                minTemp = temperature;
            display();
        }

    }

    @Override
    public void display() {
        float avgTemp=tempSum/numReadings;
        System.out.format("Avg/Max/Min temperature=%.2f/%.2f/%.2f\n",avgTemp,maxTemp,minTemp);
    }
}
