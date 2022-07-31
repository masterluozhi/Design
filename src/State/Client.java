package State;

public class Client {
    public static void main(String[] args) {
        Account account=new Account("段誉",0.0);
        account.deposite(1000);
        account.withdraw(2000.00);
        account.deposite(3000);
        account.withdraw(4000.00);
        account.withdraw(1000.00);
        account.computeInterest();
    }
}
