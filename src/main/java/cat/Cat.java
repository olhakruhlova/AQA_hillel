package cat;

public class Cat {
    int age;
    String name;

    static int count = 0;
    Cat(String name){
        System.out.println("Я нарродився");
        this.name = name; // this ключ слово що звертаэться до змынноъ обэкта
        count ++;
    }

    Cat() {
        System.out.println("Кіт - Конструктор без параметра");
        count ++;
    }

    void say() {
        System.out.println("cat.Cat " + name + " say 'Meiy'");
    }

    void say(String value) {
        System.out.println("cat.Cat " + name + " say " + value);
    }

    void nike (String value) {
        name = value;
    }
}

