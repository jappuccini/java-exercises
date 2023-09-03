import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public record SchoolClass(String name, List<Pupil> pupils) {

  public void addPupil(Pupil pupil) {
    pupils.add(pupil);
  }

  public List<Pair<Pupil>> getPairs() {
    List<Pair<Pupil>> pairs = new ArrayList<>();

    int arrSize = pupils.size();

    for (int i = 0; i < arrSize && (pupils.size() != 0); i++) {
      if (pupils.size() == 1) {
        pairs.add(new Pair<Pupil>(pupils.get(0), null));
        break;
      }
      Pupil single1 = pupils.get((new Random().nextInt(pupils.size())));
      pupils.remove(single1);
      Pupil single2 = pupils.get((new Random().nextInt(pupils.size())));
      pupils.remove(single2);
      pairs.add(new Pair<Pupil>(single1, single2));
    }
    return pairs;
  }
}
