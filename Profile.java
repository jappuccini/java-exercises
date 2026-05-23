
import java.util.Optional;

// 7.5
public class Profile { // 0.5
  public Optional<String> phoneNumber; // 0.25
  public Optional<String> email; // 0.25

  public Profile(String phoneNumber) { // 0.5
    this(phoneNumber, null); // 0.5
  }

  public Profile(String phoneNumber, String email) { // 0.5
    this.phoneNumber = Optional.ofNullable(phoneNumber); // 0.25
    this.email = Optional.ofNullable(email); // 0.25
  }

  public String toString() { // 0.25
    String result = ""; // 0.5
    if (phoneNumber.isPresent()) { // 0.5
      result += phoneNumber.get(); // 0.25
    }
    if (email.isPresent()) { // 0.5
      if (result.length() != 0) { // 0.5
        result += " "; // 0.25
      }
      result += email.get(); // 0.25
    }
    return result; // 0.5
  }

  public boolean isValidated() { // 0.5
    return phoneNumber.isPresent() || email.isPresent(); // 0.5
  }
}