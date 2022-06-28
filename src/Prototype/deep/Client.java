package Prototype.deep;


import java.io.IOException;

public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        WeeklyLog log,log1;
        log=new WeeklyLog();
        Attachment attachment=new Attachment();
        log.setAttachment(attachment);
        log1=log.deepClone();
        System.out.println(log==log1);
        System.out.println(log.getAttachment()==log1.getAttachment());
    }
}
