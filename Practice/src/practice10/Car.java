package practice10;

public class Car {

	int serialNo;
	String color;
	int gasoline;

	public int run () {

		if ( this.gasoline > 0 ) {

		this.gasoline--;

		int limitNumber = 16;
		int random = 0;

		random = new java.util.Random().nextInt(limitNumber);

		return random;

		} else {

			return -1;

		}



//		for( int gasoline = 0; gasoline < 0; gasoline--) {
//
//			int limitNumber = 14;
//			int random = 0;
//
//
//				random = new java.util.Random().nextInt(limitNumber);
//
//				random = random + 1;
//
//				random += random;
//
//
//
//		}


	}

}
