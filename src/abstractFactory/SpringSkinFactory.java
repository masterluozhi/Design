package abstractFactory;


public class SpringSkinFactory implements SkinFactory {

    @Override
    public Button createdButton() {
        return new SpringButton();
    }

    @Override
    public ComboBox createdComboBox() {
        return new SpringComboBox();
    }

    @Override
    public TextFileld createdTextFileld() {
        return new SpringTextFileld();
    }
}
