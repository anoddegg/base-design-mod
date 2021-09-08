package factory.factorymethod.pizzastore.order;

import factory.factorymethod.pizzastore.pizza.LDChessPizza;
import factory.factorymethod.pizzastore.pizza.LDPepperPizza;
import factory.factorymethod.pizzastore.pizza.Pizza;

public class LDOrderPizza extends OrderPizza {

    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")){
            pizza = new LDChessPizza();
        }else if (orderType.equals("Pepper")){
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
