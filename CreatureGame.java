public class CreatureGame {

  private Creature creature1;
  private Creature creature2;
  private int numberOfRounds;

  public CreatureGame(Creature creature1, Creature creature2) {
    this.creature1 = creature1;
    this.creature2 = creature2;
  }

  private void print() {
    System.out.print("Runde " + numberOfRounds + ": ");
    System.out.print(creature1.toString());
    System.out.print(", ");
    System.out.print(creature2.toString());
    System.out.println();
  }

  private boolean move(Creature creature1, Creature creature2) {
    return creature1.attackCreature(creature2);
  }

  public void simulateFight() {
    numberOfRounds = 1;
    while (true) {
      print();
      if (move(creature1, creature2)) {
        break;
      }
      if (move(creature2, creature1)) {
        break;
      }
      System.out.println();
      numberOfRounds++;
    }
  }
}
