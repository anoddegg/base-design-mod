package composite;

import java.util.ArrayList;
import java.util.List;

//就是composite（非叶子节点），可以管理college
public class University extends OrganizationComponent {

    List<OrganizationComponent> organizationComponentList = new ArrayList<OrganizationComponent>();

    //构造器
    public University(String name, String des){
        super(name, des);
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        organizationComponentList.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponentList.remove(organizationComponent);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    //输出university中包含的学院
    @Override
    protected void print() {
        System.out.println("==============" + getName() + "==============");
        for (OrganizationComponent org: organizationComponentList) {
//            System.out.println("==============" + org.getName() + "==============");
            org.print();
        }
    }
}
