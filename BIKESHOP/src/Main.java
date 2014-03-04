import java.util.ArrayList;



public class Main {
	
	
	/**This is the bikestore array list*/
	public static void main(String[] args) {
	
		ArrayList<Bike> bikelist = new ArrayList<Bike>();
	
	Bike bicycle1 =new Bike("blue", 16, 4100);
	Bike bicycle2 =new Bike("green", 28, 4100);
	Bike bicycle3 =new Bike("yellow", 20, 4100);
	Bike bicycle4 =new Bike("orange", 14, 4100);
	Bike bicycle5 =new Bike("red", 26, 4100);
	Bike bicycle6 =new Bike("pink", 28, 4100);
	Bike bicycle7 =new Bike("purple", 12, 4100);
	Bike bicycle8 =new Bike("invisible", 20, 29000);
	Bike bicycle9 =new Bike("white", 20, 4100);
	Bike bicycle10 =new Bike("black", 24, 4100);
	
	
	bikelist.add(bicycle1);
	bikelist.add(bicycle2);
	bikelist.add(bicycle3);
	bikelist.add(bicycle4);
	bikelist.add(bicycle5);
	bikelist.add(bicycle6);
	bikelist.add(bicycle7);
	bikelist.add(bicycle8);
	bikelist.add(bicycle9);
	bikelist.add(bicycle10);
	
	

	for(int i = 0;i < bikelist.size(); i++) {
		System.out.println("Color is " + bikelist.get(i).getColor());
		
	}
}
	
}


