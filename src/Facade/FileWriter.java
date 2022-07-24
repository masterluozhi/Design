package Facade;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileWriter {
    public void  wirte(String encryptStr,String fileNameDate){
        System.out.println("保存密码,写入文件");
        try{
            FileOutputStream fileOutputStream = new FileOutputStream(fileNameDate);
            fileOutputStream.write(encryptStr.getBytes(StandardCharsets.UTF_8));
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("文件不存在！");
        } catch (IOException e) {
            System.out.println("文件操作错误！");
        }
    }
}
