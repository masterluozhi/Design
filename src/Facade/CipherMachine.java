package Facade;

public class CipherMachine {
    public String encrypt(String plainText){
        System.out.println("将明文转换为密文");
        StringBuilder es= new StringBuilder();
        for (int i = 0; i < plainText.length(); i++) {
            String s = String.valueOf(plainText.charAt(i) % 7);
            es.append(s);
        }
        System.out.println(es);
        return es.toString();
    }
}
