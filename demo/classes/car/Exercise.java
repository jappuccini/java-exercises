package demo.classes.car;

public class Exercise {

    public static void main(String[] args) {
        // Neues Objekt erzeugen
        Car audi = new Car();

        // Attribute eines Objekts schreiben
        audi.make = "Audi";
        audi.model = "S5";

        // Attribute eines Objekts lesen
        System.out.println(audi.isFast);

        // Nicht gesetzte Attribute haben Standardwerte
        System.out.println(audi.isFast);
        System.out.println(audi.ps);
        System.out.println(audi.km);

        Car bmw = new Car();
        bmw.make = "BEEMMEVU";
        bmw.model = "M5";

        // Methode eines Objekts ausführen
        bmw.printCar();
    }
}
