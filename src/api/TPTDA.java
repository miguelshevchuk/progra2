package api;

import implementaciones.ConjuntoLD;

public interface TPTDA {
	void InicializarDiccionario();
	void Agregar(int clave, int valor);
	void Eliminar(int clave);
	void EliminarValor(int clave, int valor);
	void Recuperar(int clave);
	ColaTDA Claves();
	float PromedioValores(int clave);
	boolean DiccionarioVacio();
	TPTDA HijoIzq();
	TPTDA HijoDer();
	int Raiz();
	void AgregarValor(int clave, int valor);
	ConjuntoLD MoverValores(int clave);
}
