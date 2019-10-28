package implementaciones;

import api.ColaTDA;

public class ColaD implements ColaTDA {
	
	private class nodo{
		int dato;
		nodo sig;
	}
	nodo inicio;
	nodo fin;

	public void InicializarCola() {
		inicio =null;
		fin = null;
	}


	public void Acolar(int x) {
		nodo nuevo = new nodo();
		nuevo.dato = x;
		if(inicio != null) {
			nuevo.sig = null;
			fin.sig = nuevo;
			fin = nuevo;
		}else {
			nuevo.sig = null;
			inicio = nuevo;
			fin = nuevo;
		}
	}


	public void Desacolar() {
		inicio = inicio.sig;
		if(this.ColaVacia()) {
			fin = null;
		}
	}


	public boolean ColaVacia() {
		return inicio==null;
	}


	public int Primero() {
		return inicio.dato;
	}

}
