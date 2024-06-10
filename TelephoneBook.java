import java.util.HashMap;
import java.util.Map;

public record TelephoneBook(HashMap<Person, TelephoneNumber> entries) {
	public void addEntry(Person person, TelephoneNumber telephoneNumber) {
		entries.put(person, telephoneNumber);
	}

	public TelephoneNumber getTelephoneNumberByName(String name) {
		for (Map.Entry<Person, TelephoneNumber> entry : entries.entrySet()) {
			if (entry.getKey().name().equals(name)) {
				return entry.getValue();
			}
		}
		return null;
	}
}
