package model;

public enum Localizacion {

	siteMap,
	breadcrumb,
	navBar;

	public Boolean isa(Localizacion localizacion) {

		return this.toString() == localizacion.toString();

	}

}
