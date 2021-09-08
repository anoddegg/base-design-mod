package prototype;

public class Client {
    //传统的方法
    public static void main(String[] args) {
//传统方式
        Sheep sheep = new Sheep("tom", 1, "白色");
        Sheep sheep1 = new Sheep(sheep.getName(),sheep.getAge(),sheep.getColor());
        Sheep sheep2 = new Sheep(sheep.getName(),sheep.getAge(),sheep.getColor());
    }

}
