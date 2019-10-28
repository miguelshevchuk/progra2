package test;

import api.ColaPrioridadTDA;
import api.ColaTDA;
import api.ConjuntoTDA;
import api.DiccionarioMultipleTDA;
import api.DiccionarioSimpleTDA;
import api.PilaTDA;
import implementaciones.ColaPU;
import implementaciones.ColaPrioridadDA;
import implementaciones.ConjuntoTA;
import implementaciones.DicMultipleA;
import implementaciones.DicSimpleA;
import implementaciones.PilaTF;
import metodos.Libreria;

public class Test {

	PilaTDA pila, destino;
	ColaTDA cola, colaDestino;
	ColaPrioridadTDA colaPrioridad, colaDestinoPrioridad;
	ConjuntoTDA conjunto, conjuntoDestino;
	ConjuntoTDA primerConjunto, segundoConjunto;
	DiccionarioSimpleTDA diccionarioSimple, diccionarioSimpleDestino;
	DiccionarioMultipleTDA diccionarioMultiple, diccionarioMultipleDestino;
	
	public Test() {
		
		this.pila = new PilaTF();
		this.destino = new PilaTF();
		Libreria.llenar(this.pila);
		this.destino.InicializarPila();
		
		this.cola = new ColaPU();
		this.colaDestino = new ColaPU();
		Libreria.llenar(this.cola);
		this.colaDestino.InicializarCola();
		
		this.colaPrioridad = new ColaPrioridadDA();
		this.colaDestinoPrioridad = new ColaPrioridadDA();
		Libreria.llenar(this.colaPrioridad);
		this.colaDestinoPrioridad.InicializarCola();
		
		this.conjunto = new ConjuntoTA();
		this.conjuntoDestino = new ConjuntoTA();
		Libreria.llenar(this.conjunto);
		this.conjuntoDestino.InicializarConjunto();
		
		this.primerConjunto = new ConjuntoTA();
		this.segundoConjunto = new ConjuntoTA();
		Libreria.llenar(this.primerConjunto);
		this.segundoConjunto.InicializarConjunto();
		this.segundoConjunto.Agregar(3);
		this.segundoConjunto.Agregar(4);
		this.segundoConjunto.Agregar(5);
		this.segundoConjunto.Agregar(6);
		this.segundoConjunto.Agregar(13);
		this.segundoConjunto.Agregar(15);
		this.segundoConjunto.Agregar(16);
		
		this.diccionarioSimple = new DicSimpleA();
		this.diccionarioSimpleDestino = new DicSimpleA();
		Libreria.llenar(this.diccionarioSimple);
		this.diccionarioSimpleDestino.InicializarDiccionario();
		
		this.diccionarioMultiple = new DicMultipleA();
		this.diccionarioMultipleDestino = new DicMultipleA();
		Libreria.llenar(this.diccionarioMultiple);
		this.diccionarioMultipleDestino.InicializarDiccionario();
	}

	public void ejecutar(){
		
		this.ejercicioPilas();
		this.ejercicioColas();
		this.ejercicioColasConPrioridad();
		this.ejercicioConjuntos();
		this.ejercicioDiccionarioSimple();
		this.ejercicioDiccionarioMultiple();
		
	}
	
	private void ejercicioPilas(){
		
		System.out.println("");
		System.out.println("------------INICIO EJERCICIO PILAS-------------");
		System.out.println("");
		
		System.out.println("Muestro pila original");
		Libreria.mostrar(this.pila);
		
		System.out.println("Vuelvo a mostrar pila original");
		Libreria.mostrar(this.pila);
		
		System.out.println("Paso la pila a la pila destino (Se invierte orden)");
		Libreria.pasar(this.pila, this.destino);
		
		System.out.println("Muestro pila original");
		Libreria.mostrar(this.pila);
		
		System.out.println("Muestro pila destino");
		Libreria.mostrar(this.destino);
		
		System.out.println("");
		System.out.println("------------FIN EJERCICIO PILAS-------------");
		System.out.println("");
	}
	
	private void ejercicioColas(){
		
		System.out.println("");
		System.out.println("------------INICIO EJERCICIO COLAS-------------");
		System.out.println("");
		
		System.out.println("Muestro cola original");
		Libreria.mostrar(this.cola);
		
		System.out.println("Vuelvo a mostrar cola original");
		Libreria.mostrar(this.cola);
		
		System.out.println("Paso la cola a la cola destino (NO se invierte orden)");
		Libreria.pasar(this.cola, this.colaDestino);
		
		System.out.println("Muestro cola original");
		Libreria.mostrar(this.cola);
		
		System.out.println("Muestro cola destino");
		Libreria.mostrar(this.colaDestino);
		
		System.out.println("Invierto la cola destino");
		Libreria.invertir(this.colaDestino);

		System.out.println("Muestro cola destino");
		Libreria.mostrar(this.colaDestino);
		
		System.out.println("");
		System.out.println("------------FIN EJERCICIO COLAS-------------");
		System.out.println("");
	}
	
