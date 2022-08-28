package design.pattern.study.observer;

public class Button {

    private String name;
    private IButtonListener buttonListener;

    public Button(String name) {
        this.name = name;
    }

    /**
     * 리스너에게 메시지를 전달
     */
    public void click(String message) {
        buttonListener.clickEvent(message);
    }

    public void addButtonListener(IButtonListener buttonListener) {
        this.buttonListener = buttonListener;
    }
}
