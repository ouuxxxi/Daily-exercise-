package March;
import java.util.*;
//合法括号序列判断
public class Day03 {
    public boolean chkParenthesis(String str, int n) {
        // write code here
        Stack<Character> stack = new Stack();
        for(int i = 0 ; i < str.length(); i++){
            char c = str.charAt(i);

            if(c == '('){
                stack.push(c);
            }else if(c == ')'){ //右括号
                if(stack.isEmpty()){ //为空：右括号比左括号多（里面没有其他括号）
                    return false;
                }

               //方法一：
                else{
                    stack.pop(); //左括号右括号匹配成功
                }

//                方法二：
//               char a = stack.peek(); 查看栈顶元素
//               if(a=='(' && c == ')'){
//                    stack.pop();//出栈
//               }

            }
        }

        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
}
