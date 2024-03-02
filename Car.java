public final class Car extends Vehicle {

  private final int seats;

  public Car(String make, String model, Engine engine, int seats) {
    super(make, model, engine);
    this.seats = seats;
  }

  public int getSeats() {
    return seats;
  }

  public void doATurboBoost() {
    speedInKmh *= 2;
    System.out.println(
        getMake()
            + " "
            + getModel()
            + " macht einen Turboboost und beschleunigt auf "
            + speedInKmh
            + " km/h");
  }

  public String toString() {
    return getMake()
        + " "
        + getModel()
        + " ("
        + getEngine().getDescription()
        + ", "
        + seats
        + " Sitzplaetze)";
  }
}
