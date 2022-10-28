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

    public void setSalary(int salary) throws SalaryDecreaseException, SalaryIncreaseTooHighException {
      if (salary < this.salary) {
        throw new SalaryDecreaseException();
      }

      double increase = (double) (salary - this.salary) / this.salary;
      if (increase > 0.1) {
        throw new SalaryIncreaseTooHighException();
      }

      this.salary = salary;
    }

    public void print() {
      System.out.println(employeeId + " - " + getName() + " - " + salary + " Euro");
    }
  }
}
