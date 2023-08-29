package ToyStore.data;

import java.util.ArrayList;

import ToyStore.exception.quantityException;

public class Store extends ArrayList<Toy> {

    public Cart cart;

    public Store() {
        super();
        this.cart = new Cart();
    }

    public boolean checkQuantity(int index) {
        if (this.get(index).getQuantity() > 0) {
            return true;
        }
        return false;
    }

    public void addToCart(int index) {

        if (checkQuantity(index)) {
            this.cart.add("ID_" + this.get(index).getId());
            this.get(index).setQuantity(this.get(index).getQuantity() - 1);
        } else {
            throw new quantityException(this.get(index).getQuantity());
        }
    }

    public boolean isEmpty() {
        if (this.cart.size() > 0) {
            return false;
        }
        return true;
    }
}
