package foward;

import static utils.TestCaseUtils.assertResults;
import static utils.TestCaseUtils.print;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.kie.api.event.rule.ObjectDeletedEvent;
import org.kie.api.event.rule.ObjectInsertedEvent;
import org.kie.api.event.rule.ObjectUpdatedEvent;
import org.kie.api.event.rule.RuleRuntimeEventListener;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.FactHandle;

import model.Configurable;
import model.ContenidoAutomatico;
import model.ContenidoConFlashes;
import model.DiagnosticoDeAccesibilidadOperativa;
import model.EventosPorTiempo;
import model.Interrupciones;
import model.Localizacion;
import model.ModalidadDeEntrada;
import model.Navegacion;
import model.NivelDeIntensidad;
import model.PaginaWeb;
import model.Sesion;
import model.SoporteDeTeclado;
import utils.KnowledgeSessionHelper;

public class ForwardTestCases {

	// Buscar archivo kmodule.xml. El nombre de la sesion debe ser igual al
	// configurado en ese archivo
	String K_SESSION_NAME = "kforward-chaining-session";

	KieSession sessionStatefull;
	static KieContainer kieContainer;

	FactHandle automovilDir;
	
	public ForwardTestCases() {
	}
		
	@BeforeClass
	public static void beforeallTestSetup() {
		kieContainer = KnowledgeSessionHelper.createRuleBase();
	}

	private void prepareKnowledgeSession() {
		sessionStatefull = KnowledgeSessionHelper.getStatefulKnowledgeSession(kieContainer, K_SESSION_NAME);
	}
	
	@Before
	public void setUp() {
		print("----------Start----------");
		print();
		this.prepareKnowledgeSession(); // Inicializa una nueva base de hechos
	}

	@After
	public void tearDown() {
		print();
		print("----------End----------");
		print();
	}
	
	@Test
	public void accesibilidadOperativaAAATest() {
		print("Caso de prueba 1: Nivel de accesibilidad en sitio AAA");
		
		SoporteDeTeclado soporteDeTeclado = new SoporteDeTeclado(true,true,100);
		EventosPorTiempo eventosPorTiempo = new EventosPorTiempo(false, Configurable.permite);
		ContenidoAutomatico contenidoAutomatico = new ContenidoAutomatico(new Double(10), true, true);
		Sesion sesion = new Sesion(true, true, true);
		Interrupciones interrupciones = new Interrupciones(true);
		ContenidoConFlashes contenidoConFlashes = new ContenidoConFlashes(0, NivelDeIntensidad.porDebajoDeLosLimites);
		ModalidadDeEntrada modalidadDeEntrada = new ModalidadDeEntrada(true, 60);
		Navegacion navegacion = new Navegacion(true, true, true, true, Localizacion.navBar);
		
		PaginaWeb paginaWeb = new PaginaWeb(soporteDeTeclado, eventosPorTiempo, contenidoAutomatico, sesion, interrupciones, contenidoConFlashes, modalidadDeEntrada, navegacion);
		
		print(paginaWeb);
		
		//FactHandle paginaWebDir = sessionStatefull.insert(paginaWeb);
		sessionStatefull.insert(paginaWeb);
		sessionStatefull.fireAllRules();
		sessionStatefull.dispose();
		//paginaWeb = (PaginaWeb) sessionStatefull.getObject(paginaWebDir);
		
		DiagnosticoDeAccesibilidadOperativa diagnostico = paginaWeb.getDiagnosticoDeAccesibilidadOperativa();
		assertResults(diagnostico, "AAA");
	}

	@Test
	public void accesibilidadOperativaAATest() {
		print("Caso de prueba 2: Nivel de accesibilidad en sitio AA");
		
		SoporteDeTeclado soporteDeTeclado = new SoporteDeTeclado(true,true,80);
		EventosPorTiempo eventosPorTiempo = new EventosPorTiempo(false, Configurable.permite);
		ContenidoAutomatico contenidoAutomatico = new ContenidoAutomatico(new Double(3), false, true);
		Sesion sesion = new Sesion(true, true, true);
		Interrupciones interrupciones = new Interrupciones(true);
		ContenidoConFlashes contenidoConFlashes = new ContenidoConFlashes(2, NivelDeIntensidad.porDebajoDeLosLimites);
		ModalidadDeEntrada modalidadDeEntrada = new ModalidadDeEntrada(true, 60);
		Navegacion navegacion = new Navegacion(true, true, true, true, Localizacion.breadcrumb);
		PaginaWeb paginaWeb = new PaginaWeb(soporteDeTeclado, eventosPorTiempo, contenidoAutomatico, sesion, interrupciones, contenidoConFlashes, modalidadDeEntrada, navegacion);
		
		print(paginaWeb);
		
		sessionStatefull.insert(paginaWeb);
		sessionStatefull.fireAllRules();
		sessionStatefull.dispose();
		
		DiagnosticoDeAccesibilidadOperativa diagnostico = paginaWeb.getDiagnosticoDeAccesibilidadOperativa();
		assertResults(diagnostico, "AA");
	}
	
