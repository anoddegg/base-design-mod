package memento.theory;

public class Memento {
    private String state;

    //构造器放state，不需要set了
    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
