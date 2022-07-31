package interpreter;
//简单句子结论类，充当非终结符表达式角色
public class SenetenceNode extends AbstractNode{
    private AbstractNode direction;
    private AbstractNode acction;
    private AbstractNode distance;

    public SenetenceNode(AbstractNode direction, AbstractNode acction, AbstractNode distance) {
        this.direction = direction;
        this.acction = acction;
        this.distance = distance;
    }

    @Override
    public String interpreter() {
        return direction.interpreter()+acction.interpreter()+distance.interpreter();
    }
}
