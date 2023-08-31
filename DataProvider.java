import java.util.ArrayList;
import java.util.List;

public class DataProvider {
  public static ArrayList<Console> getConsoles() {
    return new ArrayList<Console>(
        List.of(
            new Console("PlayStation 2", Maker.SONY, 12, 158.70),
            new Console("Nintendo DS", Maker.NINTENDO, 10, 154.02),
            new Console("Nintendo Switch", Maker.NINTENDO, -1, 125.79),
            new Console("GameBoy", Maker.NINTENDO, 10, 118.69),
            new Console("PlayStation 4", Maker.SONY, -1, 117.04),
            new Console("PlayStation", Maker.SONY, 9, 102.49),
            new Console("Nintendo Wii", Maker.NINTENDO, 13, 101.63),
            new Console("PlayStation 3", Maker.SONY, 11, 87.40),
            new Console("XBox 360", Maker.MICROSOFT, 12, 85.81),
            new Console("GameBoy Advance", Maker.NINTENDO, 7, 81.51),
            new Console("PlayStation Portable", Maker.SONY, 9, 80.79),
            new Console("Nintendo 3DS", Maker.NINTENDO, 8, 75.94),
            new Console("Nintendo Entertainment System", Maker.NINTENDO, 9, 61.91),
            new Console("XBox One", Maker.MICROSOFT, -1, 51.26),
            new Console("Super Nintendo Entertainment System", Maker.NINTENDO, 7, 49.10)));
  }
}
