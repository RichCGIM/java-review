import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> myList = new ArrayList<>();
		
		myList.add(1);
		myList.add(4);
		myList.add(8);
		myList.add(3);
		myList.add(6);
		
		System.out.println(myList.size());
		
		// Write a loop to add 10000 numbers to myList
		// First loop: add 10, second loop: add 20, etc...
		
		for (int i = 1; i <= 10000; i++) {
			myList.add(i * 10);
		}
		
		System.out.println(myList.size());
	
		
	}

}