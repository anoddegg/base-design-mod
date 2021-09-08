package Adapter.classadapter;

/**
 * 适配接口
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V  {

    public int output5V() {
        int srcV = output220V();
        int dstV = srcV/44;
        System.out.println("输出" + dstV);
        return dstV;
    }
}
