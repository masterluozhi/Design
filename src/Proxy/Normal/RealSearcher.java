package Proxy.Normal;

public class RealSearcher implements  Seacher{
    @Override
    public String doSeacher(String userId, String keyword) {
        System.out.println(userId+"使用关键词"+keyword+"查询商务信息");
        return "返回具体内容";
    }
}
