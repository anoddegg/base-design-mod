package memento.game;

public class Client {
    public static void main(String[] args) {
        GameRole gameRole = new GameRole();
        gameRole.setVit(100);
        gameRole.setDef(100);

        System.out.println("大战前的状态");

        gameRole.display();

        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(gameRole.createMemento());

        System.out.println("大战");
        gameRole.setDef(30);
        gameRole.setVit(30);

        gameRole.display();

        System.out.println("恢复");

        gameRole.recoverGameRoleFromMemento(caretaker.getMemento());
        gameRole.display();
    }

}
                