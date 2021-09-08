package visitor;


//这点使用到了双分派，首先在客户端程序中，将具体状态作为参数传递Woman中
//dier：woman类调用作为参数的具体方法中getWomanResult,同时将自己作为参数传入，作为第二次分派
public class Woman extends Person {
    @Override
    public void accept(Action action) {
        action.getWomanResult(this);
    }
}
