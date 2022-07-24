package Facade;

public class EncryptFacade {
    //维系对子系统对象的应用
    private  FileReader fileReader;
    private  CipherMachine cipherMachine;
    private FileWriter fileWriter;
    public EncryptFacade(){
        fileReader=new FileReader();
        cipherMachine=new CipherMachine();
        fileWriter=new FileWriter();
    }
    public void fileEncrypt(String fileNameSrc,String fileNameDes){
        String read = fileReader.read(fileNameSrc);
        String encrypt = cipherMachine.encrypt(read);
        fileWriter.wirte(encrypt,fileNameDes);
    }
}
