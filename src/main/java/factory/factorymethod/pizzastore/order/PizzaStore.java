package factory.factorymethod.pizzastore.order;

public class PizzaStore {
    public static void main(String[] args) {
        //创建北京口味的各种pizza
        String loc = "bj";
        if (loc.equals("bj")) {
            new BJOrderPizza();
        } else {
            new LDOrderPizza();
        }
    }
}
