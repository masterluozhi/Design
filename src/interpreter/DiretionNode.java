package interpreter;

public class DiretionNode extends AbstractNode{
    private String dirtction;

    public DiretionNode(String dirtction) {
        this.dirtction = dirtction;
    }

    @Override
    public String interpreter() {
        if (dirtction.equalsIgnoreCase("up")){
            return "上";
        }
        if (dirtction.equalsIgnoreCase("down")){
            return "下";
        }
        if (dirtction.equalsIgnoreCase("left")){
            return "左";
        }
        if (dirtction.equalsIgnoreCase("right")){
            return "右";
        }
       return "命令错误";
    }
}
