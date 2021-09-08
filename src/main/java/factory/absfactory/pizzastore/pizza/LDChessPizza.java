package factory.absfactory.pizzastore.pizza;

public class LDChessPizza extends Pizza {

    public void prepare() {
        setName("伦敦奶酪Pizza");
        System.out.println("伦敦的奶酪Pizza 准备");
    }
}
