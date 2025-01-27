package masterclass;

import java.util.ArrayList;

public class Part1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> objectList = new ArrayList<>();
		objectList.add("Yoghurt");
		objectList.add("Milk");
		System.out.println(objectList);
		objectList.add("Chocolate");
		objectList.add("Doughnut");
		objectList.add("Cheese");
		System.out.println(objectList);
		objectList.remove(2);
		System.out.println(objectList);
		objectList.removeAll(objectList);
		System.out.println(objectList);
		objectList.add("Chocolate");
		objectList.add("Doughnut");
		objectList.add("Cheese");
		System.out.println(objectList);
	}

}
