package factory.factorymethod.pizzastore.pizza;

public class BJPepperPizza extends Pizza {
    public void prepare() {
        setName("北京胡椒pizza");
        System.out.println("北京胡椒pizza 准备");
    }
}
