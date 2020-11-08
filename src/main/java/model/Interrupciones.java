package model;

public class Interrupciones {
	
	Boolean controlDePausado;
	
	public Interrupciones(Boolean controlDePausado) {
		super();
		this.controlDePausado = controlDePausado;
	}

	public Boolean getControlDePausado() {
		return controlDePausado;
	}

	public void setControlDePausado(Boolean controlDePausado) {
		this.controlDePausado = controlDePausado;
	}
}
