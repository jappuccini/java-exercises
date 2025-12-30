import java.util.ArrayList;

public class Rental implements Partner {

  private final String name;
  private final ArrayList<Vehicle> vehicles;

  public Rental(String name) {
    this.name = name;
    vehicles = new ArrayList<>();
  }

  public String getName() {
    return name;
  }

  public ArrayList<Vehicle> getVehicles() {
    return vehicles;
  }

  public void addVehicle(Vehicle vehicle) {
    vehicles.add(vehicle);
  }

  public void addAllVehicles(Vehicle... vehicles) {
    for (Vehicle v : vehicles) {
      this.vehicles.add(v);
    }
  }

  public void transformAllTrucks() {
    for (Vehicle c : vehicles) {
      if (c instanceof Truck) {
        Truck t = (Truck) c;
        t.transform();
      }
    }
  }

  public String toString() {
    String result = name + "\n" + "Unsere Fahrzeuge: \n";
    for (Vehicle vehicle : vehicles) {
      result += vehicle.toString() + "\n";
    }
    return result;
  }
}
