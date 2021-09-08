package visitor;

public class Client {

    public static void main(String[] args) {
        //创建OBjStructure
        ObjectStructure objectStructure = new ObjectStructure();

        objectStructure.attach(new Man());
        objectStructure.attach(new Man());
        objectStructure.attach(new Man());
        objectStructure.attach(new Woman());

        Success success = new Success();
        objectStructure.display(success);
    }
}
