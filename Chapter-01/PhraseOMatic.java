import java.util.Random;

public class PhraseOMatic {



	public static void main (String[] args) {
	
	

 	String[] wordListOne = {"Fafnir","Syrrith","Brockvin","Casroch","Apalala","Abraxas","Brinsoph","Eingana", "Dragthoth", "Gracksath","Hothsine", "Galeru"};   

	String[] wordListTwo = {"IceHeart", "Flametongue","SoarHeart", "StrongFin", "LightWin", "MidnightSoar","RavenSong", "QuickFoot","LightHeart", "SoftSong","FeatherSoar", "SecretKeeper", "NightWing", "DarFlight","IceWing", "FireBreath", "Youngling", "IceBringer"};    

	String[] wordListThree = {"Regal", "Viscious","Savage", "Dark", "Merciless","Legendary", "Ancient", "Fearsome", "Cruel", "Magnificient","Graceful", "Scaled"};
	

	//Find out how many words are in each list
	int oneLength = wordListOne.length;
	int twoLength = wordListTwo.length;
	int threeLength = wordListThree.length;


	//generate the random numbers

//Commenting this from the book, I did not like how it generated the  random numbers so I used nextInt method from Random class.
	//int rand1 = (int) (Math.random() * oneLength);
	//int rand2 = (int) (Math.random() * twoLength);
	//int rand3 = (int) (Math.random() * threeLength);
 
	Random randomGenerator = new Random();
	
	int rand1 = randomGenerator.nextInt(oneLength);
	int rand2 = randomGenerator.nextInt(twoLength);
	int rand3 = randomGenerator.nextInt(threeLength);

	// now build a phrase   

	String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

	 // print out the phrase Name of your Dragon  

	System.out.println("Your Dragon name is: " + phrase);


	} // Main Method end




 
} // Class end
