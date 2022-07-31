package State;

public class OverdraftState extends AccountState{

    public OverdraftState(AccountState accountState) {
        this.account=accountState.account;
    }

    @Override
    public void withdraw(double amount) {
        account.setBalance(account.getBalance()+amount);
        stateCheck();
    }

    @Override
    public void deposite(double amount) {
        account.setBalance(account.getBalance()-amount);
        stateCheck();
    }

    @Override
    public void computeInterest() {
        System.out.println("正常状态，无需支付利息");
    }

    @Override
    public void stateCheck() {
        if (account.getBalance()>0){
            account.setState(new NormalState(this));
        }else if (account.getBalance()==-2000){
            account.setState(new RestructedState(this));
        }else if (account.getBalance()<-2000){
            System.out.println("操作受限");
        }
    }
}
