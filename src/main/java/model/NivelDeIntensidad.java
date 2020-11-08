package model;

public enum NivelDeIntensidad {
	
	porDebajoDeLosLimites,
	porEncimaDeLosLimites;
	
	public Boolean isa(NivelDeIntensidad nivelDeIntensidad) {
		
		return this.toString() == nivelDeIntensidad.toString();
		
	}

}
