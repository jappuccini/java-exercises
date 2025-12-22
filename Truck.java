public class Truck extends Vehicle {

  private final int cargo;
  private boolean isTransformed;

  public Truck(String make, String model, Engine engine, int cargo) {
    super(make, model, engine);
    this.cargo = cargo;
  }

  public int getCargo() {
    return cargo;
  }

  public boolean isTransformed() {
    return isTransformed;
  }

  public void transform() {
    if (isTransformed) {
      System.out.println(
          getMake() + " " + getModel() + " verwandelt sich in einen Lastwagen zurueck");
    } else {
      System.out.println(getMake() + " " + getModel() + " verwandelt sich in einen Autobot");
    }
    isTransformed = !isTransformed;
  }

  public String toString() {
    return getMake() + " " + getModel() + " (" + getEngine().getDescription() + ", " + cargo + "t)";
  }
}
