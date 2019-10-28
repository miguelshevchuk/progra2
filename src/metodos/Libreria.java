package metodos;

import api.ColaPrioridadTDA;
import api.ColaTDA;
import api.ConjuntoTDA;
import api.DiccionarioMultipleTDA;
import api.DiccionarioSimpleTDA;
import api.PilaTDA;
import implementaciones.ColaPI;
import implementaciones.ColaPU;
import implementaciones.ColaPrioridadAO;
import implementaciones.ConjuntoTA;
import implementaciones.DicMultipleA;
import implementaciones.DicSimpleA;
import implementaciones.PilaTF;

public class Libreria {
	
	public static void mostrar(PilaTDA unaPila) {

		if(unaPila.PilaVacia()){
			System.out.println("La pila esta vacia");
		}else{
			PilaTDA otraPila;
			otraPila = new PilaTF();
			otraPila.InicializarPila();
			copiar(unaPila, otraPila);

			while (!otraPila.PilaVacia()) {
				System.out.println("Mi tope de la pila es " + otraPila.Tope());

				otraPila.Desapilar();
			}
		}
		
	}
	
	public static void llenar(PilaTDA unaPila){
		unaPila.InicializarPila();
		unaPila.Apilar(1);	
		unaPila.Apilar(2);	
		unaPila.Apilar(3);	
		unaPila.Apilar(4);	
		unaPila.Apilar(5);	
		unaPila.Apilar(6);	
		unaPila.Apilar(7);	
		unaPila.Apilar(8);	
		unaPila.Apilar(9);	
		unaPila.Apilar(10);
	}
	
	public static void copiar(PilaTDA unaPila, PilaTDA otraPila){

		PilaTDA unaPilaAuxiliar;
		unaPilaAuxiliar = new PilaTF();

		unaPilaAuxiliar.InicializarPila();

		pasar(unaPila, unaPilaAuxiliar);

		while (!unaPilaAuxiliar.PilaVacia()) {
			unaPila.Apilar(unaPilaAuxiliar.Tope());
			otraPila.Apilar(unaPilaAuxiliar.Tope());

			unaPilaAuxiliar.Desapilar();
		}
		
		
	}
	
	/**
	 * Paso la pila pero queda invertida en la otra pila
	 * 
	 * @param unaPila
	 * @param otraPila
	 */
	public static void pasar(PilaTDA unaPila, PilaTDA otraPila){
		while(!unaPila.PilaVacia()){
			otraPila.Apilar(unaPila.Tope());
			
			unaPila.Desapilar();
		}
	}
	
	////////COLAS
	
	public static void mostrar(ColaTDA unaCola) {
		
		if(unaCola.ColaVacia()){
			System.out.println("La cola esta vacia");
		}else{
			ColaTDA otraCola;
			otraCola = new ColaPI();
			otraCola.InicializarCola();
			copiar(unaCola, otraCola);
			
			while (!otraCola.ColaVacia()) {
				System.out.println("El primero de la cola es " + otraCola.Primero());
				
				otraCola.Desacolar();
			}
		}
		
	}
	
	public static void llenar(ColaTDA unaCola){
		unaCola.InicializarCola();
		unaCola.Acolar(1);	
		unaCola.Acolar(2);	
		unaCola.Acolar(3);	
		unaCola.Acolar(4);	
		unaCola.Acolar(5);	
		unaCola.Acolar(6);	
		unaCola.Acolar(7);	
		unaCola.Acolar(8);	
		unaCola.Acolar(9);	
		unaCola.Acolar(10);
	}
	
	public static void copiar(ColaTDA unaCola, ColaTDA otraCola){
		
		ColaTDA unaColaAuxiliar;
		unaColaAuxiliar = new ColaPU();
		
		unaColaAuxiliar.InicializarCola();
		
		pasar(unaCola, unaColaAuxiliar);
		
		while (!unaColaAuxiliar.ColaVacia()) {
			unaCola.Acolar(unaColaAuxiliar.Primero());
			otraCola.Acolar(unaColaAuxiliar.Primero());
			
			unaColaAuxiliar.Desacolar();
		}
		
		
	}
	
	/**
	 * Paso la cola y la otra cola queda en el mismo orden
	 * 
	 * @param unaCola
	 * @param otraCola
	 */
	public static void pasar(ColaTDA unaCola, ColaTDA otraCola){
		while(!unaCola.ColaVacia()){
			otraCola.Acolar(unaCola.Primero());
			
			unaCola.Desacolar();
		}
	}
	
