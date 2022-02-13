package empresa;

import edificios.*;
import productos.*;
import vehiculos.*;

public class Empresa {
	
	protected VehiculoElectrico ve1;
	protected VehiculoElectrico ve2;
	protected VehiculoGasolina vg1;
	protected VehiculoDiesel vd1;
	
	protected Almacen almacen;
	protected Oficina oficina;
	protected Fabrica fabrica;
	
	protected Puerta puerta1;
	protected Puerta puerta2;
	protected Silla silla1;
	protected Silla silla2;
	protected Ventana ventana1;
	protected Ventana ventana2;
	
	public Empresa()
	{
		
		/*this.ve1 = new VehiculoElectrico();
		this.ve2 = new VehiculoElectrico();
		this.vg1 = new VehiculoGasolina();
		this.vd1 = new VehiculoDiesel();
		
		this.almacen = new Almacen();
		this.oficina = new Oficina();
		this.fabrica = new Fabrica();
		
		this.puerta1 = new Puerta();
		this.puerta2 = new Puerta();
		this.silla1 = new Silla();
		this.silla2 = new Silla();
		this.ventana1 = new Ventana();
		this.ventana2 = new Ventana();*/
		
	}
	
	public String print()
	{
		String infoEmpresa = "";
		
		if(ve1==null) {
			infoEmpresa += "NULL\n";
		}
		
		else {
			infoEmpresa += ve1.print() + "\n";
		}
		
		
		if(ve2==null) {
			infoEmpresa += "NULL\n";
		}
		
		else {
			infoEmpresa += ve2.print() + "\n";
		}
		
		if(vg1==null) {
			infoEmpresa += "NULL\n";
		}
		
		else {
			infoEmpresa += vg1.print() + "\n";
		}
		
		
		if(vd1==null) {
			infoEmpresa += "NULL\n";
		}
		
		else {
			infoEmpresa += vd1.print() + "\n";
		}
		
		
		if(almacen==null) {
			infoEmpresa += "NULL\n";
		}
		
		else {
			infoEmpresa += almacen.print() + "\n";
		}
		
		
		if(fabrica==null) {
			infoEmpresa += "NULL\n";
		}
		
		else {
			infoEmpresa += fabrica.print() + "\n";
		}
		
		
		if(oficina==null) {
			infoEmpresa += "NULL\n";
		}
		
		else {
			infoEmpresa += oficina.print() + "\n";
		}
		
		
		if(puerta1==null) {
			infoEmpresa += "NULL\n";
		}
		
		else {
			infoEmpresa += puerta1.print() + "\n";
		}
		
		
		if(puerta2==null) {
			infoEmpresa += "NULL\n";
		}
		
		else {
			infoEmpresa += puerta2.print() + "\n";
		}
		
		
		if(silla1==null) {
			infoEmpresa += "NULL\n";
		}
		
		else {
			infoEmpresa += silla1.print() + "\n";
		}
		
		
		if(silla2==null) {
			infoEmpresa += "NULL\n";
		}
		
		else {
			infoEmpresa += silla2.print() + "\n";
		}
		
		
		if(ventana1==null) {
			infoEmpresa += "NULL\n";
		}
		
		else {
			infoEmpresa += ventana1.print() + "\n";
		}
		
		
		if(ventana2==null) {
			infoEmpresa += "NULL\n";
		}
		
		else {
			infoEmpresa += ventana2.print() + "\n";
		}
		
		return infoEmpresa;
	}

	public VehiculoElectrico getVe1() {
		return ve1;
	}

	public void setVe1(VehiculoElectrico ve1) {
		this.ve1 = ve1;
	}

	public VehiculoElectrico getVe2() {
		return ve2;
	}

	public void setVe2(VehiculoElectrico ve2) {
		this.ve2 = ve2;
	}

	public VehiculoGasolina getVg1() {
		return vg1;
	}

	public void setVg1(VehiculoGasolina vg1) {
		this.vg1 = vg1;
	}

	public VehiculoDiesel getVd1() {
		return vd1;
	}

	public void setVd1(VehiculoDiesel vd1) {
		this.vd1 = vd1;
	}

	public Almacen getAlmacen() {
		return almacen;
	}

	public void setAlmacen(Almacen almacen) {
		this.almacen = almacen;
	}

	public Oficina getOficina() {
		return oficina;
	}

	public void setOficina(Oficina oficina) {
		this.oficina = oficina;
	}

	public Fabrica getFabrica() {
		return fabrica;
	}

	public void setFabrica(Fabrica fabrica) {
		this.fabrica = fabrica;
	}

	public Puerta getPuerta1() {
		return puerta1;
	}

	public void setPuerta1(Puerta puerta1) {
		this.puerta1 = puerta1;
	}

	public Puerta getPuerta2() {
		return puerta2;
	}

	public void setPuerta2(Puerta puerta2) {
		this.puerta2 = puerta2;
	}

	public Silla getSilla1() {
		return silla1;
	}

	public void setSilla1(Silla silla1) {
		this.silla1 = silla1;
	}

	public Silla getSilla2() {
		return silla2;
	}

	public void setSilla2(Silla silla2) {
		this.silla2 = silla2;
	}

	public Ventana getVentana1() {
		return ventana1;
	}

