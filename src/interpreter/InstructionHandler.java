package interpreter;

import java.util.Stack;

public class InstructionHandler {
    private AbstractNode node;
    public void handle(String instruction){
        AbstractNode left=null;
        AbstractNode right=null;
        AbstractNode direction=null,action=null,distance=null;
        //栈用来存储抽象语法树
        Stack<AbstractNode> stack = new Stack<>();
        //以空格分割指令字符串
        String[] words = instruction.split(" ");
        for (int i = 0; i < words.length; i++) {
            //本实例采用栈的方式处理指令
            if (words[i].equalsIgnoreCase("and")){
                left= stack.pop();
                String word1=words[++i];
                direction = new DiretionNode(word1);
                String word2=words[++i];
                action = new ActionNode(word2);
                String word3=words[++i];
                distance = new DisantnceNode(word3);
                right = new SenetenceNode(direction, action, distance);//右表达式
                stack.push(new AndNode(left,right));//将型表达式压入栈中
            }else {
                String word1=words[i];
                direction = new DiretionNode(word1);
                String word2=words[++i];
                action = new ActionNode(word2);
                String word3=words[++i];
                distance = new DisantnceNode(word3);
                left = new SenetenceNode(direction, action, distance);//右表达式
                stack.push(left);//将型表达式压入栈中
            }
        }
        this.node= stack.pop();
    }
    public String output(){
        String interpreter = node.interpreter();
        return interpreter;

    }
}
