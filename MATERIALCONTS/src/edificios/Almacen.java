package edificios;

public class Almacen extends Edificio {
	
	public Almacen()
	{
		this.tipo = "Almacén";
	}

	@Override
	public String funcionalidadEdificio() {
		// TODO Auto-generated method stub
		return "En el almacén se guarda el producto para posteriormente venderlo";
	}

}
