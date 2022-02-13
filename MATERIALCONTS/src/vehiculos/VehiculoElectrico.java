package vehiculos;

public class VehiculoElectrico extends Vehiculo {

	protected float potencia;
	protected float velocidadMax;
	
	
	public float getPotencia() {
		return potencia;
	}
	
	
	public void setPotencia(float potencia) {
		this.potencia = potencia;
	}
	
	
	public float getVelocidadMax() {
		return velocidadMax;
	}
	
	
	public void setVelocidadMax(float velocidadMax) {
		this.velocidadMax = velocidadMax;
	}
	
	@Override
	public String print()
	{
		return super.print() + this.potencia + " - " + this.velocidadMax;
	}
}
