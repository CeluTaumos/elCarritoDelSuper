package ar.edu.unlam.pb2;

import java.util.HashSet;


public class Almacen {

	private String nombre;
	private  Long CUIL;
	private HashSet <Articulo> articulos;
	private CarritoDeCompras carrito;
	
	
	public Almacen(String nombre, Long cUIL,CarritoDeCompras carrito) {
		super();
		this.nombre = nombre;
		this.CUIL = cUIL;
		this.carrito=carrito;
		this.articulos = new HashSet<Articulo>();
	}
	
	
	public CarritoDeCompras getCarrito() {
		return carrito;
	}


	public void setCarrito(CarritoDeCompras carrito) {
		this.carrito = carrito;
	}


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Long getCUIL() {
		return CUIL;
	}
	public void setCUIL(Long cUIL) {
		CUIL = cUIL;
	}


	public Boolean agregarProducto(Articulo art) {
	return articulos.add(art);
		
	}
}
