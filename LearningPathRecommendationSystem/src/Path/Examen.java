package Path;

import java.util.List;

public class Examen {
	
	private final String tipo = "Examen";
    private List<PreguntaAbierta> preguntas;
    
    
	public Examen(boolean aprobado, List<PreguntaAbierta> preguntas) {
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
