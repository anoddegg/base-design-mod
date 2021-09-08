package composite;

import java.util.ArrayList;
import java.util.List;
//非叶子节点
public class College extends OrganizationComponent {
    //存放的是department
    List<OrganizationComponent> organizationComponentList = new ArrayList<OrganizationComponent>();

    //构造器
    public College(String name, String des) {
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
        for (OrganizationComponent org : organizationComponentList) {
            org.print();
        }
    }
}

