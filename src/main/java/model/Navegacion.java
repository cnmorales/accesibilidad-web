package model;

public class Navegacion {

	Boolean titulos;
	Boolean botonesEnlaces;
	Boolean etiquetasDescriptivas;
	Boolean indicadorDeFoco;
	Localizacion localizacion;
	
	public Navegacion(Boolean titulos, Boolean botonesEnlaces, Boolean etiquetasDescriptivas, Boolean indicadorDeFoco,
			Localizacion localizacion) {
		super();
		this.titulos = titulos;
		this.botonesEnlaces = botonesEnlaces;
		this.etiquetasDescriptivas = etiquetasDescriptivas;
		this.indicadorDeFoco = indicadorDeFoco;
		this.localizacion = localizacion;
	}
	
	public Boolean getTitulos() {
		return titulos;
	}
	public void setTitulos(Boolean titulos) {
		this.titulos = titulos;
	}
	public Boolean getBotonesEnlaces() {
		return botonesEnlaces;
	}
	public void setBotonesEnlaces(Boolean botonesEnlaces) {
		this.botonesEnlaces = botonesEnlaces;
	}
	public Boolean getEtiquetasDescriptivas() {
		return etiquetasDescriptivas;
	}
	public void setEtiquetasDescriptivas(Boolean etiquetasDescriptivas) {
		this.etiquetasDescriptivas = etiquetasDescriptivas;
	}
	public Boolean getIndicadorDeFoco() {
		return indicadorDeFoco;
	}
	public void setIndicadorDeFoco(Boolean indicadorDeFoco) {
		this.indicadorDeFoco = indicadorDeFoco;
	}
	public Localizacion getLocalizacion() {
		return localizacion;
	}
	public void setLocalizacion(Localizacion localizacion) {
		this.localizacion = localizacion;
	}
	
	
	
}
