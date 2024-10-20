package Path;

import java.util.List;

public class Quiz {
	
	private final String tipo = "Quiz";
    private int calificacionMinima;
    private boolean esSatisfactorio;
    private int puntos;
    private List<PreguntaCerrada> preguntas;
    
    
	public Quiz(int calificacionMinima, boolean esSatisfactorio, int puntos, List<PreguntaCerrada> preguntas) {
		super();
		this.calificacionMinima = calificacionMinima;
		this.esSatisfactorio = esSatisfactorio;
		this.puntos = puntos;
		this.preguntas = preguntas;
	}


	public int getCalificacionMinima() {
		return calificacionMinima;
	}


	public void setCalificacionMinima(int calificacionMinima) {
		this.calificacionMinima = calificacionMinima;
	}


	public boolean isEsSatisfactorio() {
		return esSatisfactorio;
	}


	public void setEsSatisfactorio(boolean esSatisfactorio) {
		this.esSatisfactorio = esSatisfactorio;
	}


	public int getPuntos() {
		return puntos;
	}


	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}


	public List<PreguntaCerrada> getPreguntas() {
		return preguntas;
	}


	public void setPreguntas(List<PreguntaCerrada> preguntas) {
		this.preguntas = preguntas;
	}


	public String getTipo() {
		return tipo;
	}
	
	
	
    
    
    
}
