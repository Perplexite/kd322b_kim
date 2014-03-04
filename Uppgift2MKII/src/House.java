
public class House {

	private int year;
	private int size;
	private static int nbrOfHouses;
	public static final int MIN_SIZE = 10;



	public House(int calYear,int calSize){
		
		
		year = calYear;
		if(size < MIN_SIZE){
		size = calSize;
		} else {
			size = MIN_SIZE;
		
		} nbrOfHouses = nbrOfHouses +1;
	}



	public static int getNbrHouses(){
		return nbrOfHouses;
	}


	public int getYear(){
		return year;
	}


	public int getSize(){
		return size;
	}


}
