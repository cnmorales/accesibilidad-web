package model;

public class EventosPorTiempo {

	public boolean botonApagado;
	Configurable configurable;
	
	public EventosPorTiempo(boolean botonApagado, Configurable configurable) {
		super();
		this.botonApagado = botonApagado;
		this.configurable = configurable;
	}
	
	public boolean isBotonApagado() {
		return botonApagado;
	}
	public void setBotonApagado(boolean botonApagado) {
		this.botonApagado = botonApagado;
	}
	public Configurable getConfigurable() {
		return configurable;
	}
	public void setConfigurable(Configurable configurable) {
		this.configurable = configurable;
	}
	
	
	
}
