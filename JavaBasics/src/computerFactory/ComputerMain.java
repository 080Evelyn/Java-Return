package computerFactory;

public class ComputerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ComputerCase theCase = new ComputerCase("2208", "Dell", "240");
		
		Monitor theMonitor = new Monitor("27inch Beast","Acer", 27, "2540 * 1440");
		
		Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

		PersonalComputer thePC = new PersonalComputer("2208", "Dell", theCase, theMonitor, theMotherboard);
		
//		thePC.getMonitor().drawPixelAt(10, 10, "red");
//		
//		thePC.getMotherboard().loadProgram("Window OS");
//		thePC.getComputerCase().pressPowerButton();
		
		thePC.powerUp();
	}

}
