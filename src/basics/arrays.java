package basics;

public class arrays {

	public static void main(String[] args) {
		
		String[] countries = { "New york", "Turkey", "Canada"};
		System.out.println(countries[0]);
		
		
		String[] foods = new String[3];
		foods[0] = "chicken";
		foods[1] = "meat";
		foods[2] = "carrot";
		int i = 0;
		// DO LOOP
		do {
			// System.out.println(foods[i]);
			i++; // or i = i+1
		
		}while (i < 3);
		
		String[] meals = new String[3];
		meals[0] = "chicken";
		meals[1] = "meat";
		meals[2] = "carrot";
		
		
		// WHILE LOOP
		int n = 0;
		boolean mealsfound = false;
		
		
		
		
		//while (!mealsfound) {
			//String meal = meals[n];
			//System.out.println(meal);
			//if (meal == "carrot") {
				//System.out.println("FOOD found");
				//mealsfound = true;
				
	//}n++;
			
			
			
		
	
	//FOR LOOP
		for(int x = 0; x < 3; x++ ) {
			System.out.println(meals[x]);
			
		}
			
	
		
		
		
	}
	
	
		

	}




