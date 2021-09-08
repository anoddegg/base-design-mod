package factory.absfactory.pizzastore.order;


import factory.absfactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {

    AbsFactory absFactory;

    public OrderPizza(AbsFactory absFactory){
        setAbsFactory(absFactory);
    }

    private void setAbsFactory(AbsFactory absFactory) {
        Pizza pizza = null;
        String orderType ;
        this.absFactory = absFactory;
        do{
            orderType = getType();
            pizza = absFactory.createPizza(orderType);
            if(null != pizza ){
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
            }else{
                System.out.println("sssss");
            }
        }while(true);
    }

    public OrderPizza(){

    }



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
