package factory.factorymethod.pizzastore.order;



import factory.factorymethod.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract  class OrderPizza {
    public OrderPizza(){
        Pizza pizza = null;
        String orderType;
        do{
            orderType = getType();
            pizza = createPizza(orderType);
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }while(true);
    }

    //抽象方法，子类自行实现
    abstract Pizza createPizza(String orderType);

    private String getType(){
        try {
            BufferedReader string = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza 种类");
            String str = string.readLine();
            return str;
        }catch (IOException e){
            e.printStackTrace();
            return "";
        }
    }
}
