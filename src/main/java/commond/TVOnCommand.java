package commond;
//TV开命令
public class TVOnCommand implements Command{
    //聚合LightReceiver
    TVReceiver TV;

    public TVOnCommand(TVReceiver TV) {
        super();
        this.TV = TV;
    }

    @Override
    public void execute() {
        //调用接收者的方法
        TV.off();
    }

    @Override
    public void undo() {
        //调用接受者的方法
        TV.on();
    }
}