	@Test
	public void accesibilidadOperativaATest() {
		print("Caso de prueba 3: Nivel de accesibilidad en sitio A");
		
		SoporteDeTeclado soporteDeTeclado = new SoporteDeTeclado(true,true,80);
		EventosPorTiempo eventosPorTiempo = new EventosPorTiempo(true, Configurable.noPermite);
		ContenidoAutomatico contenidoAutomatico = new ContenidoAutomatico(new Double(3), false, true);
		Sesion sesion = new Sesion(true, true, true);
		Interrupciones interrupciones = new Interrupciones(true);
		ContenidoConFlashes contenidoConFlashes = new ContenidoConFlashes(2, NivelDeIntensidad.porDebajoDeLosLimites);
		ModalidadDeEntrada modalidadDeEntrada = new ModalidadDeEntrada(true, 60);
		Navegacion navegacion = new Navegacion(true, true, true, false, Localizacion.breadcrumb);
		PaginaWeb paginaWeb = new PaginaWeb(soporteDeTeclado, eventosPorTiempo, contenidoAutomatico, sesion, interrupciones, contenidoConFlashes, modalidadDeEntrada, navegacion);
		
		print(paginaWeb);
		
		sessionStatefull.insert(paginaWeb);
		sessionStatefull.fireAllRules();
		sessionStatefull.dispose();
		
		DiagnosticoDeAccesibilidadOperativa diagnostico = paginaWeb.getDiagnosticoDeAccesibilidadOperativa();
		assertResults(diagnostico, "A");
	}
	
	@Test
	public void accesibilidadOperativaNoCumpleTest() {
		print("Caso de prueba 4: Sitio no alcanza nivel de accesibilidad minimo");
		
		SoporteDeTeclado soporteDeTeclado = new SoporteDeTeclado(false,false,30);
		EventosPorTiempo eventosPorTiempo = new EventosPorTiempo(false, Configurable.noPermite);
		ContenidoAutomatico contenidoAutomatico = new ContenidoAutomatico(new Double(3), false, true);
		Sesion sesion = new Sesion(true, true, true);
		Interrupciones interrupciones = new Interrupciones(true);
		ContenidoConFlashes contenidoConFlashes = new ContenidoConFlashes(6, NivelDeIntensidad.porEncimaDeLosLimites);
		ModalidadDeEntrada modalidadDeEntrada = new ModalidadDeEntrada(true, 60);
		Navegacion navegacion = new Navegacion(false, true, false, false, Localizacion.breadcrumb);
		PaginaWeb paginaWeb = new PaginaWeb(soporteDeTeclado, eventosPorTiempo, contenidoAutomatico, sesion, interrupciones, contenidoConFlashes, modalidadDeEntrada, navegacion);
		
		print(paginaWeb);
		
		sessionStatefull.insert(paginaWeb);
		sessionStatefull.fireAllRules();
		sessionStatefull.dispose();
		
		DiagnosticoDeAccesibilidadOperativa diagnostico = paginaWeb.getDiagnosticoDeAccesibilidadOperativa();
		assertResults(diagnostico, "NO CUMPLE");
	}
	
	@Test
	public void accesibilidadOperativaATest2() {
		print("Caso de prueba 5: Nivel de accesibilidad en sitio (A Variante flashes)");
		
		SoporteDeTeclado soporteDeTeclado = new SoporteDeTeclado(true,true,90);
		EventosPorTiempo eventosPorTiempo = new EventosPorTiempo(true, Configurable.noPermite);
		ContenidoAutomatico contenidoAutomatico = new ContenidoAutomatico(new Double(3), true, true);
		Sesion sesion = new Sesion(true, true, true);
		Interrupciones interrupciones = new Interrupciones(true);
		ContenidoConFlashes contenidoConFlashes = new ContenidoConFlashes(1, NivelDeIntensidad.porEncimaDeLosLimites);
		ModalidadDeEntrada modalidadDeEntrada = new ModalidadDeEntrada(true, 60);
		Navegacion navegacion = new Navegacion(true, true, true, false, Localizacion.siteMap);
		PaginaWeb paginaWeb = new PaginaWeb(soporteDeTeclado, eventosPorTiempo, contenidoAutomatico, sesion, interrupciones, contenidoConFlashes, modalidadDeEntrada, navegacion);
		
		print(paginaWeb);
		
		sessionStatefull.insert(paginaWeb);
		sessionStatefull.fireAllRules();
		sessionStatefull.dispose();
		
		DiagnosticoDeAccesibilidadOperativa diagnostico = paginaWeb.getDiagnosticoDeAccesibilidadOperativa();
		assertResults(diagnostico, "A");
	}
	

	private RuleRuntimeEventListener buildEventListener() {
		return new RuleRuntimeEventListener() {
			@Override
			public void objectUpdated(ObjectUpdatedEvent event) {
			
				System.out.println("Object updated \n" + event.getObject().toString());
			}

			@Override
			public void objectInserted(ObjectInsertedEvent event) {
				System.out.println("Object inserted \n" + event.getObject().toString());
			}

			@Override
			public void objectDeleted(ObjectDeletedEvent event) {
				System.out.println("Object deleted \n" + event.getOldObject().toString());
			}
		};
	}
}
