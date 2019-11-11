package basics;

public class weather {
	
	public static void main(String[] args) {
		
		int temperature = 61;
		String hava;
		hava = "Sunny";
	
		if ((temperature > 80) && (hava == "Sunny")) {
			
			System.out.println("wear tshirt");
			
		}
		
		else if (temperature == 61) {
			System.out.println("61");
		
		}
		
		else if ((temperature > 60) && (hava == "Sunny")) {
			
			System.out.println("wear jacket");
		
		}
		
		else {
			
			System.out.println("cold");
		}
			
			
		
		
	}

}
