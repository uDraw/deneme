package oop;

class Person {
	
	String name;
	String email;
	String phone;
	
	void walking() {
		System.out.println(name +" is walking");
		
	}
	
	void eating() {
		
		System.out.println(name +" is eating");
		
	}
	void sleeping() {
		System.out.println(name +" is sleeping");
		
	}
}

public class demo {

	public static void main(String[] args) {
		
		Person person1 = new Person();
		person1.name = "Joe";
		person1.email = "ashdhasdha@gmail.com";
		person1.phone = "1283123713";
		
		person1.eating();
		person1.sleeping();
		person1.walking();
		
		Person person2 = new Person();
		person2.name = "James";
		person2.email = "ahasdha@gmail.com";
		person2.phone = "123713";
		
		person2.eating();
		person2.sleeping();
		person2.walking();
		

	}

}
