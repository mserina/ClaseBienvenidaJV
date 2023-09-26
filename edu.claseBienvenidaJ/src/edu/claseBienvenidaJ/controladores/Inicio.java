package edu.claseBienvenidaJ.controladores;

import edu.claseBienvenidaJ.servicios.MenuImplementacion;
import edu.claseBienvenidaJ.servicios.MenuInterfaz;

/**
 * Clase principal de la aplicacion
 * 260923 - msm
 */
public class Inicio {

	/**
	 * Metodo principal de nuestra aplicacion
	 * 260923 - msm
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		MenuInterfaz mi = new MenuImplementacion();
		
		mi.mostrarMensajeBienvenida();

	}

}
