public class Person {
String firstName;
  String secondName;
  String attraction;
  int tickets;


  public Person(String firstName, String secondName,String attraction, int tickets) {
    this.firstName = firstName;
    this.secondName = secondName;
    this.tickets = tickets;
    this.attraction = attraction;
  }


  @Override
  public String toString() {
    return "Person{" +
        "name='" + firstName + '\'' +
        ", lastName='" + secondName + '\'' +
        ", count=" + tickets +
        '}';
  }

  public void setCount(int count) {
    this.tickets = count;
  }

  public int getCount() {
    return tickets;
  }
}
