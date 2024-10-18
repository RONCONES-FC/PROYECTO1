package Path;

import java.util.Date;

public class Actividad {

	private String descripcion;
    private String objetivo;
    private String nivel;
    private int tiempoEstimado;
    private boolean obligatorio;
    private Date fechaLimite;
    private String tipo;
    private boolean resultado;
    private int tiempoDedicado;
    
    public Actividad(String descripcion, String objetivo, String nivel, int tiempoEstimado, boolean obligatorio, Date fechaLimite, String tipo) {
        this.descripcion = descripcion;
        this.objetivo = objetivo;
        this.nivel = nivel;
        this.tiempoEstimado = tiempoEstimado;
        this.obligatorio = obligatorio;
        this.fechaLimite = fechaLimite;
        this.tipo = tipo;
        this.resultado = false; 
        this.tiempoDedicado = 0;
    }
}
