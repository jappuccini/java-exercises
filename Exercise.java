public class Exercise {

  public static void main(String[] args) {
    Queries queries = new Queries(DataProvider.getConsoles());
    System.out.println(queries.getAllConsolesByMaker());
    // make more queries as you wish
  }
}
