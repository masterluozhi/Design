package Factory;

public class FileLoggerFactory implements Factory{
    @Override
    public Logger createLogger() {
    Logger logger = new FileLogger();
    return  logger;
    }
}
