
public abstract class Item {

	protected String title;
	public Item(String name) {
		
	title = name; 
	
	}

	public abstract String getListing();

	public String getTitle(){

	return title; 
	}

}
