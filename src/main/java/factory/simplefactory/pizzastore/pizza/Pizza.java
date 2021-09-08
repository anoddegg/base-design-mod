package factory.simplefactory.pizzastore.pizza;

import lombok.Data;

@Data
public abstract class Pizza {
    protected  String name;
    //不同披萨原材料不同，所以抽象方法
    public abstract  void prepare();

    public void bake(){
        System.out.println(name + "baking");
    }

    public void cut(){
        System.out.println(name + "cutting");
    }

    public void box(){
        System.out.println(name + "boxing");
    }


}
