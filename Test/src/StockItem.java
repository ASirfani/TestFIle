public class StockItem {


	private String destription;
	private static int variableID = 0;
	private int variablePrice;
	private int variableQuantity;

	// Default constructor
	public StockItem() {

	}

	// Overloading constructor
	public StockItem(String destription, int variablePrice, int variableQuantity) {
		this.destription = destription;
		this.variablePrice = variablePrice;
		this.variableQuantity = variableQuantity;

		variableID++; // A unique id number must be generated for each newly
	}

	//getter methods
	public String getDestription() {
		return destription;
	}

	public int getVariablePrice() {
		return variablePrice;
	}
	public int getVariableQuantity() {
		return variableQuantity;
	}

	public static int getVariableID() {
		return variableID;
	}
	
	// setter method of price item
	public void setVariablePrice(int variablePrice) {
		this.variablePrice = variablePrice;
	}

	@Override
	public String toString() {
		return "{" + " destription='" + getDestription() + "'" + ", variableID='" + getVariableID() + "'"
				+ ", variablePrice='" + getVariablePrice() + "'" + ", variableQuantity='" + getVariableQuantity() + "'"
				+ "}";
	}

	public void removeQuantity(int quantityToRemove) {
		this.variableQuantity -= quantityToRemove;
	}

	public void addQuantity(int quantityToAdd) {
		this.variableQuantity += quantityToAdd;
	}

}
