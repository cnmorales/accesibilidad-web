package model;

public enum Accesibilidad {

	accesible,
	noAccesible;

	public Boolean isa(Accesibilidad accesibilidad) {
		return this.toString() == accesibilidad.toString();
	}

}
