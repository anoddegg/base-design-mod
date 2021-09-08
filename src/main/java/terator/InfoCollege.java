package terator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InfoCollege implements College {

    List<Depetment> depetmentList ;
    @Override
    public String getName() {
        return "信息工程学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Depetment depetment = new Depetment(name,desc);
        depetmentList.add(depetment);
    }

    @Override
    public Iterator createIterator() {
        return new InfoCollegeIterator(depetmentList);
    }

    public InfoCollege() {
        depetmentList = new ArrayList<>();
        addDepartment("信息安全专业","xinxidesc");
        addDepartment("专业1","专业1desc");
        addDepartment("专业2","专业2desc");
    }


}
