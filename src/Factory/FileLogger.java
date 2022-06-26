package Factory;

public class FileLogger implements Logger{
    @Override
    public void wirteLog() {
        System.out.println("写入文件日志");
    }
}
