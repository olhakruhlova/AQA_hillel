package toymarket;

public class Doll extends Toy {
    private String colorOfHeir;

    public Doll(String name, float price, String colorOfHeir) {
        super(name,price);
        this.colorOfHeir = colorOfHeir;
    }
}
