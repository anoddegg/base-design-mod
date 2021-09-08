package proxy.cglib;

public class Client {

    public static void main(String[] args) {
        TeacherDao teacher = new TeacherDao();
        TeacherDao factory = (TeacherDao)new ProxyFactory(teacher).getProxyInstance();
        factory.teacher();

    }
}
