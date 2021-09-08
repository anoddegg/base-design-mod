package singleton;

/**
 * 单例模式--饿汉式
 * 1）构造器私有化
 * 2）类的内部创建对象
 * 3）向外暴露静态的公共方法
 */
public class Hungry {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance ==instance1);
    }
}
class Singleton{
    //类实例对象为静态属性
    //类初始化就实例对象
    private static Singleton instance = new Singleton();
    //私有构造函数
    private Singleton(){}
    //公有的提供静类实例的方法
    public static Singleton getInstance(){
        return instance;
    }
}

class Singleton02{
    //类实例对象为静态属性
    //类初始化就实例对象
    private static Singleton02 instance;
    //私有构造函数
    private Singleton02(){}
    //在静态代码块创建单例对象
    static {
        instance = new Singleton02();
    }
    //公有的提供静类实例的方法
    public static Singleton02 getInstance(){
        return instance;
    }
}


class Singleton03{
    //私有构造函数
    private Singleton03(){}
    //静态内部类，静态属性
    private static class SingletonInstance{
        private static  final Singleton03 instance = new Singleton03();
    }

    //公有的提供静类实例的方法
    public static Singleton03 getInstance(){
        return SingletonInstance.instance;
    }
}
