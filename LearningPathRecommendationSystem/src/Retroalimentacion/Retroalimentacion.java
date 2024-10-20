package Retroalimentacion;

import java.util.Date;

public class Retroalimentacion {

	 protected String usuario;
	 protected String rol;
	 protected Date fechaDeCreacion;
	 
	 
	public Retroalimentacion(String usuario, String rol, Date fechaDeCreacion) {
		super();
		this.usuario = usuario;
		this.rol = rol;
		this.fechaDeCreacion = fechaDeCreacion;
	}


	public String getUsuario() {
		return usuario;
	}


	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}


	public String getRol() {
		return rol;
	}


	public void setRol(String rol) {
		this.rol = rol;
	}


	public Date getFechaDeCreacion() {
		return fechaDeCreacion;
	}


	public void setFechaDeCreacion(Date fechaDeCreacion) {
		this.fechaDeCreacion = fechaDeCreacion;
	}
	
	
	 
	 
}
