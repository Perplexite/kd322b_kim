
/**class containing all constants for the bike store*/
public class Constants {


	/**States the minimum bike-size*/
	public static final int MIN_SIZE=8;
	/**States the maximum bike-size*/
	public static final int MAX_SIZE=28;
	/**States minmum bike price*/
	public static final int MIN_PRICE=0;
	/**States max bike price*/
	public static final int MAX_PRICE=30000;

	/**Array that states specific bike colours*/
	public static String [] colorArray={"red", "blue", "invisible", "black"};

	/**Method that checks bike colours against the colorArray array*/
	public static String colorCheck(String col){
		boolean check = false;
		for(int i = 0; i<colorArray.length; i++) {

			if(col.equals(colorArray[i])) {
				check = true;
			}
		}
		if(check == true){
			return col;
		} else {
			return "NO EFFIN' COLOR!";
		}


	}

}

