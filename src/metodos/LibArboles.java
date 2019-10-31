package metodos;

import api.ABBTDA;
import implementaciones.ABB;

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
	
	public static Boolean existeElementoEn(ABBTDA unArbol, int unElemento) {
		
		Boolean existe = Boolean.FALSE;
		
		if(!unArbol.ArbolVacio()) {
			if(unArbol.Raiz() == unElemento) {
				existe = Boolean.TRUE;
			}else {
				if(unElemento > unArbol.Raiz()) {
					existe = existeElementoEn(unArbol.HijoDer(), unElemento);
				}else {
					existe = existeElementoEn(unArbol.HijoIzq(), unElemento);
				}
			}
		}
		
		return existe;
	}
	
	public static Boolean esHojaDe(ABBTDA unArbol, int unElemento) {

		Boolean esHoja = Boolean.FALSE;

		ABBTDA elArbolDelElemento = new ABB();

		if (!unArbol.ArbolVacio()) {
			if (unArbol.Raiz() == unElemento) {
				esHoja = elArbolDelElemento.HijoDer().ArbolVacio() && elArbolDelElemento.HijoIzq().ArbolVacio();
			} else {
				if (unElemento > unArbol.Raiz()) {
					esHoja = esHojaDe(unArbol.HijoDer(), unElemento);
				} else {
					esHoja = esHojaDe(unArbol.HijoIzq(), unElemento);
				}
			}
		}

		return esHoja;
	}
	
	public static int profundidad(ABBTDA unArbol, int unElemento) {
		int profundidad = -1;
		
		if(existeElementoEn(unArbol, unElemento)) {
			profundidad = recursividadProfundidad(unArbol, unElemento);
		}
		
		return profundidad;
	}
	
	private static int recursividadProfundidad(ABBTDA unArbol, int unElemento) {
		int profundidad = 0;
		
		if (unArbol.Raiz() < unElemento) {
			profundidad = 1 + recursividadProfundidad(unArbol.HijoDer(), unElemento);
		} else if (unArbol.Raiz() > unElemento) {
			profundidad = 1 + recursividadProfundidad(unArbol.HijoIzq(), unElemento);
		}
		
		return profundidad;
	}
	
	public static int alturaDe(ABBTDA unArbol) {
		int r = -1;
		
		if(!unArbol.ArbolVacio()) {
			int AI = alturaDe(unArbol.HijoIzq());
			int AD = alturaDe(unArbol.HijoDer());
			
			r = 1+(AI>AD? AI: AD);
		}
		
		return r;
	}
	
	public static int cantidadDeElementosDe(ABBTDA unArbol) {
		int cantidad = 0;
		if(!unArbol.ArbolVacio()){
			cantidad = 1 + cantidadDeElementosDe(unArbol.HijoDer()) + cantidadDeElementosDe(unArbol.HijoIzq());
		}
		
		return cantidad;
	}

	public static int sumatoriaDeElementosDe(ABBTDA unArbol) {
		int cantidad = 0;
		if(!unArbol.ArbolVacio()){
			cantidad = unArbol.Raiz() + sumatoriaDeElementosDe(unArbol.HijoDer()) + sumatoriaDeElementosDe(unArbol.HijoIzq());
		}
		
		return cantidad;
	}

	public static int cantidadDeHojasDe(ABBTDA unArbol) {
		int retorno = 0;
		if(!unArbol.ArbolVacio()){
			if(esHoja(unArbol)){
				retorno = 1;
			}else{
				retorno = cantidadDeHojasDe(unArbol.HijoDer()) + cantidadDeHojasDe(unArbol.HijoIzq());
			}
		}
		
		return retorno;
	}
	
	private static Boolean esHoja(ABBTDA unArbol){
		return unArbol.HijoDer().ArbolVacio() && unArbol.HijoIzq().ArbolVacio();
	}
	
}