	private void ejercicioColasConPrioridad(){
		
		System.out.println("");
		System.out.println("------------INICIO EJERCICIO COLAS CON PRIORIDAD-------------");
		System.out.println("");
		
		System.out.println("Muestro cola original");
		Libreria.mostrar(this.colaPrioridad);
		
		System.out.println("Vuelvo a mostrar cola original");
		Libreria.mostrar(this.colaPrioridad);
		
		System.out.println("Paso la cola a la cola destino (NO se invierte orden)");
		Libreria.pasar(this.colaPrioridad, this.colaDestinoPrioridad);
		
		System.out.println("Muestro cola original");
		Libreria.mostrar(this.colaPrioridad);
		
		System.out.println("Muestro cola destino");
		Libreria.mostrar(this.colaDestinoPrioridad);
		
		System.out.println("");
		System.out.println("------------FIN EJERCICIO COLAS CON PRIORIDAD-------------");
		System.out.println("");
	}
	
	private void ejercicioConjuntos(){
		
		System.out.println("");
		System.out.println("------------INICIO EJERCICIO CONJUNTOS-------------");
		System.out.println("");
		
		System.out.println("Muestro conjunto original");
		Libreria.mostrar(this.conjunto);
		
		System.out.println("Vuelvo a mostrar el conjunto original");
		Libreria.mostrar(this.conjunto);
		
		System.out.println("Paso el conjunto al conjunto destino");
		Libreria.pasar(this.conjunto, this.conjuntoDestino);
		
		System.out.println("Muestro conjunto original");
		Libreria.mostrar(this.conjunto);
		
		System.out.println("Muestro conjunto destino");
		Libreria.mostrar(this.conjuntoDestino);
		
		System.out.println("");
		System.out.println("---Comparacion de conjuntos---");
		System.out.println("");
		
		System.out.println("Muestro el primer conjunto");
		Libreria.mostrar(this.primerConjunto);
		
		System.out.println("Muestro el segundo conjunto");
		Libreria.mostrar(this.segundoConjunto);
		
		System.out.println("Muestro la union de los conjuntos");
		Libreria.mostrar(Libreria.union(this.primerConjunto, this.segundoConjunto));
		
		System.out.println("Muestro la interseccion de los conjuntos");
		Libreria.mostrar(Libreria.interseccion(this.primerConjunto, this.segundoConjunto));
		
		System.out.println("Muestro la diferencia entre el primer conjunto y el segundo");
		Libreria.mostrar(Libreria.diferencia(this.primerConjunto, this.segundoConjunto));
		
		System.out.println("Muestro la diferencia entre el segundo conjunto y el primero");
		Libreria.mostrar(Libreria.diferencia(this.segundoConjunto, this.primerConjunto));
		
		System.out.println("Muestro la diferencia simetrica entre los conjuntos");
		Libreria.mostrar(Libreria.diferenciaSimetrica(this.segundoConjunto, this.primerConjunto));
		
		System.out.println("Muestro el primer conjunto (No deberia estar modificado por los metodos anteriores)");
		Libreria.mostrar(this.primerConjunto);
		
		System.out.println("Muestro el segundo conjunto (No deberia estar modificado por los metodos anteriores)");
		Libreria.mostrar(this.segundoConjunto);
		
		System.out.println("");
		System.out.println("------------FIN EJERCICIO CONJUNTOS-------------");
		System.out.println("");
	}
	
	private void ejercicioDiccionarioSimple(){
		
		System.out.println("");
		System.out.println("------------INICIO EJERCICIO DICCIONARIO SIMPLE-------------");
		System.out.println("");
		
		System.out.println("Muestro diccionario simple original");
		Libreria.mostrar(this.diccionarioSimple);
		
		System.out.println("Vuelvo a mostrar diccionario simple original");
		Libreria.mostrar(this.diccionarioSimple);
		
		System.out.println("Paso el diccionario simple al diccionario simple destino");
		Libreria.pasar(this.diccionarioSimple, this.diccionarioSimpleDestino);
		
		System.out.println("Muestro diccionario simple original");
		Libreria.mostrar(this.diccionarioSimple);
		
		System.out.println("Muestro diccionario simple destino");
		Libreria.mostrar(this.diccionarioSimpleDestino);
		
		System.out.println("");
		System.out.println("------------FIN EJERCICIO DICCIONARIO SIMPLE-------------");
		System.out.println("");
	}
	
	private void ejercicioDiccionarioMultiple(){
		
		System.out.println("");
		System.out.println("------------INICIO EJERCICIO DICCIONARIO MULTIPLE-------------");
		System.out.println("");
		
		System.out.println("Muestro diccionario Multiple original");
		Libreria.mostrar(this.diccionarioMultiple);
		
		System.out.println("Vuelvo a mostrar diccionario Multiple original");
		Libreria.mostrar(this.diccionarioMultiple);
		
		System.out.println("Paso el diccionario Multiple al diccionario Multiple destino");
		Libreria.pasar(this.diccionarioMultiple, this.diccionarioMultipleDestino);
		
		System.out.println("Muestro diccionario Multiple original");
		Libreria.mostrar(this.diccionarioMultiple);
		
		System.out.println("Muestro diccionario Multiple destino");
		Libreria.mostrar(this.diccionarioMultipleDestino);
		
		System.out.println("");
		System.out.println("------------FIN EJERCICIO DICCIONARIO MULTIPLE-------------");
		System.out.println("");
	}
	
	
	
}
