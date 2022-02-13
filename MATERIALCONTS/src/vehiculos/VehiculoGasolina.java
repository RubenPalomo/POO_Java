package vehiculos;

public class VehiculoGasolina extends Vehiculo {
	
	protected float contaminacion;
	protected float tamanoDeposito;


	public float getContaminacion() {
		return contaminacion;
	}


	public void setContaminacion(float contaminacion) {
		this.contaminacion = contaminacion;
	}


	public float getTamanoDeposito() {
		return tamanoDeposito;
	}


	public void setTamanoDeposito(float tamanoDeposito) {
		this.tamanoDeposito = tamanoDeposito;
	}
	
	@Override
	public String print()
	{
		return super.print() +  this.contaminacion + " - " + this.tamanoDeposito;
	}
}
