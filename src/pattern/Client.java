package pattern;

public class Client {
    public static void main(String[] args) {
        Approver wjzhang,gyan,jguo,meeting;
        wjzhang=new Director("张无忌");
        gyan=new VicePresident("郭靖");
        jguo=new President("杨过");
        meeting=new Congress("武林盟主");
        //创建责任链
        wjzhang.setSuccessor(gyan);
        gyan.setSuccessor(jguo);
        jguo.setSuccessor(meeting);
        //创建采购单
        PurchaseRequest 购买倚天剑 = new PurchaseRequest(4500, 10001, "购买倚天剑");
        wjzhang.processRequest(购买倚天剑);
        PurchaseRequest 购买葵花宝典 = new PurchaseRequest(6000, 10002, "购买葵花宝典");
        wjzhang.processRequest(购买葵花宝典);
        PurchaseRequest 购买金刚经 = new PurchaseRequest(16000, 10003, "购买金刚经");
        wjzhang.processRequest(购买金刚经);
        PurchaseRequest 购买桃花岛 = new PurchaseRequest(80000, 10004, "购买桃花岛");
        wjzhang.processRequest(购买桃花岛);

    }
}
