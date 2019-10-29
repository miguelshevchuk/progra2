package metodos;

import api.ABBTDA;

public class LibArboles {

	public static void preOrder(ABBTDA arbol){
		if(!arbol.ArbolVacio()){
			System.out.println(arbol.Raiz());
			preOrder(arbol.HijoIzq());
			preOrder(arbol.HijoDer());
		}
	}
	
	public static void inOrder(ABBTDA arbol){
		if(!arbol.ArbolVacio()){
			preOrder(arbol.HijoIzq());
			System.out.println(arbol.Raiz());
			preOrder(arbol.HijoDer());
		}
	}
	
	public static void postOrder(ABBTDA arbol){
		if(!arbol.ArbolVacio()){
			preOrder(arbol.HijoIzq());
			preOrder(arbol.HijoDer());
			System.out.println(arbol.Raiz());
		}
	}
	
}
