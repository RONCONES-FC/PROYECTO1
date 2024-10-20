package Usuario;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Path.Actividad;
import Path.LearningPath;
import Path.Progreso;
import Retroalimentacion.Rating;
import Retroalimentacion.Resena;

public class Profesor extends Usuario {
	private List<Actividad> actividadesCreadas;
    private List<LearningPath> learningPathsCreados;
    
	public Profesor(String usuario, String contrasena, List<Actividad> actividadesCreadas, List<LearningPath> learningPathsCreados) {
		super(usuario, contrasena);
		this.actividadesCreadas = actividadesCreadas;
		this.learningPathsCreados = learningPathsCreados;
	}

	public List<Actividad> getActividadesCreadas() {
		return actividadesCreadas;
	}

	public void setActividadesCreadas(List<Actividad> actividadesCreadas) {
		this.actividadesCreadas = actividadesCreadas;
	}

	public List<LearningPath> getLearningPathsCreados() {
		return learningPathsCreados;
	}

	public void setLearningPathsCreados(List<LearningPath> learningPathsCreados) {
		this.learningPathsCreados = learningPathsCreados;
	}
	
	public LearningPath crearLearningPath(String titulo, int duracionEnMinutos, String descripcion, String nivelDeDificultad,
            String version, Date ultimaFechaDeModificacion, Progreso progreso, 
            List<Actividad> actividades, Date fechaDeCreacion, List<Rating> ratings, 
            double ratingPromedio) {
		
		LearningPath path = new LearningPath(titulo, duracionEnMinutos, descripcion, nivelDeDificultad, version, 
		               ultimaFechaDeModificacion, progreso, actividades, fechaDeCreacion, 
		               ratings, ratingPromedio);
		learningPathsCreados.add(path);
		return path;
		}
	
	public void modificarLearningPath(LearningPath path) {
        // implementar
    }
	
	public Actividad crearActividad(String descripcion, String objetivo, String nivel, int tiempo, boolean obligatorio, Date fechaLimite, String tipo) {
		//checkear parametros del constructor de actividad
        Actividad actividad = new Actividad();
        actividadesCreadas.add(actividad);
        return actividad;
    }
	
	public Progreso verProgresoEstudiante(Estudiante estudiante, LearningPath path) {
        return estudiante.verProgreso(path);
    }

	public Actividad clonarActividad(Actividad actividad) {
		//checkear parametros del constructor de actividad
	    Actividad copia = new Actividad();
	    
	    copia.setDescripcion(actividad.getDescripcion());
	    copia.setObjetivo(actividad.getObjetivo());
	    copia.setNivel(actividad.getNivel());
	    copia.setTiempoEstimado(actividad.getTiempoEstimado());
	    copia.setObligatorio(actividad.isObligatorio());
	    copia.setFechaLimite(actividad.getFechaLimite());
	    copia.setTipo(actividad.getTipo());
	    copia.setFechaLimite(actividad.getFechaLimite());
	    copia.setResultado(actividad.isResultado());
	    copia.setTiempoDedicado(actividad.getTiempoDedicado());
	    
	    copia.setRatings(new ArrayList<>(actividad.getRatings()));
	    copia.setResenas(new ArrayList<>(actividad.getResenas()));
	    
	    copia.setEstado(actividad.getEstado());
	    copia.setActividadesPrevias(new ArrayList<>(actividad.getActividadesPrevias()));

	    return copia;
	}
	
	public void agregarActividad(Actividad actividad) {
        // implementar
    }

    public void reordenarActividad(Actividad actividadPorCambiar) {
        // implementar
    }
    
    public void reordenarPath(LearningPath path, Actividad actividadPorCambiar) {
        //implementar
    }
    
    public void revisarActividad(Actividad actividad) {
       //implementar
    }
    
    public List<Resena> verResenas(Actividad actividad) {
        return actividad.getResenas(); 
    }

    
}
