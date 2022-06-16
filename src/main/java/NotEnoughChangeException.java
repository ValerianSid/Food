public class NotEnoughChangeException extends Exception {

    public NotEnoughChangeException() {
        super("Нет сдачи. Что-нибудь еще?");

    }
}
