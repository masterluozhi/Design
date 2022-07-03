package composite;

import java.util.ArrayList;

public class Folder extends AbstractFile{
    private ArrayList<AbstractFile> fileList=new ArrayList<>();
    private String name;
    public Folder(String name) {
        this.name = name;
    }
    @Override
    public void add(AbstractFile file) {
        fileList.add(file);
    }

    @Override
    public void remove(AbstractFile file) {
       file.remove(file);
    }

    @Override
    public AbstractFile getChild(int i) {
        return  fileList.get(i);
    }

    @Override
    public void kllValues() {
        System.out.println("进行杀毒");
        for (AbstractFile file :fileList
             ) {
            file.kllValues();

        }

    }
}
