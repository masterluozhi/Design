package Proxy.Remote;

public class UserDAD implements  AbstaractUserDAO{
    @Override
    public boolean findUserById(String userId) {
        if (userId.equalsIgnoreCase("杨过")){
            return true;
        }else {
            return false;
        }

    }
}
