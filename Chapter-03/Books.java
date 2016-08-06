package compiler_exercise;

class Books {
	  String title;
	  String author;
	}


	class BooksTestDrive {
	  public static void main(String [] args) {

	    Books[] myBooks = new Books[3]; //this is just to create an array of "Books" type.
	    int x = 0;
	    
	    //The error is because no instance where created for each value of the array
	    myBooks[0] = new Books();
	    myBooks[1] = new Books();
	    myBooks[2] = new Books();
	    
	    //here we are just assigning a value to each variable of each instance.
	    myBooks[0].title = "The Grapes of Java";
	    myBooks[1].title = "The Java Gatsby";
	    myBooks[2].title = "The Java Cookbook";
	    myBooks[0].author = "bob";
	    myBooks[1].author = "sue";
	    myBooks[2].author = "ian";


	    while (x < 3) {
	      System.out.print(myBooks[x].title);
	      System.out.print(" by ");
	      System.out.println(myBooks[x].author);
	      x = x + 1;
	    }
	  }
	}
