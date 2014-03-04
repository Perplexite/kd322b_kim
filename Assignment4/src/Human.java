

public class Human {

	
	private Dog dog;
	private String name;
	private String info;
	
	
	public Human(String name){
		this.name = name;
		
	}
	
	public String getName(){
		return name;
	}
	
	public void buyDog(Dog dog){
		//If pressing buy dog-button, this function should get a dog-value from dog-file.
		this.dog = dog;
	
	}
	
	public String getInfo(){
		
		if(dog != null ) {
			String info = name + ", you own " + dog.getName();
			return info;
		} else {
			
		String info = name + "there be no dawg.";	
		return info;
		
	}
	}
	
}
