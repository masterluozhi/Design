package interpreter;
//节点类，充当非终结符表达式角色
public class AndNode  extends  AbstractNode{
    private AbstractNode left;
    private AbstractNode right;

    public AndNode(AbstractNode left, AbstractNode right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String interpreter() {
        return left.interpreter()+"再"+right.interpreter();
    }
}
