package terator;

import java.util.Iterator;
import java.util.List;

public class OutPutImpl {

    //学院集合
    List<College> collegeList;

    public OutPutImpl(List<College> collegeList) {
        this.collegeList = collegeList;
    }

    //遍历学院，调用printDepartment输出各个学院的系
    public void printCollege(){
        //从collegeList中取出所有的学院
        Iterator<College> iterator = collegeList.iterator();
        while(iterator.hasNext()){
            College college = iterator.next();
            System.out.println("========学院名称" + college.getName());
            printDepartment(college.createIterator());
        }
    }

    //学院输出系

    public void printDepartment(Iterator iterator){
        while (iterator.hasNext()){
            Depetment depetment = (Depetment) iterator.next();
            System.out.println(depetment.getName());
        }
    }
}
