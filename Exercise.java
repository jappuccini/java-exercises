public class Exercise {

  public static void main(String[] args) {
    Crate crate = new Crate();

    try {
      crate.insertBottle(new BeerBottle(), 1);
      crate.insertBottle(new BeerBottle(), 2);
      crate.insertBottle(new BeerBottle(), 3);
      crate.insertBottle(new WineBottle(), 4);
      crate.insertBottle(new WineBottle(), 5);
      crate.insertBottle(new WineBottle(), 6);

      if (crate.takeBottle(3) instanceof BeerBottle beerBottle) {
        beerBottle.chugALug();
      }
    } catch (CrateIndexOutOfBoundsException e) {
      System.err.println(e.getMessage());
    }
  }
}
