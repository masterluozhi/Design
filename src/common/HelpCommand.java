package common;

public class HelpCommand extends  Command{
    private  DisplayHelpClass obj;

    public HelpCommand(DisplayHelpClass obj) {
        this.obj = obj;
    }

    @Override
    public void execute() {
        obj.display();
    }
}
