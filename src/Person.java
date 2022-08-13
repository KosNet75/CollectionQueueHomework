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


  }


  @Override
  public String toString() {
    return "Person{" +
        "name='" + firstName + '\'' +
        ", lastName='" + secondName + '\'' +
        ", count=" + tickets +
        '}';
  }

  public int getTicket() {
    return tickets;
  }

  public static void print(List<Person> list) {
    for (int j = 0; j < list.size(); j++) {
      System.out.println((j + 1) + "." +list.get(j));
    }
  }
}
