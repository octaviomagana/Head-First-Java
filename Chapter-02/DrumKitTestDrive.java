/*
Exercise: A Java program is all scrambled up on the fridge. 
Can you reconstruct the code snippets to make a working Java program 
that produces the output listed below? Some of the curly braces fell 
on the floor and they were too small to pick up, so feel free to add 
as many of those as you need.

Output:

bang bang ba-bang
ding ding da-ding

*/


class DrumKitTestDrive {


	public static void main(String [] args) {

	

	DrumKit d = new DrumKit();

	if (d.snare == true ) {

		d.playSnare();

	}
	d.snare = false;
	
	d.playTopHat();

	
	}




}
