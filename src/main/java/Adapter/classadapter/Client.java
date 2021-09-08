package Adapter.classadapter;

/**
 * 客户端类
 */
public class Client {
//    public static void main(String[] args) {
//        Phone p = new Phone();
//        p.charging(new VoltageAdapter());
//    }
    public static void main(String[] args) {
        Phone p = new Phone();
        p.charging(new VoltageAdapter2(new Voltage220V()));
    }
}
