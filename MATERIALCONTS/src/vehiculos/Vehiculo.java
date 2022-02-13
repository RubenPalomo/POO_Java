package vehiculos;

public class Vehiculo implements GestionVehiculo {
	
	protected float precio;
	protected String marca;
	protected String color;
	protected float peso;
	protected float longitud;
	protected float velocidadActual;
	protected boolean arrancado;
	
	
	public Vehiculo()
	{
		this.precio = 10000.0f;
		this.marca = "Seat";
		this.color = "Rojo";
		this.peso = 800.0f;
		this.longitud = 4000.f;
		this.velocidadActual = 0;
		this.arrancado = false;
	}
	
	
	public float getPrecio() {
		return precio;
	}


	public void setPrecio(float precio) {
		this.precio = precio;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public float getPeso() {
		return peso;
	}


	public void setPeso(float peso) {
		this.peso = peso;
	}


	public float getLongitud() {
		return longitud;
	}


	public void setLongitud(float longitud) {
		this.longitud = longitud;
	}


	public float getVelocidadActual() {
		return velocidadActual;
	}


	public void setVelocidadActual(float velocidadActual) {
		this.velocidadActual = velocidadActual;
	}


	public boolean isArrancado() {
		return arrancado;
	}


	public void setArrancado(boolean arrancado) {
		this.arrancado = arrancado;
	}


	public String print()
	{
		return this.precio + "€ - " + this.marca + " - " + this.color + " - " + this.peso + "kg - " + this.longitud + "cm\n" + 
		"Arrancado: " + this.arrancado + " - " + "Velocidad actual: " + this.velocidadActual + "\n";
	}

	@Override
	public boolean acelerar(float incremento) {
		// TODO Auto-generated method stub
		if (this.arrancado){
			this.velocidadActual = velocidadActual + incremento;
			return true;
		}
		
		else {
			return false;
		}
	}

	@Override
	public boolean frenar(float decremento) {
		// TODO Auto-generated method stub
		if (this.arrancado){
			
			this.velocidadActual = velocidadActual - decremento;
			if (this.velocidadActual <= 0) {
				this.velocidadActual = 0;
			}
			return true;
		}
		
		else {
			return false;
		}
	}

	@Override
	public boolean arrancar() {
		// TODO Auto-generated method stub
		if (this.arrancado){
			return true;
		}
		
		else {
			return false;
		}
	}

	@Override
	public boolean parar() {
		// TODO Auto-generated method stub
		if(this.arrancado) {
			return true;
		}
		
		else {
			return false;
		}
	}
}