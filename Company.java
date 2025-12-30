import java.util.ArrayList;

public class Company {

  private final String name;
  private final ArrayList<Employee> employees;
  private int numberOfEmployees;

  public Company(String name) {
    this.name = name;
    employees = new ArrayList<>();
    numberOfEmployees = 0;
  }

  public String getName() {
    return name;
  }

  public ArrayList<Employee> getEmployees() {
    return employees;
  }

  public int getNumberOfEmployees() {
    return numberOfEmployees;
  }

  public void addEmployee(Employee employee) {
    employees.add(employee);
    numberOfEmployees++;
  }

  public String toString() {
    String result = "";
    result += name + " (" + numberOfEmployees + " Mitarbeiter)" + "\n";
    for (Employee employee : employees) {
      result += employee.toString() + "\n";
    }
    return result;
  }
}
