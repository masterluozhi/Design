package common;
//具体命令类
public class ExitCommand  extends Command{
    private  SystemExitClass exitClass;

    public ExitCommand(SystemExitClass exitClass) {
        this.exitClass = exitClass;
    }

    @Override
    public void execute() {
        exitClass.exit();
    }
}
