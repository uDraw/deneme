package oop;

public class studentdatabase {

	public static void main(String[] args) {
		
		Students stu1 = new Students("123456", "bartu");
		Students stu2 = new Students("123456", "emre");
		
		
		

	}

}

class Students {
	
	 private static String ID = "1000" ;
	String SSN;
	String name;
	String emailID; //name@gmail.com
	String userID;
	
	
	
	public Students(String SSN, String name) {
	
		System.out.println("New Student Detected");
		this.name = name;
		this.SSN = SSN;
		setEmail();
		setUserID();
	
	}
	
	public void setEmail() {
		
		emailID = name + "@gmail.com";
		System.out.println(emailID);
	}
	public void setUserID() {
		int random = (int) (Math.random() * 10000);
		userID = ID + random + SSN.substring(0,4);
		System.out.println(userID);
	}
	public void enroll() {
		
	}
	public void pay() {
		
	}
	public void checkBalance() {
		
	}
	
	public void showCourses() {
		
	}
	//public String toString() {
		
		
	//}
}
