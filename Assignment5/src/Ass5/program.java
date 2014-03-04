package Ass5;

public class program {

	private String name;
	private String code;
	private int women;
	private int men;

	public program (String name, String code, int women, int men) { 
		this.name = name;				 
		this.code = code;				
		this.women = women;
		this.men = men;

	}

	public String getName() {

		return name;
	}

	public String getCode() {

		return code;
	}

	public int getWomen() {

		return women;
	}

	public int getMen() {

		return men;
	}

	@Override
	public String toString(){
		return name;
	}

}
