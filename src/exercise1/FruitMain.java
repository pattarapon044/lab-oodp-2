package exercise1;

public class FruitMain{
	
	public static void main(String[] args) {
		//create instance
		Fruit apple = new Fruit("red apple");
		Fruit orange = new Fruit("orange");
		//set green apple is apple
		Fruit greenApple = apple;
		
		//first output
		System.out.println("The fruit is : " + apple.getFruitName());
		System.out.println("The fruit is : " + orange.getFruitName());
		System.out.println("The fruit is : " + greenApple.getFruitName());
		
		//set new name of object
		orange.setFruitName("navel orange");
		greenApple.setFruitName("green apple");
		
		//show output
		System.out.println("The fruit is : " + apple.getFruitName());
		System.out.println("The fruit is : " + orange.getFruitName());
		System.out.println("The fruit is : " + greenApple.getFruitName());
		
		//If apple change greenApple will be change because greenApple is apple.
		//either another way greenAple be changed apple will be change too.
	}
}
