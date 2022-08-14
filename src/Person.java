import java.util.List;

public class Person {
String firstName;
  String secondName;
 // String attraction;
  int quantityTickets;


  public Person(String firstName, String secondName, int quantityTickets) {
    this.firstName = firstName;
    this.secondName = secondName;
    this.quantityTickets = quantityTickets;
   // this.attraction = attraction;
  }

  public int getTickets() {
    return quantityTickets;
  }

  public String toString() {
    return firstName  + " " + secondName + " - купил(а) >> [" + quantityTickets + "] билет(а)";
  }

  public static void printPersonTickets(List<Person> list) {
    for (int i = 0; i < list.size(); i++) {
      System.out.println((i + 1) + ". " +list.get(i));
    }
    System.out.println();
  }
}
