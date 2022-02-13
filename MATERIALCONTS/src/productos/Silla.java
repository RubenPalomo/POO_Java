package productos;

import edificios.*;

public class Silla extends Producto {

	public Silla()
	{
		this.tipo = "Silla";
		this.edificioActual = new Fabrica();
	}

}