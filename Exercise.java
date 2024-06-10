import java.util.HashMap;

public class Exercise {

  public static void main(String[] args) {
    TelephoneBook telephoneBook = new TelephoneBook(new HashMap<>());

    telephoneBook.addEntry(
        new Person("Hans Maier"),
        new TelephoneNumber("+49 67234 887261"));
    telephoneBook.addEntry(
        new Person("Peter Mueller"),
        new TelephoneNumber("+49 7529 87612"));
    telephoneBook.addEntry(
        new Person("Lisa Schmidt"),
        new TelephoneNumber("+49 8762 52081"));

    System.out.println(telephoneBook.getTelephoneNumberByName("Hans Maier"));
  }
}
