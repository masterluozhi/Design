package Prototype.shallow;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        WeeklyLog log,lognew;
        log=new WeeklyLog();
        Attachement attachement=new Attachement();
        log.setAttachement(attachement);
        lognew=log.clone();
        System.out.println(log==lognew);
        System.out.println(log.getAttachement()==lognew.getAttachement());
    }
}
