import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.OptionalDouble;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Queries {
  private ArrayList<Console> consoles;

  public Queries(ArrayList<Console> consoles) {
    this.consoles = consoles;
  }

  public List<String> getAllCurrentConsoleNames() {
    return consoles.stream()
        .filter(console -> console.lifespan() == -1)
        .map(console -> console.title())
        .toList();
  }

  public Map<Maker, List<Console>> getAllConsolesByMaker() {
    return consoles.stream()
        .collect(Collectors.groupingBy(console -> console.maker()));
  }

  public List<Console> getAllConsolesSortedByLifespan() {
    Comparator<Console> lifeSpanAscending = (console1, console2) -> Integer.compare(console1.lifespan(), console2.lifespan());
    return consoles.stream()
        .sorted(lifeSpanAscending)
        .collect(Collectors.toList());
  }

  public OptionalDouble getAverageSoldUnitsInMillionsPerYearFromAllOutdatedConsoles() {
    return consoles.stream()
        .filter(console -> console.lifespan() != -1)
        .mapToDouble(console -> console.soldUnitsInMillions() / console.lifespan())
        .average();
  }

  public long getNumberOfConsolesFromNintendo() {
    return consoles.stream()
        .filter(console -> console.maker().equals(Maker.NINTENDO))
        .count();
  }

  public List<String> getSoldUnitsInMillionsPerYearFromAllOutdatedConsoles() {
    return consoles.stream()
        .filter(console -> console.lifespan() != -1)
        .map(console -> console.title() + " (" + console.soldUnitsInMillions() / console.lifespan() + ")")
        .toList();
  }

  public Map<Maker, Double> getTotalSoldUnitsInMillionsPerMaker() {
    Function<Entry<Maker, List<Console>>, Maker> entrySetToMaker = entrySet -> entrySet.getKey();
    Function<Entry<Maker, List<Console>>, Double> entrySetToSoldUnits = entrySet -> entrySet.getValue().stream()
        .mapToDouble(console -> console.soldUnitsInMillions())
        .sum();

    return getAllConsolesByMaker().entrySet().stream()
        .collect(Collectors.toMap(entrySetToMaker, entrySetToSoldUnits));
  }

  public boolean isAllConsolesWithMoreThan50MillionSoldUnits() {
    return consoles.stream()
        .allMatch(console -> console.soldUnitsInMillions() > 50);
  }

  public boolean isAnyConsoleWithMoreThan150MillionSoldUnits() {
    return consoles.stream()
        .anyMatch(console -> console.soldUnitsInMillions() > 150);
  }
}
