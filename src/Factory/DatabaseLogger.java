package Factory;

public class DatabaseLogger implements Logger{
    @Override
    public void wirteLog() {
        System.out.println("创建数据库日志");
    }
}
