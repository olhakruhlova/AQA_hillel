package animals;

public class AnimalsMain {
    public static void main(String[] args) {
        // Cat
        Animal cat1 = new Cat("Barsic", 7);
        cat1.say();
        System.out.println("My name is " + cat1.getName()); //приклад інкапсуляції, ми можемо отримати лише значення зміннної, однак не можемо його змінити.
        System.out.println("I'm " + cat1.getAge() + " years old");
        System.out.println(cat1); // метод описано в класі Object
        Cat cat2 = new Cat("Murzik", 2);

        cat2.say("'MyrMyr'");

        System.out.println("We created " + Cat.count + " cats");
        System.out.println();

        // Dog
        Animal dog1 = new Dog ("Rex", 11);
        System.out.println("My name is " + dog1.getName()); //приклад інкапсуляції, ми можемо отримати лише значення зміннної, однак не можемо його змінити.
        System.out.println("I'm " + dog1.getAge() + " years old");
        dog1.say();

        System.out.println();
        //Animal
//        Animal animal = new Animal("Bee", 6); - не логічно створювати даний обєкт бо його не існує в природі
//        animal.say();
        // заборонити створювати такі обєкти моржна обявляючи цей клас абстрактним
    }
}
