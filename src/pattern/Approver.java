package pattern;

public abstract  class Approver {
    protected Approver approver;//定义后继对象
    protected String name;//审判者姓名

    public Approver(String name) {
        this.name = name;
    }
    //设置后继者
    public void setSuccessor(Approver approver){
        this.approver=approver;
    }
    //抽象请求处理方法
    public abstract  void processRequest(PurchaseRequest purchaseRequest);
}
