public class SalaryIncreaseTooHighException extends Exception {

  public SalaryIncreaseTooHighException() {
    super("Das neue Gehalt darf maximal 10% ueber dem bisherigen Gehalt liegen");
    // alternativ: super();
  }
}
