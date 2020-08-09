
// A class is a type
// A class is an Object factory
public class Person {
	
	// Attributes
	int age;
	private String name;
	char sex;
	Person father;
	
	// Constructors
	public Person() {
	}
	
	public Person(int age, String name, char sex) {
		this.age = age;
		this.name = name;
		this.sex = sex;
	}
	
	// Methods
	public void speak(String whatToSay) {
		System.out.println(whatToSay);
	}
	
	public void fallInLove(Person lover) {
		System.out.println("I am " + this.name + "!");
		System.out.println("I fell in love with " + lover.name);
	}

}
