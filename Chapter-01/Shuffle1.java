public class Shuffle1 {

	public static void main (String[] args) {
	
	/*A working Java program is all scrambled up on the fridge. 
	Can you rearrange the code snippets to make a working Java 
	program that produces the output listed below? ( a-b c-d ) Some of the 
	curly braces fell on the floor and they were too small to pick up, 
	so feel free to add as many of those as you need!*/

	int x=3;

	while (x > 0) {


		if( x > 2 ) {
		
		System.out.print("a");		
		System.out.print("-");	
		}
		
		if( x == 2){

		System.out.print("b c");
		}


		if( x == 1){

		System.out.print("-");
		System.out.println("d");			
		}
	
	x = x - 1;
			

	} //End of While
	
	
	} //End of Main Method
} //End of Shuffle1 Class
