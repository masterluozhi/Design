package pattern;

public class President extends  Approver{
    public President(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getAmount()<50000){
            System.out.println("董事长"+this.name+"审批采购单"
                    +purchaseRequest.getNumber()+"全额"+purchaseRequest.getAmount()+"采购目的"+purchaseRequest.getPurpose());
        }else {
            this.approver.processRequest(purchaseRequest);
        }
    }
}
