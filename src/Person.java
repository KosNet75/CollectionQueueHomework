import java.util.List;

public class Person {
String firstName;
  String secondName;
 // String attraction;
  int tickets;


  public Person(String firstName, String secondName, int tickets) {
    this.firstName = firstName;
    this.secondName = secondName;
    this.tickets = tickets;
   // this.attraction = attraction;

  }


  @Override
  public String toString() {
    return firstName  + " " + secondName + " - купил(а) [" + tickets + "] билет(а)";
//        "Person{" +
//        "name='" + firstName + '\'' +
//        ", lastName='" + secondName + '\'' +
//        ", count=" + tickets +
//        '}';
  }

  public int getTicket() {
    return tickets;
  }

  public static void printPersonTickets(List<Person> list) {
    for (int i = 0; i < list.size(); i++) {
      System.out.println((i + 1) + "." +list.get(i));
    }
  }
}
