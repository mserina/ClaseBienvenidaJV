package edu.claseBienvenidaJ.servicios;
/** 
 * Implementacion de la interfaz Menu.
 */

public class MenuImplementacion implements MenuInterfaz {
	
	/**
	 * Metodo que imprinme por pantalla mensaje de bienvenida
	 * 260923 - msm
	 */

	@Override
	public void mostrarMensajeBienvenida() {
		
		String mensaje ="Clinica CIS1";
		
		System.out.println(mensaje);
		
	}

}
