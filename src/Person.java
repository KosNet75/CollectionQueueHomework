import java.util.List;

public class Person {
String firstName;
  String secondName;
  String attraction;
  int tickets;


  public Person(String firstName, String secondName, int tickets) {
    this.firstName = firstName;
    this.secondName = secondName;
    this.tickets = tickets;


  }




//  int selectCount = 30;
//  String[] srcArr = {"Красный", "Оранжевый", "Желтый", "Зеленый",
//      "Голубой", "Синий", "Фиолетовый"};
//  String[] selectedArr = new String[selectCount];
//  Random rnd = new Random();
//        for (int i = 0; i < selectCount; i++) {
//    selectedArr[i] = srcArr[rnd.nextInt(srcArr.length)];
//  }
//        System.out.println(Arrays.toString(selectedArr));




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
