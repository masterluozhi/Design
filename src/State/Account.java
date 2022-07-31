package State;

public class Account {
    private AccountState state;
    private String owner;
    private double balance=0;

    public Account( String owner, Double init) {
        this.owner = owner;
        this.balance = balance;
        this.state=new NormalState(this);
        System.out.println(this.owner+"开户"+"金额"+init);
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void setState(AccountState state) {
        this.state = state;

    }
    public void deposite(double amount){
        System.out.println(this.owner+"存款"+amount);
        state.deposite(amount);
        System.out.println("余额"+this.balance);
        System.out.println("现在账户状态"+this.state.getClass().getName());
    }
    public void  withdraw(Double amount){
        System.out.println(this.owner+"取款"+amount);
        state. withdraw(amount);
        System.out.println("余额"+this.balance);
        System.out.println("现在账户状态"+this.state.getClass().getName());
    }
    public void computeInterest(){
        state.computeInterest();
    }
}
