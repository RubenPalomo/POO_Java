package edificios;

public class Fabrica extends Edificio {

	public Fabrica()
	{
		this.tipo = "Fábrica";
	}
	
	@Override
	public String funcionalidadEdificio() {
		// TODO Auto-generated method stub
		return "En la fábrica se crea el producto";
	}
	
}