public class WindowsFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowsButtoon();
    }

    @Override
    public CheckBox createCheckbox() {
        return new WindowsCheckBox();
    }
}
