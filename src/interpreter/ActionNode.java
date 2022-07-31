package interpreter;

public class ActionNode extends AbstractNode{
    private String action;

    public ActionNode(String action) {
        this.action = action;
    }

    @Override
    public String interpreter() {
        if (action.equalsIgnoreCase("move")){
            return "快速";
        }else if (action.equalsIgnoreCase("run")){
            return "快速移动";
        }else {
            return "无效指令";
        }
    }
}