	public static void invertir(ColaTDA unaCola){
		
		if(unaCola.ColaVacia()){
			System.out.println("La cola esta vacia -.-");
		}else{
			//SIN RECURSIVIDAD (USANDO PILA)
//			PilaTDA unaPila = new PilaTF();
//			unaPila.InicializarPila();
//			
//			pasar(unaCola, unaPila);
//			
//			pasar(unaPila, unaCola);
			
			//CON RECURSIVIDAD
			
			int primero = unaCola.Primero();
			unaCola.Desacolar();
			invertir(unaCola);
			unaCola.Acolar(primero);
			
		}
		
	}
	
	public static void pasar(ColaTDA unaCola, PilaTDA unaPila){
		while(!unaCola.ColaVacia()){
			unaPila.Apilar(unaCola.Primero());
			unaCola.Desacolar();
		}
	}
	
	public static void pasar(PilaTDA unaPila, ColaTDA unaCola){
		while(!unaPila.PilaVacia()){
			unaCola.Acolar(unaPila.Tope());
			unaPila.Desapilar();
		}
	}
	
	////////COLAS CON PRIORIDAD
	
	public static void mostrar(ColaPrioridadTDA unaCola) {
		
		if(unaCola.ColaVacia()){
			System.out.println("La cola esta vacia");
		}else{
			ColaPrioridadTDA otraCola;
			otraCola = new ColaPrioridadAO();
			otraCola.InicializarCola();
			copiar(unaCola, otraCola);
			
			while (!otraCola.ColaVacia()) {
				System.out.println("El primero de la cola es " + otraCola.Primero() + " y tiene prioridad " + otraCola.Prioridad());
				
				otraCola.Desacolar();
			}
		}
		
	}
	
	public static void llenar(ColaPrioridadTDA unaCola){
		unaCola.InicializarCola();
		unaCola.AcolarPrioridad(1, 20);	
		unaCola.AcolarPrioridad(2, 5);	
		unaCola.AcolarPrioridad(3, 10);	
		unaCola.AcolarPrioridad(4, 25);	
		unaCola.AcolarPrioridad(5, 1);	
		unaCola.AcolarPrioridad(6, 12);	
		unaCola.AcolarPrioridad(7, 12);	
		unaCola.AcolarPrioridad(8, 10);	
		unaCola.AcolarPrioridad(9, 1);	
		unaCola.AcolarPrioridad(10, 15);
	}
	
	public static void copiar(ColaPrioridadTDA unaCola, ColaPrioridadTDA otraCola){
		
		ColaPrioridadTDA unaColaAuxiliar;
		unaColaAuxiliar = new ColaPrioridadAO();
		
		unaColaAuxiliar.InicializarCola();
		
		pasar(unaCola, unaColaAuxiliar);
		
		while (!unaColaAuxiliar.ColaVacia()) {
			unaCola.AcolarPrioridad(unaColaAuxiliar.Primero(), unaColaAuxiliar.Prioridad());
			otraCola.AcolarPrioridad(unaColaAuxiliar.Primero(), unaColaAuxiliar.Prioridad());
			
			unaColaAuxiliar.Desacolar();
		}
		
		
	}
	
	/**
	 * Paso la cola y la otra cola queda en el mismo orden
	 * 
	 * @param unaCola
	 * @param otraCola
	 */
	public static void pasar(ColaPrioridadTDA unaCola, ColaPrioridadTDA otraCola){
		while(!unaCola.ColaVacia()){
			otraCola.AcolarPrioridad(unaCola.Primero(), unaCola.Prioridad());
			
			unaCola.Desacolar();
		}
	}
	
	/////CONJUNTOS
	
	//HACER METODOS UNION, INTERSECCION Y DIFERENCIA QUE DEVUELVAN OTRO CONJUNTO
	
	public static void mostrar(ConjuntoTDA unConjunto) {
		
		if(unConjunto.ConjuntoVacio()){
			System.out.println("El conjunto esta vacio");
		}else{
			ConjuntoTDA otroConjunto;
			otroConjunto = new ConjuntoTA();
			otroConjunto.InicializarConjunto();
			copiar(unConjunto, otroConjunto);
			
			while (!otroConjunto.ConjuntoVacio()) {
				int elegido = otroConjunto.Elegir();
				System.out.println("El elemento elegido del conjunto es " + elegido);
				
				otroConjunto.Sacar(elegido);
			}
		}
		
	}
	
	public static void llenar(ConjuntoTDA unConjunto){
		unConjunto.InicializarConjunto();
		unConjunto.Agregar(1);	
		unConjunto.Agregar(2);	
		unConjunto.Agregar(3);	
		unConjunto.Agregar(4);	
		unConjunto.Agregar(5);	
		unConjunto.Agregar(6);	
		unConjunto.Agregar(7);	
		unConjunto.Agregar(8);	
		unConjunto.Agregar(9);	
		unConjunto.Agregar(10);
	}
	
