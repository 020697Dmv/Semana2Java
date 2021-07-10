package Figuras;

import Clases.Abstracta;
import Clases.interfaz;

/**
 * Esta clase representa la figura Cuadrado
 * 
 * @author: Danny Macias Vanegas
 */

public class Cuadrado extends Abstracta implements interfaz {

	/**
	 * Atributos de la clase Cuadrado
	 */
	int ancho;

	public Cuadrado(int ancho) {
		super();
		this.ancho = ancho;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	/**
	 * Metodo donde se calcula el Area del Cuadrado
	 *  y en caso de ingresar un valor erroneo del ancho
	 *  se genera una Excepción
	 */
	@Override
	public float area() {

		if (ancho <= 0) {

			throw new ArithmeticException("el ancho del Cuadrado no puede ser cero");

		}
		return (float) Math.pow(this.ancho, 2);
	}

	/**
	 * Metodo donde se calcula el Perimetro del Cuadrado
	 *  y en caso de ingresar un valor erroneo del ancho
	 *  se genera una Excepción
	 */
	@Override
	public float perimetro() {

		if (ancho <= 0) {

			throw new ArithmeticException("el ancho del Cuadrado no puede ser cero");

		}

		return this.ancho * 4;
	}

	/**
	 * Metodo donde se imprime la figura, area y perimetro del Cuadrado
	 */
	public void imprimirC() {

		System.out.println("Figura: Cuadrado");
		System.out.println("Area: " + area());
		System.out.println("Perimetro:" + perimetro());

	}

	/**
	 * Metodo implementado de la clase Interfaz que recibe como parametro solamente
	 * a la figura Cuadrado
	 */
	@Override
	public void imprimir(Circulo circulo, Triangulo triangulo, Cuadrado cuadrado) {

		cuadrado.imprimirC();

	}

}
