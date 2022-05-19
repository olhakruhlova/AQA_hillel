package toymarket;

public abstract class Toy {
    protected String name;
    protected float price;

    public Toy (String name, float price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;

    }

    public float getPrice() {
        return price;

    }
}

