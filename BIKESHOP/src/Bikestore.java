import java.util.ArrayList;

public class Bikestore {
	
	private ArrayList<Bike> bikelist = new ArrayList<Bike>();
	
	/**Method loops through the Array-List*/
	public String getAllBikes(){
		String bikeShop = "";
		for(int i = 0; i<bikelist.size(); i++) {
			Bike s = bikelist.get(i);
			
			bikeShop = bikeShop + ("The color is " + s.getColor() + ". \n the size is  " + s.getSize() +  ". \n Price is " + s.getPrice() + ". \n");
					
		}
		return bikeShop;
	}

	/**Method that adds information to arraylist*/
	
	public void addBikes(String _color, int _size, int _price) {
		bikelist.add(new Bike(_color.toLowerCase(), _size, _price));
	}
}



