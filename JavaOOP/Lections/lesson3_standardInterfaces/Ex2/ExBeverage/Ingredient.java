package JavaOOP.Lections.lesson3_standardInterfaces.Ex2.ExBeverage;

public abstract class Ingredient {
    public String brand;

    public Ingredient(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return brand;
    }
}
