

import java.util.List;
import java.util.ArrayDeque;
import java.util.LinkedList;


public class Main {


  public static List<Person> generateClients(List<Person> persons) {

    persons.add(new Person("Густов", "Константин", "1", 2));
    persons.add(new Person("Федорова", "Ольга", "1", 5));
    persons.add(new Person("Воронов", "Филипп", "1", 3));
    persons.add(new Person("Алёна", "Загрекова", "1", 6));
    persons.add(new Person("Капитан", "Немо", "1", 1));
    persons.add(new Person("Ким", "5+", "1", 4));
    return persons;

  }
    public static void print(List<Person> list) {
      for (int j = 0; j < list.size(); j++) {
        System.out.println((j + 1) + "." +list.get(j));
      }
    }
 // }


    public static void main(String[] args) {
      List<Person> person = new LinkedList<>();


     print(generateClients(person));
    // System.out.println(generateClients(persons));


      ArrayDeque<Person> client = new ArrayDeque<>();
      // Первое добавление очереди.
      for (Person value : person) {
        client.addLast(value);
      }

      while (!client.isEmpty()) {
        Person p = client.getFirst();

        if (p.tickets > 0) {
          p.tickets -= 1;
          System.out.println(p.firstName + " " + p.secondName + " прокатился на атракционе у клиента осталось билетов "
              + p.getCount());
          client.addLast(p);
        }
        client.poll();
      }
    }
  }