	public static void copiar(ConjuntoTDA unConjunto, ConjuntoTDA otroConjunto){
		
		ConjuntoTDA unConjuntoAuxiliar;
		unConjuntoAuxiliar = new ConjuntoTA();
		
		unConjuntoAuxiliar.InicializarConjunto();
		
		pasar(unConjunto, unConjuntoAuxiliar);
		
		while (!unConjuntoAuxiliar.ConjuntoVacio()) {
			int elegido = unConjuntoAuxiliar.Elegir();
			unConjunto.Agregar(elegido);
			otroConjunto.Agregar(elegido);
			
			unConjuntoAuxiliar.Sacar(elegido);
		}
		
		
	}
	
	public static void pasar(ConjuntoTDA unConjunto, ConjuntoTDA otroConjunto){
		while(!unConjunto.ConjuntoVacio()){
			int elegido = unConjunto.Elegir();
			otroConjunto.Agregar(elegido);
			
			unConjunto.Sacar(elegido);
		}
	}
	
	public static ConjuntoTDA union(ConjuntoTDA unConjunto, ConjuntoTDA otroConjunto){
		
		ConjuntoTDA conjuntoUnion = new ConjuntoTA();
		conjuntoUnion.InicializarConjunto();
		
		copiar(unConjunto, conjuntoUnion);
		copiar(otroConjunto, conjuntoUnion);

		return conjuntoUnion;
	}
	
	public static ConjuntoTDA interseccion(ConjuntoTDA unConjunto, ConjuntoTDA otroConjunto){
		
		ConjuntoTDA conjuntoInterseccion = new ConjuntoTA();
		conjuntoInterseccion.InicializarConjunto();
		
		ConjuntoTDA unConjuntoCopia = new ConjuntoTA();
		unConjuntoCopia.InicializarConjunto();
		
		copiar(unConjunto, unConjuntoCopia);
		
		while(!unConjuntoCopia.ConjuntoVacio()){
			int elegido = unConjuntoCopia.Elegir();
			if(otroConjunto.Pertenece(elegido)){
				conjuntoInterseccion.Agregar(elegido);
			}
			unConjuntoCopia.Sacar(elegido);
		}
		
		return conjuntoInterseccion;
	}
	
	public static ConjuntoTDA diferencia(ConjuntoTDA unConjunto, ConjuntoTDA otroConjunto){
		
		ConjuntoTDA conjuntoDiferencia = new ConjuntoTA();
		conjuntoDiferencia.InicializarConjunto();
		
		ConjuntoTDA unConjuntoCopia = new ConjuntoTA();
		unConjuntoCopia.InicializarConjunto();
		
		ConjuntoTDA otroConjuntoCopia = new ConjuntoTA();
		otroConjuntoCopia.InicializarConjunto();
		
		copiar(unConjunto, unConjuntoCopia);
		copiar(otroConjunto, otroConjuntoCopia);
		
		while(!unConjuntoCopia.ConjuntoVacio()){
			int elegido = unConjuntoCopia.Elegir();
			if(!otroConjunto.Pertenece(elegido)){
				conjuntoDiferencia.Agregar(elegido);
			}
			unConjuntoCopia.Sacar(elegido);
		}
		
		return conjuntoDiferencia;
	}
	
	public static ConjuntoTDA diferenciaSimetrica(ConjuntoTDA unConjunto, ConjuntoTDA otroConjunto){
		
		ConjuntoTDA conjuntoDiferencia = union(diferencia(unConjunto, otroConjunto), diferencia(otroConjunto, unConjunto));
		
		return conjuntoDiferencia;
	}
	
	
	////DICCIONARIO SIMPLE
	
	public static void mostrar(DiccionarioSimpleTDA unDiccionario) {
		
		if(unDiccionario.Claves().ConjuntoVacio()){
			System.out.println("El diccionario esta vacio");
		}else{
			
			ConjuntoTDA claves = unDiccionario.Claves();
			
			while (!claves.ConjuntoVacio()) {
				int elegido = claves.Elegir();
				System.out.println("La clave elegida es " + elegido + " y su valor es "+ unDiccionario.Recuperar(elegido));
				
				claves.Sacar(elegido);
			}
		}
		
	}
	
	public static void llenar(DiccionarioSimpleTDA unDiccionario){
		unDiccionario.InicializarDiccionario();
		unDiccionario.Agregar(1, 4);	
		unDiccionario.Agregar(2, 5);	
		unDiccionario.Agregar(3, 1);	
		unDiccionario.Agregar(4, 4);	
		unDiccionario.Agregar(5, 8);	
		unDiccionario.Agregar(6, 3);	
		unDiccionario.Agregar(7, 154);	
		unDiccionario.Agregar(8, 1);	
		unDiccionario.Agregar(9, 1);	
		unDiccionario.Agregar(10, 8);
	}
	
