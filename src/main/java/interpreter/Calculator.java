package interpreter;

import java.util.HashMap;
import java.util.Stack;

public class Calculator {
    private Expression expression;
    public Calculator(String expString) {
        Stack<Expression> stack = new Stack<>();
        //将表达式拆分成自读数组。
        char[] charArray = expString.toCharArray();

        Expression left = null;
        Expression right = null;

        //遍历字符数组
        for(int i = 0; i < charArray.length; i++){
            switch (charArray[i]){
                case '+':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new AddExpression(left, right));
                    break;
                case '-':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new SubExpression(left, right));
                    break;
                default:
                    //非符号，push到栈中
                    stack.push(new VarExpression(String.valueOf(charArray[i])));
                    break;
            }
        }
        //遍历完，栈中就得到最后的Expression了。
        this.expression = stack.pop();
    }

    public int run (HashMap<String , Integer> var){
        //最后将表达式和var绑定
        return this.expression.interpreter(var);
    }


}
