package visitor;

import java.util.LinkedList;
import java.util.List;

public class ObjectStructure {

    //维护了一个集合
    private List<Person> personList = new LinkedList<>();

    public  void  attach(Person person){
        personList.add(person);
    }

    public void detach(Person person){
        personList.remove(person);
    }

    public void display(Action action){
        for (Person p: personList
             ) {
            p.accept(action);
        }
    }
}
