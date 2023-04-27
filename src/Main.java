import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person person;
        Deque<Person> list = new LinkedList<>(generateClients());

        while (!list.isEmpty()) {
            person = list.poll();
            if (person.tickets != 0) {
                System.out.println(person + " прокатился на аттракционе");
                person.tickets -= 1;
                list.offerLast(person);
            }
        }
    }

    public static List<Person> generateClients() {
        List<Person> list = new LinkedList<>();
        list.add(new Person("Альберт", "Эйнштейн", 7));
        list.add(new Person("Исаак", "Ньютон", 3));
        list.add(new Person("Никола", "Тесла", 2));
        list.add(new Person("Майкл", "Фарадей", 4));
        list.add(new Person("Мария", "Кюри", 1));
        return list;

    }
}