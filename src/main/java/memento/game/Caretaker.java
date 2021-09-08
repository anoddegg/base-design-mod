package memento.game;

//守护者对象，保存游戏角色的状态
public class Caretaker {
    //如果只保存一次
    private Memento memento;

    //如果保存多次
//    private ArrayList<Memento> mementos;

    //如果保存多次
//    private HashMap<String, ArrayList<Memento>> rolesMemento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
