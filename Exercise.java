public class Exercise {

  public static void main(String[] args) {
    TravelAgency travelAgency = new TravelAgency("Reisebuero Schmidt");
    Rental rental = new Rental("Fahrzeugvermietung Mueller");
    travelAgency.addPartner(rental);

    Car car1 = new Car("Porsche", "911", Engine.ELECTRO, 2);
    Truck truck1 = new Truck("MAN", "TGX", Engine.DIESEL, 20);
    Car car2 = new Car("Opel", "Zafira Life", Engine.DIESEL, 7);

    rental.addVehicle(car1);
    rental.addVehicle(truck1);
    rental.addVehicle(car2);

    try {
      car1.accelerate(50);
      truck1.accelerate(30);
      car2.accelerate(-20);
      car1.brake(5);
    } catch (InvalidValueException e) {
      System.err.println(e.getMessage());
    }

    travelAgency.print();
  }
}
