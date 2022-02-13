package vehiculos;

public interface GestionVehiculo {
	
	boolean acelerar(float incremento);
	boolean frenar(float decremento);
	boolean arrancar();
	boolean parar();

}
