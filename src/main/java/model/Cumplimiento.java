package model;

public enum Cumplimiento {

	cumple,
	noCumple;

	public Boolean isa(Cumplimiento cumplimiento) {

		return this.toString() == cumplimiento.toString();

	}

}
