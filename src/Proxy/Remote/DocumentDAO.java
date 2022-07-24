package Proxy.Remote;

public class DocumentDAO implements  AbstractDocumentDAO{
    @Override
    public boolean delDocumentById(String userId) {
        if (userId.equalsIgnoreCase("杨过")){
            return true;
        }else {
            return false;
        }

    }
}
