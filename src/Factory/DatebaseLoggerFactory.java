package Factory;

public class DatebaseLoggerFactory extends Afactory{
    @Override
    public Logger createLogger() {
        Logger logger = new DatabaseLogger();
        return  logger;
    }

    @Override
    public void wirteLog() {
        System.out.println("写入");
    }
}
