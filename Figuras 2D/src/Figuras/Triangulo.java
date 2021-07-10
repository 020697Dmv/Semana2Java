package Figuras;

import Clases.Abstracta;
import Clases.interfaz;

/**
 * Esta clase representa la figura Triangulo
 * 
 * @author: Danny Macias Vanegas
 */

public class Triangulo extends Abstracta implements interfaz {

	/**
	 * Atributos de la clase Triangulo
	 */
	int lado1;

	int lado2;

	int lado3;

	public Triangulo(int lado1, int lado2, int lado3) {
		super();
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}

	public int getLado1() {
		return lado1;
	}

	public void setLado1(int lado1) {
		this.lado1 = lado1;
	}

	public int getLado2() {
		return lado2;
	}

	public void setLado2(int lado2) {
		this.lado2 = lado2;
	}

	public int getLado3() {
		return lado3;
	}

	public void setLado3(int lado3) {
		this.lado3 = lado3;
	}

	/**
	 * Metodo donde se calcula el Area del Triangulo
	 * y en caso de ingresar un valor erroneo de los 3 lados
	 *  se genera una Excepción
	 */
	@Override
	public float area() {

		if (lado1 <= 0 || lado2 <= 0) {

			throw new ArithmeticException("el lado del traingulo no puede ser cero");

		}

		return (this.lado1 * this.lado2) / 2;
	}

	/**
	 * Metodo donde se calcula el Perimetro del Triangulo
	 *  y en caso de ingresar un valor erroneo de los 3 lados
	 *  se genera una Excepción
	 */
	@Override
	public float perimetro() {

		if (lado1 <= 0 || lado2 <= 0) {

			throw new ArithmeticException("el lado del traingulo no puede ser cero");

		}

		return lado1 + lado2 + lado3;
	}

	/**
	 * Metodo donde se imprime la figura, area y perimetro del Triangulo
	 */
	public void imprimirT() {

		System.out.println("Figura: Triangulo");
		System.out.println("Area: " + area());
		System.out.println("Perimetro:" + perimetro());

	}

	/**
	 * Metodo implementado de la clase Interfaz que recibe como parametro solamente
	 * a la figura Triangulo
	 */
	@Override
	public void imprimir(Circulo circulo, Triangulo triangulo, Cuadrado cuadrado) {

		triangulo.imprimirT();
	}

}
