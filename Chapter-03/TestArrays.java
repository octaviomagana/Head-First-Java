package code_magnets;

public class TestArrays {

	
	
	public static void main(String[] args) {
		
	int y = 0;
	int ref;
	int[] index = new int[4];
	String[] islands = new String[4];
	
	
	//Final Output will be: 
	index[0] = 1; //Prints Fiji
	index[1] = 3; //Prints Cozumel
	index[2] = 0; //Prints Bermuda
	index[3] = 2; //Prints Azores
	
	islands[0] = "Bermuda";
	islands[1] = "Fiji";
	islands[2] = "Azores";
	islands[3] = "Cozumel";
	
	while (y < 4){
		
		ref = index[y];
		System.out.println(islands[ref]);
		y = y + 1;
		
	}
		
		
	}

}
