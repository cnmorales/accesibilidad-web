package model;

public class Sesion {
	
	Boolean mecanismoDeReAutenticacion;
	Boolean mecanismoSinPerdidaDeInformacion;
	Boolean alertasPorInactividad;
	
	public Sesion(Boolean mecanismoDeReAutenticacion, Boolean mecanismoSinPerdidaDeInformacion,
			Boolean alertasPorInactividad) {
		super();
		this.mecanismoDeReAutenticacion = mecanismoDeReAutenticacion;
		this.mecanismoSinPerdidaDeInformacion = mecanismoSinPerdidaDeInformacion;
		this.alertasPorInactividad = alertasPorInactividad;
	}
	
	public Boolean getMecanismoDeReAutenticacion() {
		return mecanismoDeReAutenticacion;
	}
	public void setMecanismoDeReAutenticacion(Boolean mecanismoDeReAutenticacion) {
		this.mecanismoDeReAutenticacion = mecanismoDeReAutenticacion;
	}
	public Boolean getMecanismoSinPerdidaDeInformacion() {
		return mecanismoSinPerdidaDeInformacion;
	}
	public void setMecanismoSinPerdidaDeInformacion(Boolean mecanismoSinPerdidaDeInformacion) {
		this.mecanismoSinPerdidaDeInformacion = mecanismoSinPerdidaDeInformacion;
	}
	public Boolean getAlertasPorInactividad() {
		return alertasPorInactividad;
	}
	public void setAlertasPorInactividad(Boolean alertasPorInactividad) {
		this.alertasPorInactividad = alertasPorInactividad;
	}
	
	

}
