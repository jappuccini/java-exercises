public class Barrel {

  private int capacity;
  private int fluidLevel;

  public Barrel(int capacity) {
    this.capacity = capacity;
  }

  public void addFluidLevel(int value) throws BarrelOverflowException {
    if (fluidLevel + value > capacity) {
      fluidLevel = capacity;
      throw new BarrelOverflowException();
    }

    fluidLevel += value;
  }

  public void printFluidLevel() {
    System.out.println("Fuellstand: " + fluidLevel);
  }
}
