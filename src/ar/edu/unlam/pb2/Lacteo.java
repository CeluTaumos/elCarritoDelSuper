package ar.edu.unlam.pb2;

import java.time.LocalDate;

public class Lacteo extends Articulo  {

	//SEGUN EL PRODUCTO CAMBIA EL VALOR DEL DESCUENTO Y EL SETEO DE LA FECHA DE VENC

	public Lacteo(LocalDate fechaElaboracion, long COD,Double precio, String descripcion,Marcas marca) {
		super(fechaElaboracion, COD, precio, descripcion, marca);
	
	}

	public void precioEconomico() {
		if(Marcas.VACALIN != null )
			this.precio-=precio%15;
	}

	@Override
	public double aplicarDescuentos() {
		
		return this.precio-= precio%10;
	}

	@Override
	public LocalDate calculaSeteaFechaVenc(LocalDate fechaElaboracion) {
		LocalDate fechaVenc=fechaElaboracion.plusMonths(1);
		return fechaVenc;
	}


	

}
