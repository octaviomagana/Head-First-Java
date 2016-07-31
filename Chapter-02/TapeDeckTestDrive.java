/*Each of the Java files on this page represents a complete source file. Your job is 
to play compiler and determine whether each of these files will compile. If they won’t 
compile, how would you fix them, and if they do compile, what would be their output?*/

//Exercise A

class TapeDeck {  

boolean canRecord = false;  

	void playTape() { //playTape Method    
	
		System.out.println("tape playing");  
	}  

	void recordTape() { //recordTape Method    

		System.out.println("tape recording");  
	
	}
} //End of TapeDeck Class


	class TapeDeckTestDrive 
	{  
		public static void main(String [] args) {    
		
		TapeDeck t = new TapeDeck(); //This is the error, an instance has to be created

		t.canRecord = true;
		
		t.playTape();    

		if (t.canRecord == true) {      
			t.recordTape();    
		}  

		} //End of Main Method
	} //End of Main Class
