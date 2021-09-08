package decorator;

public class CoffeeBar {
    public static void main(String[] args) {
        //装饰者模式下的订单，2分巧克力+一份牛奶的Longblack
        Drink order = new LongBlack();
        System.out.println("费用=" + order.cost());
        System.out.println("描述" + order.getDes());

        //加一份牛奶
        order = new Milk(order);
        System.out.println("费用=" + order.cost());
        System.out.println("描述" + order.getDes());

        //加一分巧克力
        order = new Chocolate(order);
        System.out.println("费用=" + order.cost());
        System.out.println("描述" + order.getDes());

        //加一分巧克力
        order = new Chocolate(order);
        System.out.println("费用=" + order.cost());
        System.out.println("描述" + order.getDes());

    }
}
