package week6ptactice;

 class Pets{
	private String name;
	private int age;
	private String location;
	private String type;

	//empty constructor
	public Pets() {
	}
	
	//all attributes constructor 
	public Pets(String name, int age, String location, String type) {
		this.name = name;
		this.age = age;
		this.location = location;
		this.type = type;
	}
	
	//get methods name, age, type
	public void accessInstances() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(type);
	}
	
	public void sayHello() {
		System.out.println("Hello, I am " + name + ". " + "I am " + age + "years old" + ". " + "I am " + location +"." + "I am a " + type +".");
	}
	//set methods name, age, location
	public void setName(String newName) {
		this.name = newName;
	}
	public void setAge(int newAge) {
		this.age = newAge;
	}
	public void setLocation(String newLocation) {
	this.location = newLocation;
}
}
public class week7_day1_hw {

	public static void main(String[] args) {
		Pets firstPet= new Pets("Fido", 3, "home", "dog");
		firstPet.accessInstances();
		firstPet.setName("Rocky");
		firstPet.setAge(5);
		firstPet.setLocation("Park");

	}
}
