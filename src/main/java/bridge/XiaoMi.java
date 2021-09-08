package bridge;
//小米继承品牌
public class XiaoMi implements Brand{
    public void open() {
        System.out.println("小米开机");
    }

    public void close() {
        System.out.println("小米关机");

    }

    public void call() {
        System.out.println("小米打电话");
    }
}
