package visitor;

public class Success extends Action {
    @Override
    public void getManResult(Man man) {
        System.out.println("男人给评价：成功");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("女人给评价：成功");
    }
}
