package toymarket;

public class Car extends Toy {
    private boolean isElectric;

    public Car(String name, float price, boolean isElectric) {
        super(name, price);
        this.isElectric  = isElectric;
    }
}
