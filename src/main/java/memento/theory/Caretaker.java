package memento.theory;

import java.util.ArrayList;
import java.util.List;

//管理备忘录对象的对象
public class Caretaker {
    //在list对象中有很多备忘录对象
    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento memento){
        mementoList.add(memento);
    }
    //获取第n个备忘录对象
    public Memento get(int index){
        return mementoList.get(index);
    }
}
