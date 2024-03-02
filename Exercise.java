public class Exercise {

  public static void main(String[] args) {
    Company company = new Company("Maier GmbH");

    Person p1 = new Person("Max Schmid");
    Person p2 = new Person("Hans Mueller");
    Person p3 = new Person("Lisa Meier");

    Employee e1 = new Employee(1, p1, 50000);
    Employee e2 = new Employee(2, p2, 75000);
    Employee e3 = new Employee(3, p3, 40000);

    company.addEmployee(e1);
    company.addEmployee(e2);
    company.addEmployee(e3);
    company.addEmployee(new Employee(4, new Person("Peter Schneider"), 55000));
    company.addEmployee(new Employee(5, new Person("Miriam Albers"), 90000));

    try {
      e1.setSalaryInEuro(55000);
      e2.setSalaryInEuro(77000);
      e3.setSalaryInEuro(45000);
    } catch (SalaryDecreaseException | SalaryIncreaseTooHighException e) {
      System.err.println(e.getMessage());
    }

    // alternative multiple catch:
    try {
      e1.setSalaryInEuro(55000);
      e2.setSalaryInEuro(77000);
      e3.setSalaryInEuro(45000);
    } catch (SalaryDecreaseException e) {
      System.out.println("Das neue Gehalt muss hoeher sein als das bisherige");
    } catch (SalaryIncreaseTooHighException e) {
      System.out.println("Das neue Gehalt darf maximal 10% ueber dem bisherigen Gehalt liegen");
    }

    // alternative instance of
    try {
      e1.setSalaryInEuro(55000);
      e2.setSalaryInEuro(77000);
      e3.setSalaryInEuro(45000);
    } catch (Exception e) {
      if (e instanceof SalaryDecreaseException) {
        System.out.println("Das neue Gehalt muss hoeher sein als das bisherige");
      }
      if (e instanceof SalaryIncreaseTooHighException) {
        System.out.println("Das neue Gehalt darf maximal 10% ueber dem bisherigen Gehalt liegen");
      }
    }

    System.out.println(company.toString());
  }
}
