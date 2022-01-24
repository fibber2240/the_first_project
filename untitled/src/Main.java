import javax.swing.*;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        /**
         * Задача 1.1
         */
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Пётр", "Аетров",46, 10000));
        persons.add(new Person("Николай", "Николаев",16, 100));
        persons.add(new Person("Сергей", "Сергеев",26, 999));
        persons.add(new Person("Зинаида", "Петрова",41, 5453));
        persons.add(new Person("Галина", "Смирнова",15, 53553));
        // Создаём экземпляр класса и через него вызываем метод getMoney()
        Main main = new Main();
        main.selectionByAgeAndSalary(persons);
//        main.getMoney(persons);

//        System.out.println(main.countPeople(persons));
    }

    /**
     * Задача 1.2
     * @param list
     */
//    public void getMoney(List<Person> list) {
//        for (Person person: list) {
//            if(person.getAge() > 18) {
//                System.out.println(person.getWages() * 3);
//            } else {
//                System.out.println(person.getWages() / 2);
//            }
//        }
//    }
    /**
     * Задача 1.3
     */
//    public void countPeopleGreather500 (List <Person> personList){
//        for (Person person : personList) {
//           if (person.getWages() < 500)  {
//               System.out.println(person);
//           }
//        }
//    }
    /**
     * Задача 1.4
     */

//    private int countPeople(List<Person> list) {
//        int count = 0;
//        for (Person person : list) {
//            if (person.getWages() < 1000) {
//                count++;
//            }
//        }
//        return count;
//    }
/**
 * Задача 1.5
 */
//    public void firstLetterA (List <Person> list){
//        for (Person person: list){
//            if (person.getSurname().startsWith("А")) {
//                System.out.println(person);
//            }
//        }
//    }
/**
 * Задача 1.6
 */
        public void selectionByAgeAndSalary(List <Person> list){
            for (Person person:list) {
                if (person.getAge()>30 && person.getWages()>1000){
                    System.out.println(person);
                }
            }

}

































}

