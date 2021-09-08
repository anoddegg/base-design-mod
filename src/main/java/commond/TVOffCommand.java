package commond;
//TV开命令
public class TVOffCommand implements Command{
    //聚合LightReceiver
    TVReceiver light;

    public TVOffCommand(TVReceiver light) {
        super();
        this.light = light;
    }

    @Override
    public void execute() {
        //调用接收者的方法
        light.off();
    }

    @Override
    public void undo() {
        //调用接受者的方法
        light.on();
    }
}
