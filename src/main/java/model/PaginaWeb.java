package model;

public class PaginaWeb {

	SoporteDeTeclado soporteDeTeclado;
	EventosPorTiempo eventosPorTiempo;
	ContenidoAutomatico contenidoAutomatico;
	Sesion sesion;
	Interrupciones interrupciones;
	ContenidoConFlashes contenidoConFlashes;
	ModalidadDeEntrada modalidadDeEntrada;
	Navegacion navegacion;
	DiagnosticoDeAccesibilidadOperativa diagnosticoDeAccesibilidadOperativa;

	public PaginaWeb(SoporteDeTeclado soporteDeTeclado, EventosPorTiempo eventosPorTiempo,
			ContenidoAutomatico contenidoAutomatico, Sesion sesion, Interrupciones interrupciones,
			ContenidoConFlashes contenidoConFlashes, ModalidadDeEntrada modalidadDeEntrada, Navegacion navegacion) {

		super();
		this.soporteDeTeclado = soporteDeTeclado;
		this.eventosPorTiempo = eventosPorTiempo;
		this.contenidoAutomatico = contenidoAutomatico;
		this.sesion = sesion;
		this.interrupciones = interrupciones;
		this.contenidoConFlashes = contenidoConFlashes;
		this.modalidadDeEntrada = modalidadDeEntrada;
		this.navegacion = navegacion;
		this.diagnosticoDeAccesibilidadOperativa = new DiagnosticoDeAccesibilidadOperativa();
	}
	
	public SoporteDeTeclado getSoporteDeTeclado() {
		return soporteDeTeclado;
	}
	public void setSoporteDeTeclado(SoporteDeTeclado soporteDeTeclado) {
		this.soporteDeTeclado = soporteDeTeclado;
	}
	public EventosPorTiempo getEventosPorTiempo() {
		return eventosPorTiempo;
	}
	public void setEventosPorTiempo(EventosPorTiempo eventosPorTiempo) {
		this.eventosPorTiempo = eventosPorTiempo;
	}
	public ContenidoAutomatico getContenidoAutomatico() {
		return contenidoAutomatico;
	}
	public void setContenidoAutomatico(ContenidoAutomatico contenidoAutomatico) {
		this.contenidoAutomatico = contenidoAutomatico;
	}
	public Sesion getSesion() {
		return sesion;
	}
	public void setSesion(Sesion sesion) {
		this.sesion = sesion;
	}
	public Interrupciones getInterrupciones() {
		return interrupciones;
	}
	public void setInterrupciones(Interrupciones interrupciones) {
		this.interrupciones = interrupciones;
	}
	public ContenidoConFlashes getContenidoConFlashes() {
		return contenidoConFlashes;
	}
	public void setContenidoConFlashes(ContenidoConFlashes contenidoConFlashes) {
		this.contenidoConFlashes = contenidoConFlashes;
	}
	public ModalidadDeEntrada getModalidadDeEntrada() {
		return modalidadDeEntrada;
	}
	public void setModalidadDeEntrada(ModalidadDeEntrada modalidadDeEntrada) {
		this.modalidadDeEntrada = modalidadDeEntrada;
	}
	public Navegacion getNavegacion() {
		return navegacion;
	}
	public void setNavegacion(Navegacion navegacion) {
		this.navegacion = navegacion;
	}
	public DiagnosticoDeAccesibilidadOperativa getDiagnosticoDeAccesibilidadOperativa() {
		return diagnosticoDeAccesibilidadOperativa;
	}
	public void setDiagnosticoDeAccesibilidadOperativa(
			DiagnosticoDeAccesibilidadOperativa diagnosticoDeAccesibilidadOperativa) {
		this.diagnosticoDeAccesibilidadOperativa = diagnosticoDeAccesibilidadOperativa;
	}

	public void setDiagnosticoContenidoAutomatico(Accesibilidad accesiblidad) {
		this.diagnosticoDeAccesibilidadOperativa.setDiagnosticoContenidoAutomatico(accesiblidad);
	}
	
	public void setDiagnosticoContenidoConFlashes(Accesibilidad accesiblidad) {
		this.diagnosticoDeAccesibilidadOperativa.setDiagnosticoContenidoConFlashes(accesiblidad);
	}
	
	public void setDiagnosticoEventosPorTiempo(Accesibilidad accesiblidad) {
		this.diagnosticoDeAccesibilidadOperativa.setDiagnosticoEventosPorTiempo(accesiblidad);
	}
	
	public void setCumplimientoPautasNivelA(Cumplimiento cumplimiento) {
		this.diagnosticoDeAccesibilidadOperativa.setPautasNivelA(cumplimiento);
	}
	
	public void setCumplimientoPautasNivelAA(Cumplimiento cumplimiento) {
		this.diagnosticoDeAccesibilidadOperativa.setPautasNivelAA(cumplimiento);
	}
	
	public void setCumplimientoPautasNivelAAA(Cumplimiento cumplimiento) {
		this.diagnosticoDeAccesibilidadOperativa.setPautasNivelAAA(cumplimiento);
	}
	
	public void setDiagnosticoFinal(String diag) {
		this.diagnosticoDeAccesibilidadOperativa.setDiagnosticoFinal(diag);
	}
	
	public boolean isContenidoAutomaticoAccesible() {
		return this.diagnosticoDeAccesibilidadOperativa.diagnosticoContenidoAutomatico.isa(Accesibilidad.accesible);
	}
	
	public boolean isContenidoContenidoConFlashesAccesible() {
		return this.diagnosticoDeAccesibilidadOperativa.diagnosticoContenidoConFlashes.isa(Accesibilidad.accesible);
	}
	
	public boolean isEventosPorTiempoAccesible() {
		return this.diagnosticoDeAccesibilidadOperativa.diagnosticoEventosPorTiempo.isa(Accesibilidad.accesible);
	}
	
	
	
}
