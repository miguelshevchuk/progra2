package implementaciones;

import api.PilaTDA;

public class PilaTF implements PilaTDA {
    int[] a;
    int indice;
	@Override
	public void InicializarPila() {
		// TODO Auto-generated method stub
		a=new int[100]; // Declara un array de 100 elementos
		indice=0;// indice también es contador
	}

	@Override
	public void Apilar(int x) {
		// TODO Auto-generated method stub
		a[indice]=x;
		indice++;// indice+=1
	}

	@Override
	public void Desapilar() {
		// TODO Auto-generated method stub
		indice--;

	}

	
	@Override
	public boolean PilaVacia() {
		// TODO Auto-generated method stub
		return (indice == 0);
	}

	@Override
	public int Tope() {
		// TODO Auto-generated method stub
		return a[indice-1];
	}

}
