package interfacesandcolection;

import java.util.*;

public class InterfacesMain {
    public static void main(String[] arge) {

        Student vasia = new Student("Vasya", 25);
        Student vasia2 = new Student("Petia", 25);
        Student anya = new Student("Anya", 18);

        // Порівняння двох обєктів з однаковими властивостями
        System.out.println(vasia.equals(vasia2)); // віддасть false

        //В цій колекції можна зберігати тільки унікальні обєкти
        Set<Student> studentshash = new HashSet<>();
        studentshash.add(vasia);
        studentshash.add(vasia2);//не додався
        System.out.println(studentshash.size()); // 1

        Student[] students = {anya, vasia, vasia2}; //масив

        List<Student> studentList = new ArrayList<>();// колекція
        studentList.add(vasia);
        studentList.add(vasia2);
        studentList.add(anya);
        System.out.println(studentList.size());

        System.out.println(vasia);//щоб виводило імя заюзала toString метод

        for (Student student  : students) {
            System.out.println(student.getName() + " " + student.getAge());
        }

        System.out.println("=================sorted by name==============");
        Arrays.sort(students);
        for (Student student : students) {
            System.out.println(student.getName() + " " + student.getAge());
        }

        System.out.println("=================sorted by age==============");
        ComparatorByAge comparatorByAge = new ComparatorByAge();
        Arrays.sort(students, comparatorByAge);
        for (Student student : students) {
            System.out.println(student.getName() + " " + student.getAge());
        }

        // щоб для створення кожного сортера не створювати окремий клас Comparator та не писати купу коду
        // можна обійти за допогою опису анонімного класу (обєкту)
//        Arrays.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getAge() - o2.getAge();
//            }
        //  тому клас можна видалити

        // ще простыше можна через Лямбду -це анонімна реалізація інтерфейса
//        Arrays.sort(students,(o1, o2) -> o1.getAge() - o2.getAge() );


        Student student = new Student("Nik", 23);
        Student.sayHi(); // якшо він статичний цей метод то ми можемо з ним працювати без конструктора

        Map<Student, Integer> marks = new HashMap<>();
        marks.put(vasia, 90);
        marks.put(vasia2,75);

        System.out.println(marks.get(vasia));

        }
    }
