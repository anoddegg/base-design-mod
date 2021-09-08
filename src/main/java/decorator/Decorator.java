package decorator;

public class Decorator extends  Drink{
    private Drink obj;
    public float cost() {
        return super.getPrice()
                + obj.cost();
    }

    public Decorator(Drink obj) {//组合
        this.obj = obj;
    }

    @Override
    public String getDes() {
        //obj输出被装饰者信息
        return super.getDes() + ""+ super.getPrice() + ""+ obj.getDes() ;
    }
}
