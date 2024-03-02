public class SalaryDecreaseException extends Exception {

  public SalaryDecreaseException() {
    super("Das neue Gehalt muss hoeher sein als das bisherige");
    // alternativ: super();
  }
}