	public void setVentana1(Ventana ventana1) {
		this.ventana1 = ventana1;
	}

	public Ventana getVentana2() {
		return ventana2;
	}

	public void setVentana2(Ventana ventana2) {
		this.ventana2 = ventana2;
	}
	
	public boolean crearProducto(Producto producto)
	{
			
		if(producto.getTipo().equals("Silla")) {
					
			if(silla1==null) {
				
				if(silla2==null) {
					this.silla1 = (Silla) producto;
					return true;
				}
				
				else {
					
					if(producto.getId()!=silla2.getId()) {
						this.silla1 = (Silla) producto;
						return true;
					}
					
					else {
						return false;
					}
					
				}
			}
					
			else if(silla1!=null && silla2==null) {
				
				if(producto.getId()!=silla1.getId()) {
					this.silla2 = (Silla) producto;
					return true;
				}
				
				else {
					return false;
				}
			}
					
			else {
				return false;
			}
		}
		
		else if(producto.getTipo().equals("Puerta")) {
			
			if(puerta1==null) {
		
				if(puerta2==null) {
					this.puerta1 = (Puerta) producto;
					return true;
				}
		
				else {
			
					if(producto.getId()!=puerta2.getId()) {
						this.puerta1 = (Puerta) producto;
						return true;
					}
			
					else {
						return false;
					}
			
				}
			}
			
			else if(puerta1!=null && puerta2==null) {
		
				if(producto.getId()!=puerta1.getId()) {
					this.puerta2 = (Puerta) producto;
					return true;
				}
		
				else {
					return false;
				}
			}
			
			else {
				return false;
			}
		}
		
		else if(producto.getTipo().equals("Ventana")) {
			
			if(ventana1==null) {
		
				if(ventana2==null) {
					this.ventana1 = (Ventana) producto;
					return true;
				}
		
				else {
			
					if(producto.getId()!=ventana2.getId()) {
						this.ventana1 = (Ventana) producto;
						return true;
					}
			
					else {
						return false;
					}
			
				}
			}
			
			else if(ventana1!=null && ventana2==null) {
		
				if(producto.getId()!=ventana1.getId()) {
					this.ventana2 = (Ventana) producto;
					return true;
				}
		
				else {
					return false;
				}
			}
			
			else {
				return false;
			}
		}
			
		
		
		
		else {
			return false;
		}
	}
	
	public boolean venderProducto(Producto producto)
	{
		
		// VENDER SILLAS
		if(producto.getTipo().equals("Silla")) {
		
			if(producto.getId()!=silla1.getId() && producto.getId()!=silla2.getId()) {
	
				return false;
		
			}
		
			else {
			
				if(producto.getId() == silla1.getId() && silla1.getEdificioActual().getTipo().equals("Almacén")) {
				
					silla1 = null;
					return true;
				
				}
			
				else if(producto.getId() == silla2.getId() && silla2.getEdificioActual().getTipo().equals("Almacén")) {
				
					silla2 = null;
					return true;
				
				}
			
				else {
				
					return false;
				
				}
			
			}
			
		}
		
		// VENDER PUERTAS
		else if(producto.getTipo().equals("Puerta")) {
			
			if(producto.getId()!=puerta1.getId() && producto.getId()!=puerta2.getId()) {
			
				return false;
		
			}
		
			else {
			
				if(producto.getId() == puerta1.getId() && puerta1.getEdificioActual().getTipo().equals("Almacén")) {
				
					puerta1 = null;
					return true;
				
				}
			
				else if(producto.getId() == puerta2.getId() && puerta2.getEdificioActual().getTipo().equals("Almacén")) {
				
					puerta2 = null;
					return true;
				
				}
			
				else {
				
					return false;
				
				}
			
			}
		
		}
		
		// VENDER VENTANAS
		else if(producto.getTipo().equals("Ventana")) {
					
			if(producto.getId()!=ventana1.getId() && producto.getId()!=ventana2.getId()) {
					
				return false;
				
			}
				
			else {
					
				if(producto.getId() == ventana1.getId() && ventana1.getEdificioActual().getTipo().equals("Almacén")) {
						
					ventana1 = null;
					return true;
					
				}
					
				else if(producto.getId() == ventana2.getId() && ventana2.getEdificioActual().getTipo().equals("Almacén")) {
						
					ventana2 = null;
					return true;
						
				}
					
				else {
						
					return false;
						
				}
					
			}
				
		}
		
		return false;			
	}
	
	public boolean cambiaUbicación(Producto producto, Edificio edificio) {
		
		if(producto.getId()==silla1.getId()) {
			silla1.setEdificioActual(edificio);
			return true;
		}
		
		else if(producto.getId()==silla2.getId()) {
			silla1.setEdificioActual(edificio);
			return true;
		}
		
		else if(producto.getId()==puerta1.getId()) {
			puerta1.setEdificioActual(edificio);
			return true;
		}
		
		else if(producto.getId()==puerta2.getId()) {
			puerta2.setEdificioActual(edificio);
			return true;
		}
		
		else if(producto.getId()==ventana1.getId()) {
			ventana1.setEdificioActual(edificio);
			return true;
		}
		
		else if(producto.getId()==ventana2.getId()) {
			ventana2.setEdificioActual(edificio);
			return true;
		}
		
		else {
			return false;
		}
		
	}
	
}