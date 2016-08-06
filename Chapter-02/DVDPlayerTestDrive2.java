class DVDPlayerTestDrive2 {  

	public static void main(String [] args) {

	    DVDPlayer d = new DVDPlayer();    

		d.canRecord = true;    
		// d.playDVD();   This line is the error. the playDVD method does not exist. 

		if (d.canRecord == true) {      

			d.recordDVD();    

		}  

	}


}
