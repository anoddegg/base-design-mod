package bridge;

public class Client {
    public static void main(String[] args) {
        //折叠式手机（样式+品牌）
        //折叠式小米
        Phone p1 = new FoldedPhone(new XiaoMi());
        p1.open();

        Phone phone = new FoldedPhone(new Vivo());
        phone.call();

        Phone phone1 = new UprightPhone(new Vivo());
        phone1.close();
    }
}
