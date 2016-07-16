public class BeerSong {

	public static void main (String[] args) {
	
	//This is the 99 bottles of beer song 

	int beerNum = 99;
	String word = "bottles";


	while (beerNum > 0) {
	
		if(beerNum == 1) {

		word = "bottle"; //singular as in One Bottle
		System.out.println(beerNum + " " + word + " of beer on the wall.");
		System.out.println(beerNum + " " + word + " of beer.");
		System.out.println("Take one down.");
		System.out.println("Pass it around.");
	
		} else {

		System.out.println(beerNum + " " + word + " of beer on the wall.");
		System.out.println(beerNum + " " + word + " of beer.");
		System.out.println("Take one down.");
		System.out.println("Pass it around.");

		}	
	
	beerNum = beerNum - 1;
		
	} //end while loop

	if(beerNum == 0) System.out.println("No more bottles of beer on the wall");

	} //end main method 
} //end class
