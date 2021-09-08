package interpreter;

import java.util.HashMap;

/**
 * 抽象运算符号解释器，每个元素安抚好都只和自己的左右两个数字有关系
 */
public class SymbolExpression extends Expression {

    protected Expression left;
    protected Expression right;

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    //让其子类实现该方法，
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return 0;
    }
}
