package abstractFactory;

public class SummerSkinFactory implements SkinFactory {

    @Override
    public Button createdButton() {
        return new SummerButton();
    }

    @Override
    public ComboBox createdComboBox() {
        return new SummerComboBox();

    }

    @Override
    public TextFileld createdTextFileld() {
        return new SummerTextFileld();
    }
}
