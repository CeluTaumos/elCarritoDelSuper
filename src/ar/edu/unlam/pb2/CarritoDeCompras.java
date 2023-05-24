package ar.edu.unlam.pb2;


import java.util.HashSet;

public class CarritoDeCompras {

	//ATRIBUTOS
	private Integer cantMaxProductos;
	private  Integer cantMinProductosParaDescuento;
	private  HashSet <Articulo> articulos;
	
	//CONSTRUCTOR
	
	public Integer getCantMaxProductos() {
		return cantMaxProductos;
	}

	public void setCantMaxProductos(Integer cantMaxProductos) {
		this.cantMaxProductos = cantMaxProductos;
	}

	public Integer getCantMinProductosParaDescuento() {
		return cantMinProductosParaDescuento;
	}

	public void setCantMinProductosParaDescuento(Integer cantMinProductosParaDescuento) {
		this.cantMinProductosParaDescuento = cantMinProductosParaDescuento;
	}

	

	public CarritoDeCompras(Integer cantMaxProductos, Integer cantMinProductosParaDescuento, HashSet productos) {
		super();
		this.cantMaxProductos = cantMaxProductos;
		this.cantMinProductosParaDescuento = cantMinProductosParaDescuento;
		this.articulos = new HashSet <Articulo>();
	}

	public HashSet<Articulo> getArticulos() {
		return articulos;
	}

	public void setArticulos(HashSet<Articulo> articulos) {
		this.articulos = articulos;
	}

	//SI EN EL CARRITO HAY ESPACIO,ME DEJA AGREGAR EL PRODUCTO
	public Boolean agregarProducto(Articulo articulo) {
		boolean seAgrego=false;
		
		if(articulos.size()<=cantMaxProductos) {
		articulos.add(articulo);
		seAgrego=true;
		}
		return seAgrego;
	
		
	}

	public Integer getCantArticulos() {
	
		return articulos.size();
	}

}
