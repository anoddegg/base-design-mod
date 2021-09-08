package templete;

public abstract class Abs {

    public void make(){
        select();
        add();
        start();

    }

    abstract void select();

    abstract void add();

    public void start(){
        System.out.println("放入豆浆机");
    }
}
