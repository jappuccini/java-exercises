public class Crate<T> {

  private T box1;
  private T box2;
  private T box3;
  private T box4;
  private T box5;
  private T box6;

  public void insertBottle(T bottle, int box) throws CrateIndexOutOfBoundsException {
    if (box < 1 || box > 6) {
      throw new CrateIndexOutOfBoundsException();
    }

    switch (box) {
      case 1 -> box1 = bottle;
      case 2 -> box2 = bottle;
      case 3 -> box3 = bottle;
      case 4 -> box4 = bottle;
      case 5 -> box5 = bottle;
      case 6 -> box6 = bottle;
    }
  }

  public T takeBottle(int box) throws CrateIndexOutOfBoundsException {
    if (box < 1 || box > 6) {
      throw new CrateIndexOutOfBoundsException();
    }

    return switch (box) {
      case 1 -> box1;
      case 2 -> box2;
      case 3 -> box3;
      case 4 -> box4;
      case 5 -> box5;
      default -> box6;
    };
  }
}
