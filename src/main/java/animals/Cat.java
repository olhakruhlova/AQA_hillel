package animals;

public class Cat extends Animal { //використовуэмо ключеве слово для наслыдування
    public Cat(String name, int age) { //створюэмо такий самий конструктор як в класы предку
        super(name, age); //визиваэмо конструктор з предка
    }

    @Override // в даного метода є супер метод якого він переоприділяє
    public void say() {
        System.out.println(name + " say 'Meiy'");
    }

    void say(String value) {
        System.out.println(name + " say " + value);
    }
}