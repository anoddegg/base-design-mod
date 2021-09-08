package visitor;

public class Fail extends Action {
    @Override
    public void getManResult(Man man) {
        System.out.println("男人给评价：失败");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("女人给评价：失败");
    }
}
