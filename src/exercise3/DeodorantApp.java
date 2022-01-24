package exercise3;

public class DeodorantApp {

	public static void main(String args[]) {
		System.out.println("===== Deodorant =====");
		System.out.print("Enter brand:");
		String brand = Keyboard.readInput();
		System.out.print("Enter fragrance:");
		String fragrance = Keyboard.readInput();
		System.out.print("Enter price:");
		double price = Double.parseDouble(Keyboard.readInput());
		
		//TODO: create an object of deodorant
		Deodorant deo = new Deodorant(brand, fragrance, price);
		
		//TODO: print out details of deodorant from the object using acessor method
		System.out.println(deo);
		
	}
}
