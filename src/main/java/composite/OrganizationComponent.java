package composite;

public abstract class OrganizationComponent {

    private String name;
    private String des;

    public OrganizationComponent(String name, String des) {
        this.name = name;
        this.des = des;
    }

    protected void add(OrganizationComponent organizationComponent){
        //默认实现(因为叶子节点不需要实现该方法，所以不能写成抽象方法)
        throw new UnsupportedOperationException();
    }

    protected void remove(OrganizationComponent organizationComponent){
        //默认实现(因为叶子节点不需要实现该方法，所以不能写成抽象方法)
        throw new UnsupportedOperationException();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    //所有子类都需要实现
    protected abstract void print();

}
