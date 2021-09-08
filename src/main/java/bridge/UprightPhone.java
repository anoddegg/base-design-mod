package bridge;
//直立手机继承phone
public class UprightPhone extends Phone {
    public UprightPhone(Brand brand) {
        super(brand);
    }

    @Override
    protected void open() {
        super.open();
        System.out.println("直立");
    }

    @Override
    protected void close() {
        super.close();
        System.out.println("直立");
    }

    @Override
    protected void call() {
        super.call();
        System.out.println("直立");
    }
}
