package interfaces;

public interface IDrink {

	String getName();
	Float getPrice();
	void setName(String name);
	void setPrice(Float price);
	boolean equals(Object o);
	String toString();
	//IDrink createSoda(String name, float price);
	//IDrink createAlcoholic(String name,float price);
	
}
