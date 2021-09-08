package Adapter.classadapter;

/**
 * 手机类
 */
public class Phone {
    public void charging(IVoltage5V iVoltage5V){
        if(iVoltage5V.output5V() == 5){
            System.out.println("充电");
        }
        else{
            System.out.println("不能充电");
        }
    }
}
