import java.util.ArrayList;

public class TravelAgency {

  private String name;
  private ArrayList<Partner> partners;

  public TravelAgency(String name) {
    this.name = name;
    partners = new ArrayList<>();
  }

  public void addPartner(Partner partner) {
    partners.add(partner);
  }

  public String toString() {
    String result = name + "\n";
    for (Partner p : partners) {
      result += p.toString() + '\n';
    }
    return result;
  }
}
