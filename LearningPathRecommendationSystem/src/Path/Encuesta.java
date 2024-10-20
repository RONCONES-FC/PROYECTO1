package Path;

import java.util.List;

public class Encuesta {
	
	private final String tipo = "Encuesta";
    private List<PreguntaAbierta> preguntas;
    
	public Encuesta(List<PreguntaAbierta> preguntas) {
		super();
		this.preguntas = preguntas;
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
