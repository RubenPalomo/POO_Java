import vehiculos.*;
import edificios.*;
import productos.*;
import empresa.*;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Creación de la empresa
		Empresa emp = new Empresa();
		
		// Creación de los diferentes vehículos de la empresa, tal y como se especifican, y asignación a la misma
		VehiculoGasolina vg1 = new VehiculoGasolina();
		vg1.setArrancado(true);
		vg1.setVelocidadActual(80.0f);
		vg1.frenar(20.0f);
		
		VehiculoDiesel vd1 = new VehiculoDiesel();
		vd1.setArrancado(true);
		vd1.setVelocidadActual(80.0f);
		vd1.frenar(20.0f);
		
		VehiculoElectrico ve1 = new VehiculoElectrico();
		ve1.setArrancado(true);
		ve1.setVelocidadActual(50.0f);
		
		VehiculoElectrico ve2 = new VehiculoElectrico();
		ve2.setArrancado(true);
		ve2.setVelocidadActual(50.0f);
		
		emp.setVe1(ve1);
		emp.setVe2(ve2);
		emp.setVd1(vd1);
		emp.setVg1(vg1);
		
		// Creación de los edificios y cálculo del coste de la pintura
		Almacen almacen = new Almacen();
		Fabrica fabrica = new Fabrica();
		Oficina oficina = new Oficina();
		
		emp.setAlmacen(almacen);
		emp.setFabrica(fabrica);
		emp.setOficina(oficina);
		
		System.out.println(fabrica.costePintura("Verde", 30));
		
		// Creación de productos
		Puerta p1 = new Puerta();
		p1.setId(1);		
		
		if(emp.crearProducto(p1)) {
			System.out.println("Producto creado correctamente.");
		}
		
		else {
			System.out.println("Error al crear el producto.");
		}
		
		
		Puerta p2 = new Puerta();
		p2.setId(2);		
		
		if(emp.crearProducto(p2)) {
			System.out.println("Producto creado correctamente.");
		}
		
		else {
			System.out.println("Error al crear el producto.");
		}
		
		
		Silla s1 = new Silla();
		s1.setId(3);		
		
		if(emp.crearProducto(s1)) {
			System.out.println("Producto creado correctamente.");
		}
		
		else {
			System.out.println("Error al crear el producto.");
		}
		
		
		Silla s2 = new Silla();
		s2.setId(4);		
		
		if(emp.crearProducto(s2)) {
			System.out.println("Producto creado correctamente.");
		}
		
		else {
			System.out.println("Error al crear el producto.");
		}
		
		
		Ventana v1 = new Ventana();
		v1.setId(5);		
		
		if(emp.crearProducto(v1)) {
			System.out.println("Producto creado correctamente.");
		}
		
		else {
			System.out.println("Error al crear el producto.");
		}
		
		
		Ventana v2 = new Ventana();
		v2.setId(6);		
		
		if(emp.crearProducto(v2)) {
			System.out.println("Producto creado correctamente.");
		}
		
		else {
			System.out.println("Error al crear el producto.");
		}
		
		// Venta de los productos designados
		p1.setEdificioActual(almacen);
		if(emp.venderProducto(p1)) {
			System.out.println("Se ha vendido el producto.");
		}
		
		else {
			System.out.println("Error al vender el producto.");
		}
		
		v1.setEdificioActual(almacen);
		if(emp.venderProducto(v1)) {
			System.out.println("Se ha vendido el producto.");
		}
		
		else {
			System.out.println("Error al vender el producto.");
		}
		
		// Creación de nuevos productos
		Puerta p3 = new Puerta();
		p3.setId(2);		
		
		if(emp.crearProducto(p3)) {
			System.out.println("Producto creado correctamente.");
		}
		
		else {
			System.out.println("Error al crear el producto.");
		}
		
		
		Puerta p4 = new Puerta();
		p4.setId(10);		
		
		if(emp.crearProducto(p4)) {
			System.out.println("Producto creado correctamente.");
		}
		
		else {
			System.out.println("Error al crear el producto.");
		}
		
		
		// Imprimir la información de todos los productos, vehículos y edificios de la empresa
		System.out.println("\n");
		System.out.println(emp.print());
	}

}