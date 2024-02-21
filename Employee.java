public class Employee {

  private final int employeeId;
  private final Person person;
  private int salaryInEuro;

  public Employee(int employeeId, Person person, int salaryInEuro) {
    this.employeeId = employeeId;
    this.person = person;
    this.salaryInEuro = salaryInEuro;
  }

  public int getEmployeeId() {
    return employeeId;
  }

  public String getName() {
    return person.getName();
  }

  public int getSalaryInEuro() {
    return salaryInEuro;
  }

  public void setSalaryInEuro(int salaryInEuro) {
    this.salaryInEuro = salaryInEuro;
  }

  public String toString() {
    return employeeId + " - " + getName() + " - " + salaryInEuro + "€";
  }
}
