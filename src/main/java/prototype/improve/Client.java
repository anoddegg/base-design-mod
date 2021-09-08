package prototype.improve;



public class Client {
    public static void main(String[] args) {
        System.out.println("原型模式创建对象");
        Sheep sheep = new Sheep("tom", 1, "白色");
        Sheep sheep2 = (Sheep)sheep.clone();
        System.out.println(sheep2);
        Sheep sheep3 = (Sheep)sheep.clone();
        Sheep sheep4 = (Sheep)sheep.clone();
    }
}
