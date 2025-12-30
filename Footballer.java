import java.time.LocalDate;

public record Footballer(
    String name,
    Position position,
    LocalDate birthDate,
    int sizeInCm,
    FootballClub footballClub,
    int numberOfGames,
    int numberOfGoals) {}
