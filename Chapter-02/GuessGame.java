import java.util.Random;

public class GuessGame {


Player p1; //GuessGame class has three instance variables for three Player objects
Player p2;
Player p3;

	public void startGame () {

	p1 = new Player(); //Create three Player objects and assign them to the three player instance variables
	p2 = new Player(); //Create three Player objects and assign them to the three player instance variables
	p3 = new Player(); //Create three Player objects and assign them to the three player instance variables


	int guessp1 = 0; //Create three variables to hold the three guesses the players make
	int guessp2 = 0;
	int guessp3 = 0;

	boolean p1isRight = false; //declare three variables to hold a true or false based on the player's answer 
	boolean p2isRight = false;
	boolean p3isRight = false;

	Random randomGenerator2 = new Random(); //Creating the object RandomGenerator2
	

	int targetnumber = randomGenerator2.nextInt(10); //Make a target number that the players have to guess 
	System.out.println("I'm thinking of a number between 0 and 9...");

	while (true) {

	System.out.println("Number to guess is: " + targetnumber);

	p1.guess(); //each player's instance invokes the guess method
	p2.guess();		
	p3.guess();	

	guessp1 = p1.number;
	System.out.println("Player 1 guessed: " + guessp1);
	guessp2 = p2.number;
	System.out.println("Player 2 guessed: " + guessp2);
	guessp3 = p3.number;
	System.out.println("Player 3 guessed: " + guessp3);

	if(guessp1 == targetnumber) {
	
	p1isRight = true;	
	
	}
	if(guessp2 == targetnumber) {
	
	p2isRight = true;	
	
	}
	if(guessp3 == targetnumber) {
	
	p3isRight = true;	
	
	}

	if(p1isRight || p2isRight || p3isRight) {

	if (p1isRight) System.out.println("Player 1 is a winner");
	System.out.println("Player one got it right? " + p1isRight);

	if (p2isRight) System.out.println("Player 2 is a winner");
	System.out.println("Player two got it right? " + p2isRight);


	if (p3isRight) System.out.println("Player 3 is a winner");
	System.out.println("Player three got it right? " + p3isRight);

	System.out.println("Game is over.");

	break;

	} else {

	System.out.println("Sorry, no winners: Players will have to try again");

	}




	} //End of while
		



	} //Method that plays the game when a GuessGame instance is invoked


} //End of GuessGame class which has the method to play the game 
