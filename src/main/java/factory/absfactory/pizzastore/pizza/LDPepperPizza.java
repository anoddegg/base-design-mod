package factory.absfactory.pizzastore.pizza;

public class LDPepperPizza extends Pizza {
    public void prepare() {
        setName("伦敦胡椒pizza");
        System.out.println("伦敦胡椒pizza 准备");
    }
}
