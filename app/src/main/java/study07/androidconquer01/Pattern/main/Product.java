package study07.androidconquer01.Pattern.main;

public abstract class Product {
	
	public abstract String getName();
	public abstract int getPrice();
	
	@Override
	public String toString(){
		return "product name :  " + getName() + ", price" + getPrice();
		
	}
}
