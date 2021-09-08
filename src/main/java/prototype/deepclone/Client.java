package prototype.deepclone;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        DeepProtoType p1 = new DeepProtoType();
        p1.name = "dandan";
        p1.deepCloneableTarget = new DeepCloneableTarget("大牛","大牛的类");
        //完成深拷贝

        DeepProtoType p2 = (DeepProtoType) p1.clone();
        System.out.println(p1);
        System.out.println(p2);

        DeepProtoType p3 = (DeepProtoType) p1.deepClone();
        System.out.println(p3);
    }

}
