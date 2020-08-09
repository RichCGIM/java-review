
public class FizzBuzz {
	
	// Print on a new line the numbers from 1 to 100
	// If the number is divisible by 3, print Fizz instead
	// If the number is divisible by 5, print Buzz instead
	// If the number is divisible by 3 and 5, print FizzBuzz
	
	public static void main(String[] args) {
		int max = 100;
		
		for (int i = 1; i <= max; i++) {
			if (i % 3 == 0) {
				System.out.print("Fizz");
			}
			if (i % 5 == 0) {
				System.out.print("Buzz");
			}
			if (i % 3 == 0 || i % 5 == 0) {
				System.out.println();
			} else {
				System.out.print(i);
				System.out.println();
			}
		}
	}
}
