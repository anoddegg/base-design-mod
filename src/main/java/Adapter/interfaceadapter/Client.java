package Adapter.interfaceadapter;

public class Client {
    public static void main(String[] args) {
        //仅使用接口个别方法，通过匿名内部类方式
        AbsAdapter absAdapter = new AbsAdapter(){
            public void method1() {
                System.out.println("dandan");
            }
        };
    }
}
