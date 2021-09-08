package factory.absfactory.pizzastore.order;

import factory.absfactory.pizzastore.pizza.BJChessPizza;
import factory.absfactory.pizzastore.pizza.BJPepperPizza;
import factory.absfactory.pizzastore.pizza.Pizza;

public class BJPizzaFactory extends OrderPizza {

    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if("cheese".equals(orderType)){
            pizza = new BJChessPizza();
        }else if ("Pepper".equals(orderType)){
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
