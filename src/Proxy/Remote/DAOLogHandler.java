package Proxy.Remote;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DAOLogHandler implements InvocationHandler {
    private Calendar calendar;
    private  Object o;
    public DAOLogHandler() {
    }
    public DAOLogHandler(Object o) {
        this.o = o;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        this.before();
        Object invoke = method.invoke(o, args);
        this.after();
        return invoke;

    }
    public void before(){
        calendar=new GregorianCalendar();
        System.out.println( calendar.get(Calendar.HOUR_OF_DAY));
    }
    public void after(){
        System.out.println("调用方法结束");
    }
}