	public static void copiar(DiccionarioSimpleTDA unDiccionario, DiccionarioSimpleTDA otroDiccionario){
		
		DiccionarioSimpleTDA unDiccionarioAuxiliar;
		unDiccionarioAuxiliar = new DicSimpleA();
		
		unDiccionarioAuxiliar.InicializarDiccionario();
		
		pasar(unDiccionario, unDiccionarioAuxiliar);
		
		ConjuntoTDA claves = unDiccionario.Claves();
		
		while (!claves.ConjuntoVacio()) {
			int claveElegida = claves.Elegir();
			int valorElegido = unDiccionarioAuxiliar.Recuperar(claveElegida);
			unDiccionario.Agregar(claveElegida, valorElegido);
			otroDiccionario.Agregar(claveElegida, valorElegido);
			
			claves.Sacar(claveElegida);
		}
		
		
	}
	
	public static void pasar(DiccionarioSimpleTDA unDiccionario, DiccionarioSimpleTDA otroDiccionario){
		ConjuntoTDA claves = unDiccionario.Claves();
		while(!claves.ConjuntoVacio()){
			int claveElegida = claves.Elegir();
			int valorElegido = unDiccionario.Recuperar(claveElegida);
			otroDiccionario.Agregar(claveElegida, valorElegido);
			
			claves.Sacar(claveElegida);
		}
	}
	
	//DICCIONARIO MULTIPLE
	
	public static void mostrar(DiccionarioMultipleTDA unDiccionario) {
		
		if(unDiccionario.Claves().ConjuntoVacio()){
			System.out.println("El diccionario esta vacio");
		}else{
			
			ConjuntoTDA claves = unDiccionario.Claves();
			
			while (!claves.ConjuntoVacio()) {
				int elegido = claves.Elegir();
				ConjuntoTDA valores = unDiccionario.Recuperar(elegido);
				System.out.print("La clave elegida es " + elegido + " y sus valores son : ");
				
				while(!valores.ConjuntoVacio()){
					
					int valorElegido = valores.Elegir();
					
					System.out.print(valorElegido + " ");
					
					valores.Sacar(valorElegido);
					
				}
				
				System.out.println("");
				
				claves.Sacar(elegido);
			}
		}
		
	}
	
	public static void llenar(DiccionarioMultipleTDA unDiccionario){
		unDiccionario.InicializarDiccionario();
		unDiccionario.Agregar(1, 4);	
		unDiccionario.Agregar(1, 8);	
		unDiccionario.Agregar(1, 7);	
		unDiccionario.Agregar(2, 5);	
		unDiccionario.Agregar(3, 1);	
		unDiccionario.Agregar(4, 4);	
		unDiccionario.Agregar(4, 5);	
		unDiccionario.Agregar(4, 12);	
		unDiccionario.Agregar(5, 8);	
		unDiccionario.Agregar(6, 3);	
		unDiccionario.Agregar(7, 154);	
		unDiccionario.Agregar(7, 356);	
		unDiccionario.Agregar(8, 1);	
		unDiccionario.Agregar(9, 1);	
		unDiccionario.Agregar(10, 8);
	}
	
	public static void copiar(DiccionarioMultipleTDA unDiccionario, DiccionarioMultipleTDA otroDiccionario){
		
		DiccionarioMultipleTDA unDiccionarioAuxiliar;
		unDiccionarioAuxiliar = new DicMultipleA();
		
		unDiccionarioAuxiliar.InicializarDiccionario();
		
		pasar(unDiccionario, unDiccionarioAuxiliar);
		
		ConjuntoTDA claves = unDiccionario.Claves();
		
		while (!claves.ConjuntoVacio()) {
			int claveElegida = claves.Elegir();
			ConjuntoTDA valorElegido = unDiccionarioAuxiliar.Recuperar(claveElegida);
			
			while(!valorElegido.ConjuntoVacio()){
				
				int elegido = valorElegido.Elegir();
				
				unDiccionario.Agregar(claveElegida, elegido);
				otroDiccionario.Agregar(claveElegida, elegido);
				
				valorElegido.Sacar(elegido);
				
			}
			
			claves.Sacar(claveElegida);
		}
		
		
	}
	
	public static void pasar(DiccionarioMultipleTDA unDiccionario, DiccionarioMultipleTDA otroDiccionario){
		ConjuntoTDA claves = unDiccionario.Claves();
		while(!claves.ConjuntoVacio()){
			int claveElegida = claves.Elegir();
			ConjuntoTDA valorElegido = unDiccionario.Recuperar(claveElegida);
			
			while(!valorElegido.ConjuntoVacio()){
				
				int elegido = valorElegido.Elegir();
				
				otroDiccionario.Agregar(claveElegida, elegido);
				
				valorElegido.Sacar(elegido);
				
			}

			claves.Sacar(claveElegida);
		}
	}
}
