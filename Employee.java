public class Employee {

  private int employeeId;
  private Person person;
  private int salary;

  public Employee(int employeeId, Person person, int salary) {
    this.employeeId = employeeId;
    this.person = person;
    this.salary = salary;
  }

  public int getEmployeeId() {
    return employeeId;
  }

  public String getName() {
    return person.getName();
  }

  public int getSalary() {
    return salary;
  }

  public void print() {
    System.out.println(employeeId + " - " + getName() + " - " + salary + "€");
  }
}
