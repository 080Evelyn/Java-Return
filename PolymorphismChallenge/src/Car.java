
public class Car {

	private String description;

	public Car(String description) {
		this.description = description;
	}
	
	
	
	public void startEngine() {
		System.out.println("Car -> startEngine");
	}
	
	protected void runEngine() {
		System.out.println("Car -> runEngine");
	}
	
	public void drive() {
		System.out.println("Car -> driving, type is " + getClass().getSimpleName());
		runEngine();
	}
}

class GasPowerCar extends Car {
	private double avgKmPerLiter;
	private int cylinders = 6;
	
	
	public GasPowerCar(String description) {
		super(description);
	}


	
	@Override
	public void startEngine() {
		// TODO Auto-generated method stub
		System.out.printf("Gas -> All  %d cylinders are fired up, Ready!%n", cylinders);
	}


	@Override
	protected void runEngine() {
		// TODO Auto-generated method stub
		System.out.printf("Gas -> usage exceeds the average: %.2f %n", avgKmPerLiter);
	}



	public GasPowerCar(String description, double avgKmPerLiter, int cylinders) {
		super(description);
		this.avgKmPerLiter = avgKmPerLiter;
		this.cylinders = cylinders;
	}
	
}

class ElectricCar extends Car{
	private double avgKmPerCharge;
	private int batterySize = 6;
	
	public ElectricCar(String description) {
		super(description);
	}
	
	public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
		super(description);
		this.avgKmPerCharge = avgKmPerCharge;
		this.batterySize = batterySize;
	}

	@Override
	public void startEngine() {
		// TODO Auto-generated method stub
		System.out.printf("BEV -> switch %d kWh battery on, Ready!%n", batterySize);
	}

	@Override
	protected void runEngine() {
		// TODO Auto-generated method stub
		System.out.printf("BEV -> usage under the average: %.2f %n", avgKmPerCharge);
	}
	
	
	
	
}

class HybridCar extends Car{
	private double avgKmPerLiter;
	private int batterySize;
	private int cylinders = 6;
	
	public HybridCar(String description) {
		super(description);
		// TODO Auto-generated constructor stub
	}
	
	public HybridCar(String description, double avgKmPerLiter, int batterySize, int cylinders) {
		super(description);
		this.avgKmPerLiter = avgKmPerLiter;
		this.batterySize = batterySize;
		this.cylinders = cylinders;
	}

	@Override
	public void startEngine() {
		// TODO Auto-generated method stub
		System.out.printf("Hybrid -> %d cylinders are fired up.%n", cylinders);
		System.out.printf("Hybrid -> switch %d kWh battery on, Ready!%n", batterySize);
	}

	@Override
	protected void runEngine() {
		// TODO Auto-generated method stub
		System.out.printf("Hybrid -> usage below average: %.2f %n", avgKmPerLiter);
	}
	
	
}




