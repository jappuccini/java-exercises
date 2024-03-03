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
            int x = christmas.getDayOfYear() - inputDate.getDayOfYear();
            System.out.printf("Tage bis Weihnachte: %d%n", x);
        } else {
            christmas = LocalDate.of(year + 1, 12, 24);
            int a = LocalDate.of(year,12,31).getDayOfYear() - inputDate.getDayOfYear();
            int b = a + christmas.getDayOfYear();
            System.out.printf("Tage bis Weihnachten: %d%n",b);
        }
    }
}
