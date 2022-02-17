package view;

import interfaces.IDrink;
import interfaces.IView;

public class view implements IView{

	@Override
	public void showMainMenu() {
		// TODO Auto-generated method stub
		System.out.println("1. ");
	}

	@Override
	public int readMainMenuOption() {
		// TODO Auto-generated method stub
		return this.leeEntero();
	}

	@Override
	public void secundaryMenu() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int readSecundaryOption() {
		// TODO Auto-generated method stub
		return this.leeEntero();
	}

	@Override
	public void print(String f) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print(IDrink d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float leeFloat() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String leeString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int leeEntero() {
		// TODO Auto-generated method stub
		return 0;
	}

}
