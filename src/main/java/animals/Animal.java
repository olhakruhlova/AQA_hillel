package animals;

public abstract class Animal {
    protected int age;
    protected String name;

    public Animal (String name, int age) {
        System.out.println("I was born");
        this.name = name; // this ключ слово що звертаэться до змынноъ обэкта
        this.age = age;
        count++;
    }
    static int count = 0;

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            throw new AssertionError();
        }
    }

    public abstract void say();
}
