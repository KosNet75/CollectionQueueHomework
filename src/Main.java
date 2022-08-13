
import java.util.List;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Random;


public class Main {

  public static void main(String[] args) {
    List<Person> person = new LinkedList<>();

    Person.print(generateClients(person));

    ArrayDeque<Person> queue = new ArrayDeque<>();
    // Первое добавление очереди.
    for (Person s : person) {
      queue.addLast(s);
    }

    while (!queue.isEmpty()) {
      Person human = queue.getFirst();

      if (human.tickets > 0) {

        String[] srcArr = {" Карусель ", " Колесо обозрения ", " Качели ", " Башня ",
            " Железная дорога ", " Американские горки ", " Кондор "};
        Random rnd = new Random();
        String[] selectedArr = new String[srcArr.length];
        for (int i = 0; i < human.tickets; i++) {
          selectedArr[i] = srcArr[rnd.nextInt(srcArr.length)];
          String attraction = selectedArr[i];
          human.tickets = human.tickets - 1;
          System.out.println(
              human.firstName + " " + human.secondName + " прокатился на аттракционе" + attraction
                  + "у клиента осталось билетов " + "[" + human.getTicket() + "]");
        }
        queue.addLast(human);
      }
      queue.poll();
    }
  }

  public static List<Person> generateClients(List<Person> persons) {

//    String[] srcArr = {" Карусель ", " Колесо обозрения ",
//        " Качели ", " Башня ",
//        " Железная дорога ", " Американские горки ",
//        " Кондор "};
//    Random rnd = new Random();
//    String[] selectedArr = new String[srcArr.length];
//    for (int i = 0; i < srcArr.length; i++) {
//      selectedArr[i] = srcArr[rnd.nextInt(srcArr.length)];
//    }
//     String attraction = selectedArr[human.tickets];

    persons.add(new Person("Константин", "Густов", 1));
    persons.add(new Person("Ольга", "Федорова", 3));
    persons.add(new Person("Филипп", "Воронов", 4));
    persons.add(new Person("Алёна", "Загрекова", 2));

    return persons;

  }

}


