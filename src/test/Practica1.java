package test;

import api.ColaPrioridadTDA;
import implementaciones.ColaPrioridadDA;
import metodos.Libreria;

public class Practica1 {

	//Atributos para los ejercicios
	ColaPrioridadTDA colaPrioridadUno, colaPrioridadDos;
	
	public Practica1() {
		//Fixture ejercicio 6
		this.colaPrioridadUno = new ColaPrioridadDA();
		this.colaPrioridadDos = new ColaPrioridadDA();
		Libreria.llenar(this.colaPrioridadUno);

		colaPrioridadDos.InicializarCola();
		colaPrioridadDos.AcolarPrioridad(11, 9);
		colaPrioridadDos.AcolarPrioridad(12, 87);
		colaPrioridadDos.AcolarPrioridad(13, 50);
		colaPrioridadDos.AcolarPrioridad(14, 1);
		colaPrioridadDos.AcolarPrioridad(15, 23);
		colaPrioridadDos.AcolarPrioridad(16, 1);
		colaPrioridadDos.AcolarPrioridad(17, 1);
		colaPrioridadDos.AcolarPrioridad(18, 10);
		colaPrioridadDos.AcolarPrioridad(19, 1);
		colaPrioridadDos.AcolarPrioridad(20, 15);
	}
	
	public void ejecutar() {
		
		System.out.println("");
		System.out.println("---EJECUTO PRACTICA 1---");
		System.out.println("");
		
		this.ejercicio6A();
		this.ejercicio6B();
	}
	
	private void ejercicio6A() {
		System.out.println("");
		System.out.println("---INICIO EJERCICIO 6 A---");
		System.out.println("");
		
		System.out.println("Al combinar las dos colas, quedan ordenadas, siendo la cola 1 la que tiene mas prioridad");
		System.out.println("Muestro primera cola");
		Libreria.mostrar(this.colaPrioridadUno);
		
		System.out.println("Muestro segunda cola");
		Libreria.mostrar(this.colaPrioridadDos);

		System.out.println("Muestro la combinacion de ambas");
		Libreria.mostrar(Libreria.combinarColasConPrioridad(this.colaPrioridadUno, this.colaPrioridadDos));
		
		
		System.out.println("");
		System.out.println("---FIN EJERCICIO 6 A---");
		System.out.println("");
	}
	
	private void ejercicio6B() {
		System.out.println("");
		System.out.println("---INICIO EJERCICIO 6 B---");
		System.out.println("");
		
		System.out.println("Paso dos colas por parametro y verifico si son identicas");
		System.out.println("Muestro primera cola");
		Libreria.mostrar(this.colaPrioridadUno);
		
		System.out.println("Muestro segunda cola");
		Libreria.mostrar(this.colaPrioridadDos);

		System.out.println("Verifico si ambas son iguales");
		System.out.println("Son iguales ?? : "+ Libreria.lasDosColasSonIdenticas(this.colaPrioridadUno, this.colaPrioridadDos));
		
		System.out.println("Ahora paso la misma cola y verifico si ambas son iguales");
		System.out.println("Son iguales ?? : "+ Libreria.lasDosColasSonIdenticas(this.colaPrioridadUno, this.colaPrioridadUno));
		
		System.out.println("");
		System.out.println("---FIN EJERCICIO 6 B---");
		System.out.println("");
	}
	
}
