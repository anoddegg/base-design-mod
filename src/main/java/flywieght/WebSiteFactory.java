package flywieght;

import java.util.HashMap;

//网站工厂类，根据需求返回一个网站
public class WebSiteFactory {

    //集合，充当池的作用
    private HashMap<String, ConcreteWebSiteSite> pool = new HashMap<>();

    //根据网站类型，返回一个网站，如果没有就创建一个网站，并放入到池中
    public WebSite getWebSiteCategroy(String type){
        if(!pool.containsKey(type)){
            //创建网站
            pool.put(type, new ConcreteWebSiteSite(type));
        }
        return pool.get(type);
    }

    //获取网站分类的总数（池中有多少个网站类型）
    public int getWebSiteCount(){
        return pool.size();
    }
}
