package commond;

//当在调用空命令时，对象什么都不做
//这也是一种设计模式，可以省掉对空的判断
public class NoCommand implements Command {
    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
