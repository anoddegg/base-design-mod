package factory.absfactory.pizzastore.pizza;


public class BJChessPizza extends Pizza{

    public void prepare() {
        setName("北京奶酪Pizza");
        System.out.println("北京的奶酪Pizza 准备");
    }
}
