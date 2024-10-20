package Path;

import java.util.List;

public class Examen {
	
	private final String tipo = "Examen";
    private boolean aprobado;
    private List<PreguntaAbierta> preguntas;
    
    
	public Examen(boolean aprobado, List<PreguntaAbierta> preguntas) {
		super();
		this.aprobado = aprobado;
		this.preguntas = preguntas;
	}


	public boolean isAprobado() {
		return aprobado;
	}


	public void setAprobado(boolean aprobado) {
		this.aprobado = aprobado;
	}


	public List<PreguntaAbierta> getPreguntas() {
		return preguntas;
	}


	public void setPreguntas(List<PreguntaAbierta> preguntas) {
		this.preguntas = preguntas;
	}


	public String getTipo() {
		return tipo;
	}
    
	
	
    

}
