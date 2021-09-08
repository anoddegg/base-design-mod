package terator;

import java.util.Iterator;

public class ComputerCollegeIterator implements Iterator {
    //需要知道department是怎样的方式存放
    Depetment[] depetments;
    int position = 0;//便利的位置

    public ComputerCollegeIterator(Depetment[] depetments) {
        this.depetments = depetments;
    }

    @Override
    public boolean hasNext() {
        if(position >= depetments.length || depetments[position] == null ){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public Object next() {
        Depetment depetment =  depetments[position];
        position += 1;
        return depetment;
    }

    @Override
    public void remove() {

    }
}
