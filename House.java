import java.util.ArrayList;

public class House {

  private ArrayList<Room> rooms;

  public House() {
    rooms = new ArrayList<>();
  }

  public void addRoom(Room room) {
    rooms.add(room);
  }

  public void displayRooms() {
    for (Room r : rooms) {
      r.displayRoom();
    }
  }

  public class Room {

    private String name;

    public Room(String name) {
      this.name = name;
    }

    public void displayRoom() {
      System.out.println(name);
    }
  }
}
