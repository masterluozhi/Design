package Facade;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReader {
    public String read(String fileName){
        System.out.println("读取文件，获取明文");
        StringBuffer stringBuffer = new StringBuffer();
        try {
            FileInputStream fileInputStream = new FileInputStream(fileName);
                    int data ;
            while((data=fileInputStream.read())!=-1){
                stringBuffer=stringBuffer.append((char)data);
            }
            fileInputStream.close();
            System.out.println(stringBuffer.toString());
        } catch (FileNotFoundException e) {
            System.out.println("文件不存在");
        } catch (IOException e) {
            System.out.println("文件操作错误");
        }

      return  stringBuffer.toString();
    }

}
