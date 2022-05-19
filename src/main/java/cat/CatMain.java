package cat;

public class CatMain {
    public static void main(String[] args) {
        // Work with cat.Cat
        Cat cat1 = new Cat("Barsick");
        cat1.age = 5;

        cat1.say();

        Cat cat2 = new Cat("Murzik");
        cat2.age = 2;

        cat2.say("'MyrMyr'");

        Cat cat = new Cat();

        System.out.println(Cat.count);
    }
}
