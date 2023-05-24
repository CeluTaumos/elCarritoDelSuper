package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import java.time.LocalDate;

import java.util.HashSet;

import org.junit.Test;

public class CasosDePrueba {

	@Test
	public void queSePuedaCrearElCarrito() {
		
		//DATOS DE ENTRADA
		Integer cantMaxProductos;
		Integer cantMinProductosParaDescuento;
		HashSet <Articulo> articulos;
		CarritoDeCompras carrito;
		
		//INSTANCIACION
		cantMaxProductos=80;
		cantMinProductosParaDescuento=15;
		articulos=new HashSet <>();
		carrito= new CarritoDeCompras(cantMaxProductos,cantMinProductosParaDescuento,articulos);
		
		//LA PRUEBA EN SI
		assertNotNull(carrito);
		
	}
	

	@Test
	public void queSePuedanAgregarProductosAElCarrito() {
		
		/*EN ESTE METODO VAMOS A ATESTEAR LOS PRODUCTOS EN EL CARRITO,PARA ESO VAMOS A GUARDAR LOS P´RODUCTOS EN EL "ALMACEN"
		 * Y DESDE AHI "HACER LA COMPRA"---NO SE PUEDEN COMPRAR DOS PRODUCTOS DE IGUAL CÓDIGO PORQUE ESO NO ES POSIBLE*/
		
		//DATOS DE ENTRADA
		final Integer CANT_ESPERADA_PRODUCTOS=1; 
		HashSet<Articulo> articulos;
		CarritoDeCompras carrito;
		Articulo sacheLeche;
		Articulo otroSacheLeche;
		LocalDate fechaElaboracion;
		
		//INSTANCIACION
		articulos =new HashSet <>();
		carrito= new CarritoDeCompras(50,5,articulos);
		Almacen deOlga= new Almacen ("De Olga",22l,carrito);
		fechaElaboracion= LocalDate.now();
		sacheLeche=new Lacteo (fechaElaboracion, 5l, 100.0, "sache de leche", Marcas.LASERENISIMA);
		otroSacheLeche=new Lacteo (fechaElaboracion, 5l, 100.0, "sache de leche", Marcas.LASERENISIMA);	
		//ACCION
		deOlga.agregarProducto(sacheLeche);
		deOlga.agregarProducto(otroSacheLeche);
		deOlga.getCarrito().agregarProducto(sacheLeche);
		deOlga.getCarrito().agregarProducto(otroSacheLeche);
		//LA PRUEBA EN SI
		assertEquals(CANT_ESPERADA_PRODUCTOS,carrito.getCantArticulos());
	
		
		
	}
	
	
	
}
