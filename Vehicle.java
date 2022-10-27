public abstract class Vehicle {

  private String make;
  private String model;
  private Engine engine;
  protected double speed;
  private static int numberOfVehicles;

  public Vehicle(String make, String model, Engine engine) {
    this.make = make;
    this.model = model;
    this.engine = engine;
    numberOfVehicles++;
  }

  public String getMake() {
    return make;
  }

  public String getModel() {
    return model;
  }

  public Engine getEngine() {
    return engine;
  }

  public static int getNumberOfVehicles() {
    return numberOfVehicles;
  }

  public final void accelerate(int value) throws InvalidValueException {
    if (value <= 0) {
      throw new InvalidValueException();
    }

    speed += value;
    System.out.println(make + " " + model + " beschleunigt auf " + speed + "km/h");
  }

  public final void brake(int value) throws InvalidValueException {
    if (value <= 0) {
      throw new InvalidValueException();
    }

    speed -= value;
    System.out.println(make + " " + model + " bremst auf " + speed + "km/h ab");
  }

  public abstract void print();
}
