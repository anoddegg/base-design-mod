package interpreter;

import java.util.HashMap;

/**
 * 变量的解释器，
 */
public class VarExpression extends Expression {

    //key = a，key=b,key=c
    private String key;

    public VarExpression(String key){
        this.key = key;
    }

    //var是{a=10,b=20}
    //根据参数值，返回数值
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return var.get(this.key);
    }
}
