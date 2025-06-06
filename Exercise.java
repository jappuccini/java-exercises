public class Exercise {

  public static void main(String[] args) {
    Crate<Bottle> crate = new Crate<Bottle>();

    try {
      crate.insertBottle(new BeerBottle(), 1);
      crate.insertBottle(new BeerBottle(), 2);
      crate.insertBottle(new BeerBottle(), 3);
      crate.insertBottle(new WineBottle(), 4);
      crate.insertBottle(new WineBottle(), 5);
      crate.insertBottle(new WineBottle(), 6);

      crate
          .takeBottle(3)
          .ifPresentOrElse(
              bottle -> {
                if (bottle instanceof BeerBottle beerBottle) {
                  beerBottle.chugALug();
                }
              },
              () -> System.out.println("Gesuchte Flasche ist nicht vorhanden."));
    } catch (CrateIndexOutOfBoundsException e) {
      System.err.println(e.getMessage());
    }
  }
}
