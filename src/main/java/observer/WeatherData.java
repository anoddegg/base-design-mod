package observer;

import java.util.ArrayList;

/**
 * 类是核心
 * 1、包含最新的天气情况信息
 * 2、含有观察者集合，使用ArrayList管理
 * 3、当数据由更新时，就主动调用ArrayList，通知所有接入方就看到最新的信息
 */
public class WeatherData implements Subject{
    private float temperature;
    private float pressure;
    private float humidity;
    //观察者集合
    private ArrayList<Observer> observers;

    public WeatherData(){
        observers = new ArrayList<>();
    }
    //注册一个观察者
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    //一处一个观察者
    @Override
    public void removeObservier(Observer o) {
        if(observers.contains(o)) {
            observers.remove(o);
        }
    }

    //遍历所有观察者并通知
    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size() ; i++){
            observers.get(i).update(this.temperature,this.pressure,this.humidity);
        }

    }
    
    public void setData(float temperature, float pressure ,float humidity){
        this.humidity = humidity;
        this.temperature = temperature;
        this.pressure = pressure;
        dataChange();
    }

    private void dataChange() {
        //调用接收方的daaChanget
        notifyObservers();
    }
}
