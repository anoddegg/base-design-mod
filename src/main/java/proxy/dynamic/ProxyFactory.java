package proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {

    //维护一个目标对象
    private Object target;

    //构造器对targer进行初始化
    public ProxyFactory(Object target) {
        this.target = target;
    }

    //给目标对象生成代理对象
    public Object getProxyInstance(){
        //说明：
        //public static Object newProxyInstance(ClassLoader loader,
        //                                     Class<?>[] interfaces,
        //                                    InvocationHandler h)
        //1、classloadeer：执行当前目标对象使用的类加载器，获取类加载器的方法（固定）
        //2、class<?>[] interfaces：目标对象实现的接口类型，使用泛型方法确认类型
        //3、InvocationHandler ：事情处理，执行目标对象的方法是，会触发事情处理其方法，
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("JDK动态代理");
                Object obj = method.invoke(target,args);
                System.out.println("JDK动态代理");
                return obj;

            }
        });
    }
}
