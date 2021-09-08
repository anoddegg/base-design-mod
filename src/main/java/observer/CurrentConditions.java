package observer;

public class CurrentConditions implements Observer{
    private float temperature;
    private float pressure;
    private float humidity;

    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.humidity = humidity;
        this.pressure = pressure;
        this.temperature = temperature;
        display();
    }
    //
    public void display(){
        System.out.println("==" + temperature + "==");
        System.out.println("==" + pressure + "==");
        System.out.println("==" + humidity + "==");

    }


}
