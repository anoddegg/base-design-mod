package commond;

//遥控器对象
public class RemoteController {

    Command[] onCommands;
    Command[] offCommands;

    Command undoCommand;

    public RemoteController() {
        onCommands = new Command[5];
        offCommands = new Command[5];

        for (int i = 0; i < 5; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    //给按钮设置命令
    public void setCommand(int no, Command onCommand, Command offCommand) {
        onCommands[no] = onCommand;
        offCommands[no] = offCommand;
    }

    //按下开按钮
    public void onBottonWassPushed(int no) {
        //找到按下的开的按钮，并调用对应的方法
        onCommands[no].execute();
        //记录这次的操作，用于撤销
        undoCommand = onCommands[no];
    }

    //按下关按钮
    public void offBottonWassPushed(int no) {
        //找到按下的开的按钮，并调用对应的方法
        offCommands[no].execute();
        //记录这次的操作，用于撤销
        undoCommand = offCommands[no];
    }

    //按下撤销按钮
    public void undoButtonWasPushed(){
        undoCommand.undo();
    }

}