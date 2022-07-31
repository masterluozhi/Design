package pattern;

public class Director extends  Approver{
    public Director(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getAmount()<5000){
            System.out.println("主任"+this.name+"审批采购单"
                    +purchaseRequest.getNumber()+"全额"+purchaseRequest.getAmount()+"采购目的"+purchaseRequest.getPurpose());
        }else {
            this.approver.processRequest(purchaseRequest);
        }
    }
}
