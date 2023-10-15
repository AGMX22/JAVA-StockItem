public class StockItem {
	
	private String item;
	private int IDnum;
	private double price;
	private int quantity;
	
	public StockItem(String name, int id, double cost, int howmany) {
		item = name;
		IDnum = id;
		price = cost;
		quantity = howmany;
	}
	
	public String getItemName() {
		return item;
	}
	
	public int getID() {
		return IDnum;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setPrice(double newprice) {
		price = newprice;
	}
	
	public void removeNumber(int num) {
		quantity -=num;
		
		if (quantity < 0)
			quantity = 0;
	}
	
	public void addNumber(int num) {
		quantity += num;
	}
	
	public String toString() {
		return item+" "+IDnum+" $"+price+" "+quantity;
	}
	
}