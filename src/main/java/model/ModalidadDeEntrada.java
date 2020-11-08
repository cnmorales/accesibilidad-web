package model;

public class ModalidadDeEntrada {
	
	Boolean unicoPuntero;
	Integer tamañoEnPx;

	public ModalidadDeEntrada(Boolean unicoPuntero, Integer tamañoEnPx) {
		super();
		this.unicoPuntero = unicoPuntero;
		this.tamañoEnPx = tamañoEnPx;
	}
	
	public Boolean getUnicoPuntero() {
		return unicoPuntero;
	}
	public void setUnicoPuntero(Boolean unicoPuntero) {
		this.unicoPuntero = unicoPuntero;
	}
	public Integer getTamañoEnPx() {
		return tamañoEnPx;
	}
	public void setTamañoEnPx(Integer tamañoEnPx) {
		this.tamañoEnPx = tamañoEnPx;
	}
	
	
	
	

}
