package interfaces;

public interface IView {

	void showMainMenu();
	int readMainMenuOption();
	void secundaryMenu();
	int readSecundaryOption();
	void print(String f);
	void print(IDrink d);
	float leeFloat();
	String leeString();
	int leeEntero();
}
