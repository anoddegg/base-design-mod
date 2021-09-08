package singleton;

/**
 * 单例模式--懒汉式(什么时候用什么时候初始化)
 */
public class Lazy {
    //类实例对象为静态属性
    private static Lazy instance;
    //私有构造函数
    private Lazy (){}

    //公有的提供静类实例的方法
    public static Lazy getInstance(){
        if(instance == null){
            instance =  new Lazy();
        }
        return instance;
    }
}
