package animals;

public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }

    public void say() {
        System.out.println("I'm dog " + name);
    }
}


