package model;

public class DiagnosticoDeAccesibilidadOperativa {

	Cumplimiento pautasNivelA;
	Cumplimiento pautasNivelAA;
	Cumplimiento pautasNivelAAA;
	Accesibilidad diagnosticoContenidoAutomatico;
	Accesibilidad diagnosticoContenidoConFlashes;
	Accesibilidad diagnosticoEventosPorTiempo;
	String diagnosticoFinal;
	
	public DiagnosticoDeAccesibilidadOperativa() {
		super();
		this.pautasNivelA = Cumplimiento.noCumple;
		this.pautasNivelAA = Cumplimiento.noCumple;
		this.pautasNivelAAA = Cumplimiento.noCumple;
		this.diagnosticoContenidoAutomatico = Accesibilidad.noAccesible;
		this.diagnosticoContenidoConFlashes = Accesibilidad.noAccesible;
		this.diagnosticoEventosPorTiempo = Accesibilidad.noAccesible;
		this.diagnosticoFinal = "NO CUMPLE"; //A, AA, AAA, NO CUMPLE
	}

	public Cumplimiento getPautasNivelA() {
		return pautasNivelA;
	}

	public void setPautasNivelA(Cumplimiento pautasNivelA) {
		this.pautasNivelA = pautasNivelA;
	}

	public Cumplimiento getPautasNivelAA() {
		return pautasNivelAA;
	}

	public void setPautasNivelAA(Cumplimiento pautasNivelAA) {
		this.pautasNivelAA = pautasNivelAA;
	}

	public Cumplimiento getPautasNivelAAA() {
		return pautasNivelAAA;
	}

	public void setPautasNivelAAA(Cumplimiento pautasNivelAAA) {
		this.pautasNivelAAA = pautasNivelAAA;
	}

	public Accesibilidad getDiagnosticoContenidoAutomatico() {
		return diagnosticoContenidoAutomatico;
	}

	public void setDiagnosticoContenidoAutomatico(Accesibilidad diagnosticoContenidoAutomatico) {
		this.diagnosticoContenidoAutomatico = diagnosticoContenidoAutomatico;
	}

	public Accesibilidad getDiagnosticoContenidoConFlashes() {
		return diagnosticoContenidoConFlashes;
	}

	public void setDiagnosticoContenidoConFlashes(Accesibilidad diagnosticoContenidoConFlashes) {
		this.diagnosticoContenidoConFlashes = diagnosticoContenidoConFlashes;
	}

	public Accesibilidad getDiagnosticoEventosPorTiempo() {
		return diagnosticoEventosPorTiempo;
	}

	public void setDiagnosticoEventosPorTiempo(Accesibilidad diagnosticoEventosPorTiempo) {
		this.diagnosticoEventosPorTiempo = diagnosticoEventosPorTiempo;
	}

	public String getDiagnosticoFinal() {
		return diagnosticoFinal;
	}

	public void setDiagnosticoFinal(String diagnosticoFinal) {
		this.diagnosticoFinal = diagnosticoFinal;
	}


	

	
}
