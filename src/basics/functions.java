package basics;

public class functions {
	
	public static void main(String[] args) {
		System.out.println("Program is starting");
		printName();
		int numA = 10;
		int numB = 20;
		addNumbers(numA, numB);
		int product = multiplyNumbers(numA, numB);
		System.out.println(product);
		
	
		

		
	}
	
	static void printName() {

		
		System.out.println("Hello");
		}
	
	static void addNumbers(int numberA, int numberB) {
		
		int sum = numberA +numberB;
		System.out.println(numberA + "+" + numberB + " is equal to" + sum);
		
		
		
	}
	
	
	static int multiplyNumbers(int valueA, int valueB) {
		
		int product = valueA * valueB;
		return product;
		
		
		
	}

}
