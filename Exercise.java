public class Exercise {

  public static void main(String[] args) {
    TelephoneBook telephoneBook = new TelephoneBook();

    telephoneBook.addEntry(new TelephoneBook.Person("Hans Maier"), new TelephoneBook.TelephoneNumber("+49 67234 887261"));
    telephoneBook.addEntry(new TelephoneBook.Person("Peter Mueller"), new TelephoneBook.TelephoneNumber("+49 7529 87612"));
    telephoneBook.addEntry(new TelephoneBook.Person("Lisa Schmidt"), new TelephoneBook.TelephoneNumber("+49 8762 52081"));

    System.out.println(telephoneBook.getTelephoneNumberByName("Hans Maier"));
  }
}
