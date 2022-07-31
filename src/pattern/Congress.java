package pattern;

public class Congress extends Approver{
    public Congress(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getAmount()<100000){
            System.out.println("董事会"+this.name+"审批采购单"
                    +purchaseRequest.getNumber()+"全额"+purchaseRequest.getAmount()+"采购目的"+purchaseRequest.getPurpose());
        }else {
            this.approver.processRequest(purchaseRequest);
        }
    }
}
