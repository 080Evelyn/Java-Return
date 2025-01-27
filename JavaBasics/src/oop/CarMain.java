package oop;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car  = new Car();
		car.setMake("Porsche");
		car.setColour("black");
		car.setConvertible(true);
		car.setDoors(4);
		
		car.describeCar();
		System.out.println("Make " + car.getMake());
		System.out.println("Model " + car.getModel());
		System.out.println("Colour " + car.getColour());
		
		Car targa = new Car();
		targa.setMake("Porsche");
		targa.setModel("Targa");
		targa.setDoors(2);
		targa.setConvertible(false);
		targa.setColour("red");
		car.describeCar();

	}

}
