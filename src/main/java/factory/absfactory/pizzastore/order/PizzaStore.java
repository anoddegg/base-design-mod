package factory.absfactory.pizzastore.order;

public class PizzaStore {
    public static void main(String[] args) {
        //创建北京口味的各种pizza
        new OrderPizza(new LDPizzaFactory());
    }
}
