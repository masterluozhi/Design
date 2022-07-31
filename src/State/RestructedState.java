package State;

public class RestructedState extends AccountState{
    public RestructedState(AccountState accountState) {
        this.account=accountState.account;
    }

    @Override
    public void withdraw(double amount) {

    }

    @Override
    public void deposite(double amount) {

    }

    @Override
    public void computeInterest() {

    }

    @Override
    public void stateCheck() {

    }
}
