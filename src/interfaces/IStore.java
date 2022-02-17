package interfaces;

public interface IStore {

	boolean addDrink(IDrink drink);
	IDrink searchDrink(String name);
	IDrink getDrink(String name);
	boolean updateDrink(String name, IDrink drink);
	boolean isFull();
	Float howMuch();
	/**
	 * 
	 * @param type
	 * @return
	 */
	Integer howMany(Integer type);
	
}
