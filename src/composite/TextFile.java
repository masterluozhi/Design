package composite;

public class TextFile extends  AbstractFile{
    private String name;

    public TextFile(String name) {
        this.name = name;
    }

    @Override
    public void add(AbstractFile file) {
        System.out.println("不支持");
    }

    @Override
    public void remove(AbstractFile file) {
        System.out.println("不支持");
    }

    @Override
    public AbstractFile getChild(int i) {
        System.out.println("不支持");
        return null;
    }

    @Override
    public void kllValues() {
        System.out.println("对"+name+"进行杀毒");
    }
}
