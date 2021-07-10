package Pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import Figuras.Circulo;
import Figuras.Cuadrado;
import Figuras.Triangulo;

/**
 * Esta clase representa las Pruebas unitarias de la aplicación
 * 
 * @author: Danny Macias Vanegas
 */

class Pruebas {

	/**
	 * Metodo donde se compara el valor calculado del Area del Triangulo
	 */
	@Test
	public void testAreaP() {

		Triangulo tr = new Triangulo(10, 10, 10);
		float area = tr.area();
		float esperadoArea = 50;

		assertEquals(esperadoArea, area);

	}

	/**
	 * Metodo donde se compara el valor calculado del perimetro del Triangulo
	 */
	@Test
	public void testPerimetroP() {

		Triangulo tr = new Triangulo(10, 10, 10);
		float perimetro = tr.perimetro();
		float esperadoP = 30;

		assertEquals(esperadoP, perimetro);

	}

	/**
	 * Metodo donde se verifica que los campos de los 3 lados del Triangulo
	 * ingresados por consola sean validos para el metodo Perimetro
	 */
	@Test
	public void pruebaTP() {

		Triangulo tr = new Triangulo(0, 0, 0);

		assertThrows(ArithmeticException.class, () -> tr.perimetro());

	}

	/**
	 * Metodo donde se verifica que el campo radio del Triangulo ingresados por
	 * consola sea valido para el metodo Area
	 */
	@Test
	public void pruebaTA() {

		Triangulo tr = new Triangulo(0, 0, 0);

		assertThrows(ArithmeticException.class, () -> tr.area());

	}

	/**
	 * Metodo donde se compara el valor calculado del Area del Cuadrado
	 */
	@Test
	public void testAreaC() {

		Cuadrado ca = new Cuadrado(10);
		float area = ca.area();
		float esperadoArea = 100;

		assertEquals(esperadoArea, area);

	}

	/**
	 * Metodo donde se compara el valor calculado del perimetro del Cuadrado
	 */
	@Test
	public void testPerimetroC() {

		Cuadrado ca = new Cuadrado(10);
		float perimetro = ca.perimetro();
		float esperadoP = 40;

		assertEquals(esperadoP, perimetro);

	}

	/**
	 * Metodo donde se verifica que el campo ancho del Cuadrado ingresados por
	 * consola sea valido para el metodo Perimetro
	 */
	@Test
	public void pruebaCP() {

		Cuadrado ca = new Cuadrado(0);

		assertThrows(ArithmeticException.class, () -> ca.perimetro());

	}

	/**
	 * Metodo donde se verifica que el campo radio del Cuadrado ingresados por
	 * consola sea valido para el metodo Area
	 */
	@Test
	public void pruebaCA() {

		Cuadrado ca = new Cuadrado(0);

		assertThrows(ArithmeticException.class, () -> ca.area());

	}

	/**
	 * Metodo donde se compara el valor calculado del Area del Circulo
	 */
	@Test
	public void testAreaCirculo() {

		Circulo ci = new Circulo(30);
		float area = ci.area();
		float esperadoArea = (float) 2827.4333;

		assertEquals(esperadoArea, area);

	}

	/**
	 * Metodo donde se compara el valor calculado del perimetro del Circulo
	 */
	@Test
	public void testPerimetroCirculo() {

		Circulo ci = new Circulo(30);
		float perimetro = ci.perimetro();
		float esperadoP = (float) 94.24778;

		assertEquals(esperadoP, perimetro);

	}

	/**
	 * Metodo donde se verifica que el campo radio del Circulo ingresados por
	 * consola sea valido para el metodo Perimetro
	 */
	@Test
	public void pruebaCirculo() {

		Circulo ci = new Circulo(0);

		assertThrows(ArithmeticException.class, () -> ci.perimetro());

	}

	/**
	 * Metodo donde se verifica que el campo radio del Circulo ingresados por
	 * consola sea valido para el metodo Area
	 */
	@Test
	public void pruebaACirculo() {

		Circulo ci = new Circulo(0);

		assertThrows(ArithmeticException.class, () -> ci.area());

	}

}
