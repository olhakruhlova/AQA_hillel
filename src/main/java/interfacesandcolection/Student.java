package interfacesandcolection;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public int compareTo(Student parnforotheruser) {
        return this.getName().compareTo(parnforotheruser.getName());
//        return this.age - other.age;
//        return other.age - this.age; // сортування в іншому порядку
    }

    public static void sayHi() {
        System.out.println("Hi");
    }

    static {
        System.out.println("Static code");
        // this.getName(); - не допустимо при створенні статік
    }

    @Override
    public String toString() {
        return this.getName();
    }

    // для того щоб можна було порівнювати обєкти через їхнє наповнення, а не їх силки
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return age == student.age && Objects.equals(name, student.name);
    }
    // це число в яке ми переводимо пераметри обєкту
    @Override
    public int hashCode() {
        return Objects.hash(name.length(), age);
    }
}

