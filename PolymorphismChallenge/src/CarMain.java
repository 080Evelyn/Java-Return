
public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car = new Car("2022 Blue Ferrari 296 GTS");
		runRace(car);
		
		Car ferrari = new GasPowerCar("2022 Blue Ferrari 296 GTS", 15.4, 6);
		runRace(ferrari);
		
		Car tesla = new ElectricCar("2022 Red Tesla Model 3", 568, 75);
		runRace(tesla);
		
		Car ferrariHybrid = new HybridCar("2022 Blue Ferrari 296 GTS", 16, 8, 6);
		runRace(ferrariHybrid);
	}
	
	public static void runRace(Car car) {
		car.startEngine();
		car.drive();
	}

}
