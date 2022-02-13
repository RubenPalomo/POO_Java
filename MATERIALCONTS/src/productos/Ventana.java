package productos;

import edificios.*;

public class Ventana extends Producto {

	public Ventana()
	{
		this.tipo = "Ventana";
		this.edificioActual = new Fabrica();
	}

}