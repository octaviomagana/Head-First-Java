package compiler_exercise2;

class Hobbits {


	  String name;

	  public static void main(String [] args) {


	    Hobbits[] h = new Hobbits[3];
	    int z = 0;


	    while (z < 3) {
	      
	      	      
	      h[z] = new Hobbits(); //creating an instance during the While cycle
	      
	      if (z == 0){
	    	  h[z].name = "bilbo";
	      }
	      if (z == 1) {
	        h[z].name = "frodo";
	      }
	      if (z == 2) {
	        h[z].name = "sam";
	      }
	      System.out.print(h[z].name + " is a ");
	      System.out.println("good Hobbit name");
	      
	      z = z + 1; //this counter moved to the end so the correct array is pointing to the right instance
	    }
	  }
	}
