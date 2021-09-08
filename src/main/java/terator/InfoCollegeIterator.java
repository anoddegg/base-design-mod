package terator;

import java.util.Iterator;
import java.util.List;

public class InfoCollegeIterator implements Iterator {
    List<Depetment> depetmentList;

    int index = -1;

    public InfoCollegeIterator(List<Depetment> depetmentList) {
        this.depetmentList = depetmentList;
    }

    @Override
    public boolean hasNext() {
        if(index >= depetmentList.size() -1){
            return false;
        }else{
            index += 1;
            return true;
        }
    }

    @Override
    public Object next() {
        return depetmentList.get(index);
    }

    @Override
    public void remove() {

    }
}
