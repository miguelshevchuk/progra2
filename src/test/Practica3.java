package test;

import api.ColaPrioridadTDA;
import api.DiccionarioSimpleTDA;
import api.PilaTDA;
import implementaciones.ColaPrioridadAO;
import implementaciones.DicSimpleL;
import implementaciones.PilaTF;
import metodos.Libreria;

public class Practica3 {

	PilaTDA unaPila, otraPila;
	ColaPrioridadTDA unaColaPrioridad;
	DiccionarioSimpleTDA unDiccionario;
	
	public Practica3() {
		this.unaPila = new PilaTF();
		this.otraPila = new PilaTF();
		
		this.unaPila.InicializarPila();
		this.otraPila.InicializarPila();
		
		this.unaColaPrioridad = new ColaPrioridadAO();
		this.unaColaPrioridad.InicializarCola();
		
		this.unDiccionario = new DicSimpleL();
		this.unDiccionario.InicializarDiccionario();
	}
	
	public void ejecutar() {
		
		System.out.println("");
		System.out.println("------------EJECUTO PRACTICA 3------------");
		System.out.println("");
		
		this.ejercicio1B();
		this.ejercicio1D();
		this.ejercicio4();
		this.ejercicio5punto2();
	}
	
	public void ejercicio1B() {
		System.out.println("");
		System.out.println("---INICIO EJERCICIO 1 B---");
		System.out.println("");
		
		Libreria.llenar(this.unaPila);
		this.unaPila.Apilar(1);
		this.unaPila.Apilar(2);
		this.unaPila.Apilar(2);
		this.unaPila.Apilar(4);
		this.unaPila.Apilar(7);
		
		System.out.println("Muestro una pila con elementos repetidos: ");
		Libreria.mostrar(this.unaPila);
		System.out.println("Elimino los elementos repetidos y vuelvo a mostrar: ");
		Libreria.eliminarElementosRepetidosDe(this.unaPila);
		Libreria.mostrar(this.unaPila);
		
		
		System.out.println("");
		System.out.println("---FIN EJERCICIO 1 B---");
		System.out.println("");
	}
	
	public void ejercicio1D() {
		System.out.println("");
		System.out.println("---INICIO EJERCICIO 1 D---");
		System.out.println("");
		
		Libreria.llenar(this.unaPila);
		this.unaPila.Apilar(1);
		this.unaPila.Apilar(2);
		this.unaPila.Apilar(2);
		this.unaPila.Apilar(4);
		this.unaPila.Apilar(7);
		this.unaPila.Apilar(3);
		
		System.out.println("Muestro una pila con elementos repetidos: ");
		Libreria.mostrar(this.unaPila);
		System.out.println("Genero el conjunto con los elementos que se repiten y lo muestro: ");
		
		Libreria.mostrar(Libreria.generarConjuntoDeRepetidosDe(this.unaPila));
		
		
		System.out.println("");
		System.out.println("---FIN EJERCICIO 1 D---");
		System.out.println("");
	}
	
	public void ejercicio4() {
		System.out.println("");
		System.out.println("---INICIO EJERCICIO 4---");
		System.out.println("");
		
		Libreria.llenar(this.unaColaPrioridad);
		this.unaColaPrioridad.AcolarPrioridad(6, 15);
		this.unaColaPrioridad.AcolarPrioridad(6, 20);
		this.unaColaPrioridad.AcolarPrioridad(6, 2);
		
		System.out.println("Muestro la cola: ");
		Libreria.mostrar(this.unaColaPrioridad);
		System.out.println("Genero el diccionario y lo muestro");
		
		Libreria.mostrar(Libreria.generarDiccionarioMultiple(this.unaColaPrioridad));
		
		
		System.out.println("");
		System.out.println("---FIN EJERCICIO 4---");
		System.out.println("");
	}
	
	public void ejercicio5punto2() {
		System.out.println("");
		System.out.println("---INICIO EJERCICIO 5.2---");
		System.out.println("");
		
		Libreria.llenar(this.unDiccionario);
		
		System.out.println("Muestro el diccionario simple: ");
		Libreria.mostrar(this.unDiccionario);
		System.out.println("Genero el diccionario multiple con los siginificados como claves y lo muestro");
		
		Libreria.mostrar(Libreria.generarDiccionarioMultipleAPartirDeSignificados(this.unDiccionario));
		
		System.out.println("");
		System.out.println("---FIN EJERCICIO 5.2---");
		System.out.println("");
	}
	
}
