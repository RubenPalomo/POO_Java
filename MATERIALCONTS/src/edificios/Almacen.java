package edificios;

public class Almacen extends Edificio {
	
	public Almacen()
	{
		this.tipo = "Almac�n";
	}

	@Override
	public String funcionalidadEdificio() {
		// TODO Auto-generated method stub
		return "En el almac�n se guarda el producto para posteriormente venderlo";
	}

}
