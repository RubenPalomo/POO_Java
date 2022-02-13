package productos;

import edificios.*;

public class Puerta extends Producto {

	public Puerta()
	{
		this.tipo = "Puerta";
		this.edificioActual = new Fabrica();
	}

}