package Template;

public abstract  class Account {
    public boolean vaildate(String name,String password){
        if (name.equalsIgnoreCase("111")&&password.equalsIgnoreCase("222")){
            return true;
        }else {
            return false;
        }
    }
    public  abstract void calcu();
    public void disPlay(){
        System.out.println("显示利息");
    }
    public void hanle(String acc,String pass){
        if (!vaildate(acc,pass)){
            System.out.println("密码账号错误");
            return;
        }
        calcu();
        disPlay();
    }
}
