package ToyStore.data;

import java.util.ArrayList;

import ToyStore.exception.quantityException;

public class Store extends ArrayList<Toy> {

    public Cart cart;

    public Store() {
        super();
    }

    public boolean checkQuantity(int index) {
        if (this.get(index).getQuantity() > 0) {
            return true;
        }
        return false;
    }

    public void addToCart(int index) {
        try {
            if (checkQuantity(index)) {
                cart.add(this.get(index).getId() + ", " + this.get(index).getName());
                this.get(index).setQuantity(this.get(index).getQuantity() - 1);
            }
        } catch (quantityException e) {
            System.out.println(e.getMessage());
        }
    }
}
