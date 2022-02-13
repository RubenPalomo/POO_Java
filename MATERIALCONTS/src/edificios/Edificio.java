package edificios;

public abstract class Edificio {

	protected float anchura;
	protected float altura;
	protected float profundidad;
	protected String material;
	protected String tipo;
	protected float precioMercado;
	protected String color;
	
	
	public Edificio(){
		this.tipo = "Almacén";
		this.color = "Blanco";
		this.altura = 5.0f;
		this.anchura = 10.f;
		this.profundidad = 10.f;
	}
	
	public float getAnchura() {
		return anchura;
	}
	
	
	public void setAnchura(float anchura) {
		this.anchura = anchura;
	}
	
	
	public float getAltura() {
		return altura;
	}
	
	
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	
	public float getProfundidad() {
		return profundidad;
	}
	
	
	public void setProfundidad(float profundidad) {
		this.profundidad = profundidad;
	}
	
	
	public String getMaterial() {
		return material;
	}
	
	
	public void setMaterial(String material) {
		this.material = material;
	}
	
	
	public String getTipo() {
		return tipo;
	}
	
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	public float getPrecioMercado() {
		return precioMercado;
	}
	
	
	public void setPrecioMercado(float precioMercado) {
		this.precioMercado = precioMercado;
	}
	
	
	public String getColor() {
		return color;
	}
	
	
	public void setColor(String color) {
		this.color = color;
	}
	
	
	public float costePintura(String color, float precioMetro)
	{
		float precio;
		precio = precioMetro * this.altura * this.anchura * this.profundidad;
		
		if(precio<0) {
			precio = -1;
		}
		
		return precio;
	}
	
	
	public float costePintura(String color, float precioMetro, String valor)
	{
		float precio = 0;
		
		if(valor.equals("ladoprofundidad")) {
			precio = precioMetro * this.altura * this.anchura;
		}
		
		else if(valor.equals("ladoanchura")) {
			precio = precioMetro * this.altura * this.profundidad;
		}
		
		if(precio<0) {
			precio = -1;
		}
		
		return precio;
	}
	
	
	public String print()
	{
		return this.anchura + " - " + this.altura + " - " + this.profundidad + " - " + this.material +
		" - " + this.tipo + " - " + this.precioMercado + " - " + this.color + " - " + this.funcionalidadEdificio();
				
	}
	
	
	public abstract String funcionalidadEdificio();
}
