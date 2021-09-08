package commond;

public class Client {
    public static void main(String[] args) {
        //使用命令设计模式完成通过遥控器对电灯的操作
        //创建电灯的对象
        LightReceiver lightReceiver = new LightReceiver();

        //创建TV对象
        TVReceiver tv = new TVReceiver();

        //创建电灯的开关命令
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);

        //创建TV的开关命令
        TVOnCommand TVOn = new TVOnCommand(tv);
        TVOffCommand TVOff = new TVOffCommand(tv);

        //创建遥控器
        RemoteController remoteController = new RemoteController();

        //给遥控器设置命令，
        remoteController.setCommand(0,lightOnCommand,lightOffCommand);

        remoteController.setCommand(1,TVOn, TVOff);

        System.out.println("----------灯开------------");
        remoteController.onBottonWassPushed(0);

        System.out.println("----------灯关------------");
        remoteController.offBottonWassPushed(0);

        System.out.println("----------灯撤销------------");
        remoteController.undoButtonWasPushed();

        System.out.println("----------TV关------------");
        remoteController.offBottonWassPushed(1);

        System.out.println("----------TV撤销------------");
        remoteController.undoButtonWasPushed();
    }
}
