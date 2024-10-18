package Path;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LearningPath {

	private String titulo;
    private int duracionEnMinutos;
    private String descripcion;
    private String nivelDeDificultad;
    private Date fechaDeModificacion;
    private String version;
    private List<Actividad> actividades;

    public LearningPath(String titulo, int duracionEnMinutos, String descripcion, String nivelDeDificultad, Date fechaDeModificacion, String version) {
        this.titulo = titulo;
        this.duracionEnMinutos = duracionEnMinutos;
        this.descripcion = descripcion;
        this.nivelDeDificultad = nivelDeDificultad;
        this.fechaDeModificacion = fechaDeModificacion;
        this.version = version;
        this.actividades = new ArrayList<>();
    }


}
