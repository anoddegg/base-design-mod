package terator;

import java.util.Iterator;

public class ComputerCollege implements College {

    Depetment[] departments;
    int numOfDepartment = 0;//数组对象个数

    public ComputerCollege() {
        this.departments = new Depetment[5];
        addDepartment("java","java");
        addDepartment("PHP","java");
        addDepartment("PYthon","java");
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Depetment depetment = new Depetment(name,desc);
        departments[numOfDepartment] = depetment;
        numOfDepartment += 1;
    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
