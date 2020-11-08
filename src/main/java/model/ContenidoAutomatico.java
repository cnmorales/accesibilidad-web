package model;

public class ContenidoAutomatico {
	
	Double duracion;
	Boolean movimientoEfecto;
	Boolean controlesDePausaODetencion;
	
	public ContenidoAutomatico(Double duracion, Boolean movimientoEfecto, Boolean controlesDePausaODetencion) {
		super();
		this.duracion = duracion;
		this.movimientoEfecto = movimientoEfecto;
		this.controlesDePausaODetencion = controlesDePausaODetencion;
	}
	public Double getDuracion() {
		return duracion;
	}
	public void setDuracion(Double duracion) {
		this.duracion = duracion;
	}
	public Boolean getMovimientoEfecto() {
		return movimientoEfecto;
	}
	public void setMovimientoEfecto(Boolean movimientoEfecto) {
		this.movimientoEfecto = movimientoEfecto;
	}
	public Boolean getControlesDePausaODetencion() {
		return controlesDePausaODetencion;
	}
	public void setControlesDePausaODetencion(Boolean controlesDePausaODetencion) {
		this.controlesDePausaODetencion = controlesDePausaODetencion;
	}
	

	
}
