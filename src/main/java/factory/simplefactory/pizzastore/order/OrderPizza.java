package factory.simplefactory.pizzastore.order;

import factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {
    //构造器
    public OrderPizza(SimpleFactory factory){
        setFactory(factory);
    }
    //定义工厂对象
    SimpleFactory factory;
    Pizza pizza = null;
    public void setFactory(SimpleFactory factory){
        String orderType;
        this.factory = factory;

        do{
            orderType = getType();
            pizza = this.factory.createPizza(orderType);
            if(null != pizza){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else{
                break;
            }
        }while(true);
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
        }}
}
