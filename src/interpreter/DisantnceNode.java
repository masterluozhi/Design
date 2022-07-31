package interpreter;

public class DisantnceNode extends AbstractNode{
    private  String disantnce;

    public DisantnceNode(String disantnce) {
        this.disantnce = disantnce;
    }

    @Override
    public String interpreter() {
        return disantnce;
    }
}
