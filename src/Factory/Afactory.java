package Factory;

public abstract  class Afactory {
    public void wirteLog(){
        Logger logger=this.createLogger();
        logger.wirteLog();
    }
    public  abstract  Logger createLogger();
}
