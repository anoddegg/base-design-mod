package bridge;
//vivo继承品牌，
public class Vivo implements Brand{
    public void open() {
        System.out.println("Vivo开机");
    }

    public void close() {
        System.out.println("Vivo关机");

    }

    public void call() {
        System.out.println("Vivo打电话");
    }
}
