package Prototype.shallow;

public class WeeklyLog implements  Cloneable{
    private Attachement attachement;
    private  String name;
    private String date;
    private String content;

    public Attachement getAttachement() {
        return attachement;
    }

    public void setAttachement(Attachement attachement) {
        this.attachement = attachement;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    public WeeklyLog clone() throws CloneNotSupportedException {
        Object o=null;
        o=super.clone();
        return (WeeklyLog)o;
    }
}
