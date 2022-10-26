public class Exercise {

  public static void main(String[] args) {

		Vehicle vehicle = new Vehicle();

		vehicle.setMake("Porsche");
		vehicle.setModel("911");

		vehicle.accelerate(30);
		vehicle.accelerate(30);
		vehicle.brake(20);
		vehicle.accelerate(40);

  }
}
