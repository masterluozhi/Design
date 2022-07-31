package State;

public abstract class AccountState {
    protected Account account;
    public abstract void  withdraw(double amount);
    public abstract void  deposite(double amount);
    public abstract void  computeInterest();
    public abstract void stateCheck();
}
