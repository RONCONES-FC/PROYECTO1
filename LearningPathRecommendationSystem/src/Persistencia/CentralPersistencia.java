package Persistencia;

public class CentralPersistencia {
	
	public static final String JSON = "JSON";
    public static final String PLAIN = "PlainText";

    
    public static IPersistenciaUsuario getPersistenciaUsuario(String tipoArchivo) {
        if (JSON.equals(tipoArchivo)) {
            return new PersistenciaUsuarioJson();
        } else if (PLAIN.equals(tipoArchivo)) {
            return new PersistenciaUsuarioPlaintext();
        } else {
            throw new IllegalArgumentException("Tipo de archivo no soportado: " + tipoArchivo);
        }
    }
    
}
