package memento.theory;

public class Client {

    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("状态1");
        caretaker.add(originator.saveStateMemento());

        originator.setState("状态2");
        caretaker.add(originator.saveStateMemento());
    }
}
