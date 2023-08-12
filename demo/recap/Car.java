package demo.recap;

public class Car  implements Item{
    public final String brand;
    public final String model;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getDescription() {
        return brand + " " + model + " <3";
    }
    
}
