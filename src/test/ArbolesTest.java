package test;

import api.ABBTDA;
import implementaciones.ABB;
import metodos.LibArboles;

public class ArbolesTest {

	ABBTDA arbol;
	
	public ArbolesTest() {
		arbol = new ABB();
		arbol.InicializarArbol();
		
		arbol.AgregarElem(41);
		arbol.AgregarElem(32);
		arbol.AgregarElem(70);
		arbol.AgregarElem(25);
		arbol.AgregarElem(38);
		arbol.AgregarElem(45);
		arbol.AgregarElem(82);
		arbol.AgregarElem(16);
		arbol.AgregarElem(28);
		arbol.AgregarElem(34);
		arbol.AgregarElem(43);
		arbol.AgregarElem(48);
		arbol.AgregarElem(78);
		arbol.AgregarElem(84);
		arbol.AgregarElem(47);
		arbol.AgregarElem(55);
		
	}
	
	public void ejecutar() {
		this.testMetodoProfundidad();

		this.testMetodoAltura();
//		this.testMetodoElMenor();
	}
	
	private void testMetodoProfundidad() {
		System.out.println("");
		System.out.println("------------------- METODO DE PROFUNDIDAD -------------------");
		System.out.println("");
		
		System.out.println("Profundidad del 48 deberia ser 3: "+LibArboles.profundidad(this.arbol, 48));
		System.out.println("Profundidad del 55 deberia ser 4: "+LibArboles.profundidad(this.arbol, 55));
		System.out.println("Profundidad del 25 deberia ser 2: "+LibArboles.profundidad(this.arbol, 25));
		System.out.println("Profundidad del 32 deberia ser 1: "+LibArboles.profundidad(this.arbol, 32));
		
		System.out.println("Profundidad del 150 no existe: "+LibArboles.profundidad(this.arbol, 150));
	}
	
	private void testMetodoAltura() {
		System.out.println("");
		System.out.println("------------------- METODO DE ALTURA -------------------");
		System.out.println("");
		
		System.out.println("La altura del arbol tiene que ser 4: "+LibArboles.alturaDe(this.arbol));
	}
	
//	private void testMetodoElMenor() {
//		System.out.println("");
//		System.out.println("------------------- METODO PARA CALCULAR EL MENOR -------------------");
//		System.out.println("");
//		
//		System.out.println("El menor elemento es el: "+LibArboles.elMenorElementoDe(this.arbol));
//	}
	
}
