package factory.absfactory.pizzastore.order;

import factory.absfactory.pizzastore.pizza.LDChessPizza;
import factory.absfactory.pizzastore.pizza.LDPepperPizza;
import factory.absfactory.pizzastore.pizza.Pizza;

public class LDPizzaFactory implements AbsFactory {
    public Pizza createPizza(String orderType){
        Pizza pizza = null;
        if(orderType.equals("cheese")){
            pizza = new LDChessPizza();
        }else if( orderType.equals("pepper")){
            pizza = new LDPepperPizza();
        }
        return pizza;
    }


}
