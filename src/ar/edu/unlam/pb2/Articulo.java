package ar.edu.unlam.pb2;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Set;

public abstract class Articulo {
	
	//ATRIBUTOS
	public LocalDate fechaElaboracion;
	public LocalDate fechaVencimiento;
	public String descripcion;
    public Marcas marca;
	public Long COD;
	
	public Double precio;
	

	public Articulo(LocalDate fechaElaboracion,Long COD, Double precio,String descripcion,Marcas marca) {
		super();
		this.fechaElaboracion = fechaElaboracion;
		this.COD=COD;
		this.precio=precio;
		this.descripcion=descripcion;
		this.marca=marca;
	}
	
	public Marcas getMarca() {
		return marca;
	}

	public void setMarca(Marcas marca) {
		this.marca = marca;
	}

	

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Long getCOD() {
		return COD;
	}

	public void setCOD(Long cOD) {
		COD = cOD;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	//METODOS
	public abstract double aplicarDescuentos();
	public abstract LocalDate calculaSeteaFechaVenc(LocalDate fechaElaboracion);
	


	public LocalDate getFechaElaboracion() {
		return fechaElaboracion;
	}
	public void setFechaElaboracion(LocalDate fechaElaboracion) {
		this.fechaElaboracion = fechaElaboracion;
	}
	public LocalDate getFechaVencimiento() {
		return fechaVencimiento;
	}
	public void setFechaVencimiento(LocalDate fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	@Override
	public int hashCode() {
		return Objects.hash(COD);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Articulo other = (Articulo) obj;
		return COD == other.COD;
	}

}