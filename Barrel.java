public class Barrel {

  private int capacity;
  private int fluidLevel;

  public Barrel(int capacity) {
    this.capacity = capacity;
    fluidLevel = 0;
  }

  public int getCapacity() {
    return capacity;
  }

  public int getFluidLevel() {
    return fluidLevel;
  }

  public void addFluid(int value) throws BarrelOverflowException {
    if (fluidLevel + value > capacity) {
      fluidLevel = capacity;
      throw new BarrelOverflowException();
    }
    fluidLevel += value;
  }

  public String toString() {
    return "Barrel [capacity=" + capacity + "] [fluidlevel=" + fluidLevel + "]";
  }
}
