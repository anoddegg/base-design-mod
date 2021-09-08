package prototype.deepclone;

import java.io.*;

public class DeepProtoType implements Serializable,Cloneable {

    public String name;
    public DeepCloneableTarget deepCloneableTarget;
    public DeepProtoType(){
        super();
    }

    //深拷贝-方式1使用clone方法
    @Override
    protected  Object clone () throws CloneNotSupportedException {
        Object deep = null;
        deep = super.clone();
        //对引用类型的属性进行单独处理
        DeepProtoType deepProtoType = (DeepProtoType) deep;
        deepProtoType.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();
        return deep;
    }

    //深拷贝-方式2通过对象的序列化实现（推荐）
    public Object deepClone(){

        //创建对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try{
            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepProtoType copyObj = (DeepProtoType) ois.readObject();
            return copyObj;
        }catch (Exception e){
            System.out.println(e);
            return null;
        }finally {
            try{
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            }catch (Exception e){
                System.out.println(e);
            }
        }

    }
}
