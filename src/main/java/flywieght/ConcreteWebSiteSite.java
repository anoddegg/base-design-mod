package flywieght;

//具体的网站
public class ConcreteWebSiteSite extends WebSite {
    private String type;
    //构造器
    public ConcreteWebSiteSite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("网站的发布形式为" + type + "；使用者：" + user.getName());
    }
}
