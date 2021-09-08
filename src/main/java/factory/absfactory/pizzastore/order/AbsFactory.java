package factory.absfactory.pizzastore.order;

import factory.absfactory.pizzastore.pizza.Pizza;

public interface AbsFactory {
    //子类自行实现
    public Pizza createPizza(String orderType);
}
