package interpreter;

import java.util.HashMap;

/**
 * 抽象类表达式，通过map的键值对，获取变量的值
 */
public abstract class Expression {

    //解释公式和数值的关系，key就是参数，value是具体的值
    public abstract int interpreter(HashMap<String, Integer> var);
}
