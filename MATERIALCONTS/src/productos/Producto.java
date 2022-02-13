package productos;

import edificios.*;

public class Producto{
	
	protected int id;
	protected String nombre;
	protected String tipo;
	protected float anchura;
	protected float altura;
	protected float profundidad;
	protected String color;
	protected Edificio edificioActual;
	
	public Producto() {
		
	}

	public Producto(String tipo)
	{
		this.tipo = tipo;
		this.edificioActual = new Fabrica();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Edificio getEdificioActual() {
		return edificioActual;
	}

	public void setEdificioActual(Edificio edificioActual) {
		this.edificioActual = edificioActual;
	}
	
	public String print()
	{
		return this.id + " - " + this.nombre + " - " + this.tipo + " - " + this.anchura + " - " +
		this.altura + " - " + this.profundidad + " - " + this.color + " - " + this.edificioActual;
	}
}