package model;

public class ContenidoConFlashes {
	
	Integer cantidadDeFlashes;
	NivelDeIntensidad nivelDeIntensidad;
	
	public ContenidoConFlashes(Integer cantidadDeFlashes, NivelDeIntensidad nivelDeIntensidad) {
		super();
		this.cantidadDeFlashes = cantidadDeFlashes;
		this.nivelDeIntensidad = nivelDeIntensidad;
	}
	
	public Integer getCantidadDeFlashes() {
		return cantidadDeFlashes;
	}
	public void setCantidadDeFlashes(Integer cantidadDeFlashes) {
		this.cantidadDeFlashes = cantidadDeFlashes;
	}
	public NivelDeIntensidad getNivelDeIntensidad() {
		return nivelDeIntensidad;
	}
	public void setNivelDeIntensidad(NivelDeIntensidad nivelDeIntensidad) {
		this.nivelDeIntensidad = nivelDeIntensidad;
	}

	
	
}
