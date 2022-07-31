package memento;

public class Client {
    public static void main(String[] args) {
        MementoCaretaker mementoCaretaker=new MementoCaretaker();
        Chessman chessman=new Chessman("车",1,2);
        mementoCaretaker.setChessmanMemento(chessman.save());

        chessman.restore(mementoCaretaker.getChessmanMemento());
    }
}
