package observer;
//多，观察者
public interface Subject {

    public void registerObserver(Observer o);
    public void removeObservier(Observer o);
    public void notifyObservers();
}
