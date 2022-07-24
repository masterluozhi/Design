package Proxy.Normal;

public class ProxySearcher implements  Seacher{
    private  RealSearcher realSearcher=new RealSearcher();
    private AccessValidator accessValidator;
    private Logger logger;

    @Override
    public String doSeacher(String userId, String keyword) {
        if (this.accessValidator(userId)){
            String s = realSearcher.doSeacher(userId, keyword);
            this.log(userId);
            return s;

        }else {
            return null;
        }
    }
    //调用日志记录对象并调用其log方法
    private void log(String userId) {
        logger=new Logger();
        logger.log(userId);
    }
    //创建访问验证对象并调用其验证方法
    private boolean accessValidator(String userId) {
       accessValidator=new AccessValidator();
       return accessValidator.validate(userId);
    }
}
