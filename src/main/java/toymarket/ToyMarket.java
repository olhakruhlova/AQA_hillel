package toymarket;

public class ToyMarket {

    private Toy[] toys;

    public ToyMarket(Toy[] toys) {
        this.toys = toys;
    }

    private Toy getToyByName(String name) {
        for (Toy toy: toys) {
            if (toy.getName().equals(name)) {
                return toy;
            }
        }
        throw new RuntimeException("В наявності " + name + " не має");
    }
    public void buyToy(Buyer buyer, String nameOfToy) {
        Toy chosenToy = getToyByName(nameOfToy);
        if (buyer.getMoney() > chosenToy.getPrice()) {
            buyer.decteaseMoney(chosenToy.getPrice());
            System.out.println("Іграшка " + nameOfToy + " куплена");
        }
        else {
            System.out.println("Не вистачає коштів, щоб купити " + nameOfToy);
        }
    }
}
