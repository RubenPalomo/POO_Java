package edificios;

public class Fabrica extends Edificio {

	public Fabrica()
	{
		this.tipo = "F�brica";
	}
	
	@Override
	public String funcionalidadEdificio() {
		// TODO Auto-generated method stub
		return "En la f�brica se crea el producto";
	}
	
}