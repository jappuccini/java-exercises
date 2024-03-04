public class Exercise {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Gib bitte ein Datum ein (dd.mm.yyyy): ");
        String input = sc.next();

        int day = Integer.valueOf(input.substring(0, 2));
        int month = Integer.valueOf(input.substring(3, 5));
        int year = Integer.valueOf(input.substring(6, 10));

        LocalDate inputDate = LocalDate.of(year, month, day);
        LocalDate christmas;

        System.out.println("Wochentag: " + inputDate.getDayOfWeek());

        if (day <= 24 || month < 12) {
            christmas = LocalDate.of(year, 12, 24);
            int daysUntilChristmas = christmas.getDayOfYear() - inputDate.getDayOfYear();
            System.out.printf("Tage bis Weihnachte: %d%n", daysUntilChristmas);
        } else {
            christmas = LocalDate.of(year + 1, 12, 24);
            int daysUntilNewYear = LocalDate.of(year,12,31).getDayOfYear() - inputDate.getDayOfYear();
            int daysUntilNextYearsChristmas = daysUntilNewYear + christmas.getDayOfYear();
            System.out.printf("Tage bis Weihnachten: %d%n",daysUntilNextYearsChristmas);
        }
    }
}
