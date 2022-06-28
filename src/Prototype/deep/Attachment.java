package Prototype.deep;

import java.io.Serializable;

public class Attachment implements Serializable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void download(){
        System.out.println("下载"+name);
    }
}
