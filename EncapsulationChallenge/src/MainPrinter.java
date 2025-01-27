
public class MainPrinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Printer printer = new Printer(50, true);
		
		System.out.println("Initial page count = " + printer.getPagesPrinted());
		
		int pagesPrinted = printer.printPages(5);
		System.out.printf("Current Job Pages: %d, Printer Total: %d %n ", pagesPrinted, printer.getPagesPrinted());
	
		pagesPrinted = printer.printPages(10);
		System.out.printf("Current Job Pages: %d, Printer Total: %d %n ", pagesPrinted, printer.getPagesPrinted());
	
		pagesPrinted = printer.printPages(13);
		System.out.printf("Current Job Pages: %d, Printer Total: %d %n ", pagesPrinted, printer.getPagesPrinted());
	}

}
