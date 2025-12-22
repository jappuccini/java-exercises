public class Exercise {

  public static void main(String[] args) {
    System.out.println("Anzahl Fahrzeuge: " + Vehicle.getNumberOfVehicles());

    Vehicle vehicle1 = new Vehicle("Porsche", "911", Engine.ELECTRO);
    Vehicle vehicle2 = new Vehicle("MAN", "TGX", Engine.DIESEL);
    Vehicle vehicle3 = new Vehicle("Opel", "Zafira Life", Engine.DIESEL);

    System.out.println(vehicle1.toString());
    System.out.println(vehicle2.toString());
    System.out.println(vehicle3.toString());

    System.out.println("Anzahl Fahrzeuge: " + Vehicle.getNumberOfVehicles());
  }
}
