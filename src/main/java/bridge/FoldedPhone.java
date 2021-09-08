package bridge;

//折叠手机、继承抽象类phone
public class FoldedPhone extends Phone {
    //构造器
    public FoldedPhone(Brand brand) {
        super(brand);
    }

    @Override
    protected void open() {
        super.open();
        System.out.println("折叠手机");
    }

    @Override
    protected void close() {
        super.close();
        System.out.println("折叠手机");
    }

    @Override
    protected void call() {
        super.call();
        System.out.println("折叠手机");
    }
}
