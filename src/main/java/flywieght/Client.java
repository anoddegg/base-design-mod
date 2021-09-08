package flywieght;

public class Client {
    public static void main(String[] args) {
        //创建工厂类
        WebSiteFactory webSiteFactory = new WebSiteFactory();

        //客户要以新闻形式发布的网站
        WebSite webSite = webSiteFactory.getWebSiteCategroy("新闻");
        webSite.use(new User("dandan"));

        //客户要以新闻形式发布的网站
        WebSite webSite1  = webSiteFactory.getWebSiteCategroy("新闻");
        webSite.use(new User("小鬼"));

        System.out.println(webSiteFactory.getWebSiteCount());
    }
}
