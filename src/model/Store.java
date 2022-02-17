package model;

import controller.MainController;
import interfaces.IDrink;
import interfaces.IMainController;
import interfaces.IStore;

public class Store implements IStore{

	private IDrink[][] drinks;
	
	public Store() {
		drinks=new IDrink[3][3];
	}
	public Store(int ncols,int nrows) {
		drinks=new IDrink[nrows][ncols];
	}
	
	@Override
	public boolean addDrink(IDrink drink) {
		// TODO Auto-generated method stub
		boolean result=false;
		if(!isFull() && searchDrink(drink.getName())==null && drink!=null) {
			for (int i = 0; i < drinks.length; i++) {
				for (int j = 0; j < drinks[0].length-1; j++) {
					if(drinks[i][j]!=drink) {
						if(drinks[i][j]==null) {
							drinks[i][j]=drink;
							result=true;
							i=drinks.length;
							j=-1;
						}
					}
				}
			}
		}
		
		return result;
	}

	@Override
	public IDrink searchDrink(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IDrink getDrink(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateDrink(String name, IDrink drink) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Float howMuch() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer howMany(Integer type) {
		// TODO Auto-generated method stub
		return null;
	}

}
