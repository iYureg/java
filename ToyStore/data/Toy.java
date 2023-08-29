package ToyStore.data;

import java.util.Random;

public class Toy {
    Random r = new Random();

    protected String id;
    protected String name;
    protected int quantity;
    protected int chance;

    public Toy(String name, int quantity, int chance) {
        this.id = name + r.nextInt(Integer.MAX_VALUE);
        this.name = name;
        this.quantity = quantity;
        this.chance = chance;
    }

    public Toy(String name) {
        this.id = name + r.nextInt(Integer.MAX_VALUE);
        this.name = name;
        this.quantity = 1;
        this.chance = r.nextInt(100);
    }

    public void setChance(int chance) {
        this.chance = chance;
    }

    public int getChance() {
        return this.chance;
    }

    public void setQuantity(int value) {
        this.quantity = value;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public String getInfo() {
        return String.format("%s, quantity: %d, chance: %d", this.name, this.quantity, this.chance);
    }

}
