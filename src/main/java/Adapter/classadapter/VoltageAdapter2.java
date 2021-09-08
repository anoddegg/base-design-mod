package Adapter.classadapter;

/**
 * 对象适配器类，将依赖变为属性
 */
public class VoltageAdapter2 implements IVoltage5V {
    private Voltage220V voltage220V;
    public VoltageAdapter2(Voltage220V voltage220V){
        this.voltage220V = voltage220V;
    }
    public int output5V() {
        int srcV = voltage220V.output220V();
        int dstV = srcV/44;
        System.out.println("输出" + dstV);
        return dstV;
    }
}
