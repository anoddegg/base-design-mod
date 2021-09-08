package factory.factorymethod.pizzastore.order;

import factory.factorymethod.pizzastore.pizza.BJChessPizza;
import factory.factorymethod.pizzastore.pizza.BJPepperPizza;
import factory.factorymethod.pizzastore.pizza.Pizza;

public class BJOrderPizza extends OrderPizza {

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
