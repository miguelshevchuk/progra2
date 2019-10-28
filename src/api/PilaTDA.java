package api;

public interface PilaTDA {
	void InicializarPila();
	// Siempre que la pila este iniciada
	void Apilar(int x);
	// Siempre que la pila no este vacia
	void Desapilar();
	// Siempre que est� inicializada
	boolean PilaVacia();
	// Siempre que no est� vacia.
	int Tope();
	

}
