package model;

import interfaces.IDrink;

public class Alcoholic implements IDrink{
	private float price;
	private String name;
	
	public Alcoholic() {
		this(0f,"");
		
	}
	
	public Alcoholic(float price, String name) {
		super();
		this.price = price;
		this.name = name;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public Float getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPrice(Float price) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "Alcoholic [price=" + price + ", name=" + name + "]";
	}
}
