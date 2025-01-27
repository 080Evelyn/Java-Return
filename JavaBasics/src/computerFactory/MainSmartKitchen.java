package computerFactory;

public class MainSmartKitchen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SmartKitchen kitchen = new SmartKitchen();
		
//		kitchen.getDishWasher().setHasWorkToDo(true);
//		kitchen.getIceBox().setHasWorkToDo(false);
//		kitchen.getBrewMaster().setHasWorkToDo(true);
//		
//		kitchen.getIceBox().orderFood();
//		kitchen.getDishWasher().doDishes();
//		kitchen.getBrewMaster().brewCoffee();
		
		kitchen.setKithcenState(true, true, false);
		kitchen.doKitchenWork();
	}

}
