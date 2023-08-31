public class Exercise {

  public static void main(String[] args) {
    Queries queries = new Queries(DataProvider.getFootballers());
    queries.getAllFootballersByBirthyear()
        .values().stream()
        .forEach(System.out::println);
    // add more queries as you wish
  }
}
