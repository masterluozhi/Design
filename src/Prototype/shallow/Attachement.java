package Prototype.shallow;

public class Attachement {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void download(){
        System.out.println("下载附件"+name);
    }
}
