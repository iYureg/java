package ToyStore.exception;

public class quantityException extends RuntimeException {

    public quantityException(int quantity) {
        super("нет в наличии: " + quantity);
    }

    public quantityException() {
        super("извините, товара нет в наличии");
    }

}
