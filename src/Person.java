import java.util.List;
import java.util.Random;

public class Person {

  String firstName;
  String secondName;
  int quantityTickets;

  Integer[] rndTickets = {1, 2, 3, 4, 5, 6};
  Random rnd = new Random();
  Integer rndTicket = rndTickets[rnd.nextInt(rndTickets.length)];

  public Person(String firstName, String secondName) {
    this.firstName = firstName;
    this.secondName = secondName;
    this.quantityTickets = rndTicket;
  }

  public static String typeAttraction() {

    String[] srcArr1 = {" Карусель ", " Колесо обозрения ", " Качели ", " Башня ",
        " Железная дорога ", " Американские горки ", " Кондор "};
    Random rnd = new Random();
   // String attraction1 = rnd.nextInt(srcArr1.length);
    String attraction1 = (rnd.nextInt(srcArr1.length));
    return attraction1;
  }

  public int getTickets() {
    return quantityTickets;
  }

  public String toString() {
    return firstName + " " + secondName + " - купил(а) >> [" + quantityTickets + "] билет(а)";
  }

  public static void printPersonTickets(List<Person> list) {
    for (int i = 0; i < list.size(); i++) {
      System.out.println((i + 1) + ". " + list.get(i));
    }
    System.out.println();
  }
}
