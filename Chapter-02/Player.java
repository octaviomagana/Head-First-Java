import java.util.Random;

public class Player {

	int number = 0; //variable to store where the guess goes

	public void guess () {

	Random randomGenerator = new Random(); //Creating the object RandomGenerator

	number = randomGenerator.nextInt(10); //Random Number generated between 0 - 9
	System.out.println("I'm guessing: " + number);


	} //End of Player Method which generates a random number 


} //End of Class Player
