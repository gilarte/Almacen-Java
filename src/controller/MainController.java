package controller;

import interfaces.IDrink;
import interfaces.IMainController;
import interfaces.IStore;
import interfaces.IView;
import model.Alcoholic;
import model.Soda;

public class MainController implements IMainController{

	IView view;
	IStore store;
	
	@Override
	public void run() {
		int option=-1;
		do {
			showMainMenu();
			option=view.readMainMenuOption();
			
		}while(option!=5);
		
	}
	
	/**
	 * Ejecuta una de las opciones disponibles del
	 * menú principal en función del valor de option
	 */
	private void showMainMenu() {
		view.showMainMenu();
	}
	
	/**
	 * Ejecuta una de las opciones disponibles del
	 * menú principla en función del valor de option
	 * @param option valor leído por teclado después del menú principal
	 */
	private void switchMain(int option) {
		switch(option) {
			case 1: boolean result=addDrink();
			if(result) {
				view.print("Bebida insertada.");
			}else {
				view.print("Error insertando bebida.");
			}
		break;
			case 2: 
				view.print("Inserte el nombre de la bebida");
				String name = view.leeString(); // <---
				IDrink d=searchDrink(name);
				if(d==null) {
					view.print("La bebida no existe.");
				}else {
					view.print(d);
				}
				//mostrar
			case 3: 
				view.print("Inserte el nombre de la bebida");
				String name1 = null; //<---
				getDrink(name1);
				//mostrar
				break;
			case 4: 
				IDrink drink = null; //<---
				updateDrink(drink);
				break;
			case 5: getHowMuch();
				break;
			case 6: //BYE BYE
				view.print("Hasta la próxima.");
				break;
				default: //NO OPCION
					view.print("Opcion incorrecta.");
				
		
		}
	}
	
	/**
	 * Ejecuta la acción de añadir ua nueva bebida para
	 * tomar los datos hace uso de SecundaryController
	 * @param drink bebida nueva a insertar
	 * @return devuelve false si no pudo ser insertada por:
	 * no haber espacio o existir ya una bebida con el
	 * mismo nombre
	 */
	private boolean addDrink() {
		view.print("Inserte el nombre de la bebida.");
		String name=view.leeString();
		view.print("Inserte el precio de la bebida.");
		float precio=view.leeFloat();
		view.print("Inserte tipo de bebida 1 Alcohólica, 2 Refresco");
		int tipo=view.leeEntero();
		IDrink newDrink=null;
		if(tipo==1) {
			newDrink=new Alcoholic(precio,name);
		}else {
			newDrink=new Soda(precio,name);
		}
		
		return store.addDrink(newDrink);
		
	}
	
	/**
	 * Busca y devuelve la bebida dada por el nombre name
	 * @param name nombre de la bebida a buscar
	 * @return devuelve la bebida o null en caso de no existir
	 */
	private IDrink searchDrink(String name) {
		return store.searchDrink(name);
	}
	
	/**
	 * Busca, devuelve y elimina del almacen la bebida dada 
	 * por el nombre name
	 * @param name nombre de la bebida a extraer
	 * @return la bebida o null en caso de no existir
	 */
	private IDrink getDrink(String name) {
		return store.getDrink(name);
		
	}
	
	/**
	 * Actualiza bebida con los nuevos datos insertados
	 * @param drink bebida a ser actualizada
	 * @return devuleve false en caso de no haber podido ser actualizada
	 */
	private boolean updateDrink(IDrink drink) {
		return false;
	}
	
	/**
	 * Devuelve la cantidad de dinero en bebidas que 
	 * existe en el almacen
	 * @return
	 */
	private float getHowMuch() {
		return 0;
	}
	

}
