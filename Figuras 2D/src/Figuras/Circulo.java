package Figuras;

import Clases.Abstracta;
import Clases.interfaz;

/**
 * Esta clase representa la figura Circulo
 * 
 * @author: Danny Macias Vanegas
 */

public class Circulo extends Abstracta implements interfaz {

	/**
	 * Atributos de la clase Circulo
	 */
	int radio;

	Circulo cl;

	public Circulo(int radio) {
		super();
		this.radio = radio;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	/**
	 * Metodo donde se calcula el Area del Circulo
	 * y en caso de ingresar un valor erroneo del radio
	 *  se genera una Excepción
	 */
	@Override
	public float area() {

		if (radio <= 0) {

			throw new ArithmeticException("el radio del Circulo no puede ser cero");

		}
		return (float) (Math.PI * Math.pow(this.radio, 2));

	}

	/**
	 * Metodo donde se calcula el Perimetro del Circulo
	 * y en caso de ingresar un valor erroneo del radio
	 *  se genera una Excepción
	 */
	@Override
	public float perimetro() {

		if (radio <= 0) {

			throw new ArithmeticException("el radio del Circulo no puede ser cero");

		}

		return (float) (Math.PI * this.radio);

	}

	/**
	 * Metodo donde se imprime la figura, area y perimetro del Circulo
	 */
	public void imprimirCirculo() {

		System.out.println("Figura: Circulo");
		System.out.println("Area: " + area());
		System.out.println("Perimetro:" + perimetro());

	}

	/**
	 * Metodo implementado de la clase Interfaz que recibe como parametro solamente
	 * a la figura Circulo
	 */
	@Override
	public void imprimir(Circulo circulo, Triangulo triangulo, Cuadrado cuadrado) {

		circulo.imprimirCirculo();

	}

}
