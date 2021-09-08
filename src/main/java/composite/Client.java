package composite;

/**
 * 组合模式
 */
public class Client {
    public static void main(String[] args) {
        OrganizationComponent university = new University("清华大学","嘴啊不能够的大学");

        OrganizationComponent college1 = new College("计算机学院", "计算机学院");
        OrganizationComponent college2 = new College("信息工程学院","");

        university.add(college1);
        university.add(college2);

        college1.add(new Department("软件工程",""));
        college1.add(new Department("计算机工程",""));
        college2.add(new Department("信息工程",""));
        college2.add(new Department("通信工程",""));

        university.print();
    }
}
