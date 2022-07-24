package Proxy.Remote;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class client {
    public static void main(String[] args) {
        InvocationHandler handler=null;
        AbstractDocumentDAO documentDAO=new DocumentDAO();
        AbstaractUserDAO userDAO=new UserDAD();
        handler=new DAOLogHandler(userDAO);
        AbstaractUserDAO proxy=null;
        proxy= (AbstaractUserDAO) Proxy.newProxyInstance(AbstaractUserDAO.class.getClassLoader(), new Class[]{AbstaractUserDAO.class}, handler);
        proxy.findUserById("杨过");

    }
}
