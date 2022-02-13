package edificios;

public class Oficina extends Edificio {

	public Oficina()
	{
		this.tipo = "Oficina";
	}
	
	@Override
	public String funcionalidadEdificio() {
		// TODO Auto-generated method stub
		return "En la oficina se etiqueta el producto";
	}

}
