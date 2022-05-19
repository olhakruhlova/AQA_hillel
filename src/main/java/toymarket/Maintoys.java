package toymarket;

public class Maintoys {
public static void main(String[] args) {
    Toy[] toys = {
            new Car("BMW", 80.7f, false),
            new Doll("Barbi", 49.6f, "white")
    };
    ToyMarket toyMarket = new ToyMarket(toys);

    Buyer buyer = new Buyer(89.89f);

    toyMarket.buyToy(buyer, "BMW");
    toyMarket.buyToy(buyer, "Barbi");
    toyMarket.buyToy(buyer, "Ball");
    }
}
