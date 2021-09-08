package memento.theory;

public class Originator {

    private String state;//状态信息

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    //编写方法，保存状态对象Memento
    public Memento saveStateMemento(){
        return new Memento(state);
    }

    //通过备忘录恢复对象
    public void getStateFromMemento(Memento memento){
        state = memento.getState();
    }
}
