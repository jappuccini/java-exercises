public class Exercise {

  public static void main(String[] args) {
    System.out.println("Anzahl Fahrzeuge: " + Vehicle.getNumberOfVehicles());

    Vehicle vehicle = new Vehicle("Porsche", "911");
    Vehicle vehicle1 = new Vehicle("Porsche", "911");
    Vehicle vehicle2 = new Vehicle("MAN", "TGX");
    Vehicle vehicle3 = new Vehicle("Opel", "Zafira Life");

    vehicle.accelerate(30);
    vehicle1.accelerate(30);
    vehicle2.brake(20);
    vehicle3.accelerate(40);
    System.out.println("Anzahl Fahrzeuge: " + Vehicle.getNumberOfVehicles());
  }
}
