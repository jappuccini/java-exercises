import java.util.ArrayList;

public class Company {

  private String name;
  private ArrayList<Employee> employees;
  private int numberOfEmployees;

  public Company(String name) {
    this.name = name;
    employees = new ArrayList<>();
  }

  public void addEmployee(Employee employee) {
    employees.add(employee);
    numberOfEmployees++;
  }

  public void print() {
    System.out.println(name + " (" + numberOfEmployees + " Mitarbeiter)");
    for (Employee e : employees) {
      e.print();
    }
  }
}
