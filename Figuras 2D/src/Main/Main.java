package Main;

import javax.swing.JOptionPane;

import Clases.Abstracta;
import Figuras.Circulo;
import Figuras.Cuadrado;
import Figuras.Triangulo;

/**
 * Esta clase representa el main de la aplicación
 * 
 * @author: Danny Macias Vanegas
 */

public class Main {

	public static void main(String[] args) {

		/**
		 * Variable opc en la cual se le solicita al Usuario que ingrese un numero según
		 * su elección
		 */
		int opc = Integer.parseInt(JOptionPane.showInputDialog(
				"Selecione la figura escribiendo el numero \n 1. Circulo \n 2. Triangulo \n 3. Cuadrado \n 4. Salir "));

		/**
		 * Este while verifica si la opción ingresada por el usuario es correcta
		 */
		while (opc > 3 || opc < 1) {

			JOptionPane.showMessageDialog(null, "Opcion incorrecta ");

			opc = Integer.parseInt(JOptionPane.showInputDialog(
					"Selecione la figura escribiendo el numero \n 1. Circulo \n 2. Triangulo \n 3. Cuadrado \n 4. Salir"));

		}

		while(opc>0 && opc<5 ){

		/**
		 * switch donde se ejecutan los metodos de acuerdo a la opcion seleccionada
		 */
		switch (opc) {

		/**
		 * En el case 1 se solicita ingresar el radio del Circulo, posteriormente se
		 * crea un objeto de la clase Circulo. Por ultimo se llama el metodo imprimir y
		 * se envia como parametro el objeto creado
		 */
		case 1:

			int radio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el radio del Circulo "));

			Circulo cir = new Circulo(radio);
			cir.imprimir(cir, null, null);
			
			opc = Integer.parseInt(JOptionPane.showInputDialog(
					"Selecione la figura escribiendo el numero \n 1. Circulo \n 2. Triangulo \n 3. Cuadrado \n 4. Salir"));

			break;

		/**
		 * En el case 2 se solicita ingresar los 3 lados del Triangulo, posteriormente
		 * se crea un objeto de la clase Triangulo. Por ultimo se llama el metodo
		 * imprimir y se envia como parametro el objeto creado
		 */
		case 2:

			int lado1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el lado 1 del Triangulo "));

			int lado2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el lado 2 del Triangulo "));

			int lado3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el lado 3 del Triangulo "));

			Triangulo tr = new Triangulo(lado1, lado2, lado3);

			tr.imprimir(null, tr, null);
			
			opc = Integer.parseInt(JOptionPane.showInputDialog(
					"Selecione la figura escribiendo el numero \n 1. Circulo \n 2. Triangulo \n 3. Cuadrado \n 4. Salir"));

			break;

		/**
		 * En el case 2 se solicita ingresar el ancho del Cuadrado, posteriormente se
		 * crea un objeto de la clase Cuadrado. Por ultimo se llama el metodo imprimir y
		 * se envia como parametro el objeto creado
		 */
		case 3:

			int ancho = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ancho del Cuadrado "));

			Cuadrado cu = new Cuadrado(ancho);

			cu.imprimir(null, null, cu);
			
			opc = Integer.parseInt(JOptionPane.showInputDialog(
					"Selecione la figura escribiendo el numero \n 1. Circulo \n 2. Triangulo \n 3. Cuadrado \n 4. Salir"));

			break;
			
		case 4:
			
			break;

		}
	}
	}

}
