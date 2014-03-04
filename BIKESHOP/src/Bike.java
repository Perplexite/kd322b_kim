
/**the Bike-class*/

public class Bike{

	private String color;
	private int price;
	private int size;
	private int nbrOfBikes;

	/**Creates a Bike with instance-variables limited by values in Constants.java */ 
	public Bike(String _color, int _size){
		color = Constants.colorCheck(_color);
		if (_size < Constants.MIN_SIZE ){
			size =_size;
		}  else {
			_size = Constants.MIN_SIZE; 
		}
		if (size < Constants.MAX_SIZE ){
			size =_size;
		}
		else {
			_size = Constants.MAX_SIZE; 
		}
	}

	/**Creates a Bike with instance-variables limited by values in Constants.java */
	public Bike(String _color, int _size, int _price){
		color = Constants.colorCheck(_color);
		if ( _size > Constants.MIN_SIZE ){		//if size is larger than smallest size
			size =_size;
		}else {
			_size = Constants.MIN_SIZE; 		//if size is smaller than smallest size it prints smallest size
		}
		if (_size < Constants.MAX_SIZE ){	
			size =_size;						//if size is smaller than maximum size it prints specified size
		} else {
			_size = Constants.MAX_SIZE; 		//if size is larger than maximum size it prints maximal size
		}
		if (_price > Constants.MIN_PRICE){ 		//if price is larger than minimum price it prints specified price
			price = _price;
		} else {
			_price = Constants.MIN_PRICE; 		//if price is less than minimum price it prints minimal price
		}
		if (_price < Constants.MAX_PRICE){ 		//if the price is less than maximum price it prints price
			price = _price;
		} else {
			_price = Constants.MAX_PRICE; 		//if price is larger than Maximal price it prints maximum price
		}
	}

	/** Method that calls and returns colour of bike*/
	public String getColor() {
		return color;
	}

	/**Method that calls and returns price of bike*/
	public int getSize() {
		return size;
	}

	
	/**Method that calls and returns price of bike*/
	public int getPrice() {
		return price;
	}

	/**Method that sets and returns price of bike*/
	public void setPrice(int price) {
		this.price = price;
	}

	/**Method that calls and returns number of bikes*/
	public int getNbrOfBikes() {
		return nbrOfBikes;
	}



}
