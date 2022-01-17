import javax.swing.*;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Пётр", "Петров",46, 10000));
        persons.add(new Person("Николай", "Николаев",16, 100));
        persons.add(new Person("Сергей", "Сергеев",26, 999));
        persons.add(new Person("Зинаида", "Петрова",41, 5453));
        persons.add(new Person("Галина", "Смирнова",15, 53553));

        // 1. with static
        //Main.getMoney(persons);

        // 2. с экземпляром
//        Main main = new Main();
//        main.getMoney(persons);

        // 3. напрямую
        new Main().getMoney(persons);
    }
    public void getMoney(List<Person> list) {
        for (Person person: list) {
            if(person.getAge() > 18) {
                System.out.println(person.getWages() * 3);
            } else {
                System.out.println(person.getWages() / 2);
            }
        }
    }
// 1. with static
//    public static void getMoney(List<Person> list) {
//        for (Person person: list) {
//            if(person.getAge() > 18) {
//                System.out.println(person.getWages() * 3);
//            } else {
//                System.out.println(person.getWages() / 2);
//            }
//        }
//    }
}

