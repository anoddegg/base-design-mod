package factory.simplefactory.pizzastore.order;

import factory.simplefactory.pizzastore.pizza.ChessPizza;
import factory.simplefactory.pizzastore.pizza.GreekPizza;
import factory.simplefactory.pizzastore.pizza.Pizza;

/**
 * 简单工厂类
 */
public class SimpleFactory {
    Pizza pizza = null;
    //根据orderType返回对应的pizza实例
    public Pizza createPizza(String orderType){
        if(orderType.equals("greek")){
            pizza = new GreekPizza();
            pizza.setName("希腊pizza");
        }else if(orderType.equals("cheese")){
            pizza = new ChessPizza();
            pizza.setName("知识pizza");
        }
        return pizza;
    }
}
