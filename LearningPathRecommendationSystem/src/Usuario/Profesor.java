package Usuario;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Path.Actividad;
import Path.LearningPath;

public class Profesor {
	private List<Actividad> actividadesCreadas;
    private List<LearningPath> learningPathsCreados;
    
    public Profesor() {
        this.actividadesCreadas = new ArrayList<>();
        this.learningPathsCreados = new ArrayList<>();
    }
    
    public LearningPath crearLearningPath(String titulo, int duracion, String descripcion, String nivel, Date fecha, String version) {
        LearningPath newPath = new LearningPath(titulo, duracion, descripcion, nivel, fecha, version);
		return newPath;
}
}
