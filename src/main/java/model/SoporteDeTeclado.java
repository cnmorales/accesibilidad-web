package model;

public class SoporteDeTeclado {

	boolean mecanismoAntiTrampa;
	boolean shortcuts;
	int coberturaDeNavegacion;
	
	public SoporteDeTeclado(boolean mecanismoAntiTrampa, boolean shortcuts, int coberturaDeNavegacion) {
		super();
		this.mecanismoAntiTrampa = mecanismoAntiTrampa;
		this.shortcuts = shortcuts;
		this.coberturaDeNavegacion = coberturaDeNavegacion;
	}
	
	public boolean isMecanismoAntiTrampa() {
		return mecanismoAntiTrampa;
	}
	public void setMecanismoAntiTrampa(boolean mecanismoAntiTrampa) {
		this.mecanismoAntiTrampa = mecanismoAntiTrampa;
	}
	public boolean isShortcuts() {
		return shortcuts;
	}
	public void setShortcuts(boolean shortcuts) {
		this.shortcuts = shortcuts;
	}
	public int getCoberturaDeNavegacion() {
		return coberturaDeNavegacion;
	}
	public void setCoberturaDeNavegacion(int coberturaDeNavegacion) {
		this.coberturaDeNavegacion = coberturaDeNavegacion;
	}
	
	
	
}
