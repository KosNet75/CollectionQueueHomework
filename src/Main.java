import java.util.List;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Random;


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

        String[] srcArr = {" Карусель ", " Колесо обозрения ", " Качели ", " Башня ",
            " Железная дорога ", " Американские горки ", " Кондор "};
           Random rnd = new Random();
          String attraction = srcArr[rnd.nextInt(srcArr.length)];
          human.quantityTickets = human.quantityTickets - 1;
          System.out.println(
              human.firstName + " " + human.secondName + " прокатился на аттракционе" + attraction
                  + "у клиента осталось билетов " + "[" + human.getTickets() + "]");

        queue.addLast(human);
      }
      queue.poll();
    }
  }
  public static List<Person> generateClients(List<Person> persons) {

    persons.add(new Person("Николай", "Романов", 3));
    persons.add(new Person("Евдокия", "Лопухина", 5));
    persons.add(new Person("Александр", "Меньшиков", 4));
    persons.add(new Person("Екатерина", "Шуйская", 2));
    persons.add(new Person("Василий", "Голицин", 1));
    return persons;
  }

}


