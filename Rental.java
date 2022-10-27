import java.util.ArrayList;

public class Rental {

  private String name;
  private ArrayList<Vehicle> vehicles;

  public Rental(String name) {
    this.name = name;
    vehicles = new ArrayList<>();
  }

  public void addVehicle(Vehicle vehicle) {
    vehicles.add(vehicle);
  }

  public void addAllVehicles(Vehicle... vehicles) {
    for (Vehicle v : vehicles) {
      this.vehicles.add(v);
    }
  }

  public void print() {
    System.out.println(name);
    System.out.println("Unsere Fahrzeuge: ");
    for (Vehicle v : vehicles) {
      v.print();
    }
  }
}
