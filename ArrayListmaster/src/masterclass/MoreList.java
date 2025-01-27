package masterclass;

import java.util.ArrayList;
import java.util.List;

public class MoreList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] items = {"apples", "bananas", "milk", "eggs"};
		
		List<String> list = List.of(items);
		System.out.println(list);
		
		ArrayList<String> groceries = new ArrayList<>(list);
		groceries.add("Yoghurt");
		System.out.println(groceries);
		
		ArrayList<String> nextList = new ArrayList<>(
				List.of("pickles", "mustard", "cheese"));
		System.out.println(nextList);
		
		groceries.addAll(nextList);
		System.out.println(groceries);
		
		System.out.println("Thied item = " + groceries.get(2));
		
		if(groceries.contains("mustard")) {
			System.out.println("List contains mustard");
		}
		
		groceries.add("Yoghurt");
		System.out.println(groceries);
		System.out.println("first = " + groceries.indexOf("Yoghurt"));
		System.out.println("last = " + groceries.lastIndexOf("Yoghurt"));
		
	}

}
