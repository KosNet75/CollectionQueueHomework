import java.util.List;
import java.util.ArrayDeque;
import java.util.LinkedList;

public class Main {

  public static void main(String[] args) {
    List<Person> person = new LinkedList<>();

    System.out.println();
    Person.printPersonTickets(generateClients(person));

    ArrayDeque<Person> queue = new ArrayDeque<>();
    for (Person s : person) {
      queue.addLast(s);
    }

    while (!queue.isEmpty()) {
      Person human = queue.getFirst();

      if (human.quantityTickets > 0) {
        human.quantityTickets = human.quantityTickets - 1;
        System.out.println(
            human.firstName + " " + human.secondName + " прокатился на аттракционе"
                + Person.typeAttraction()
                + "у клиента осталось билетов " + "[" + human.getTickets() + "]");

        queue.addLast(human);
      }
      queue.poll();
    }
  }

  public static List<Person> generateClients(List<Person> persons) {

    persons.add(new Person("Николай", "Романов"));
    persons.add(new Person("Евдокия", "Лопухина"));
    persons.add(new Person("Александр", "Меньшиков"));
    persons.add(new Person("Екатерина", "Шуйская"));
    persons.add(new Person("Василий", "Голицин"));
    return persons;
  }
}


