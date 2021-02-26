package es.pildoras.spring.mvc;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Alumno {
	
	@NotNull
	@Size(min=2, message="Campo requerido")
	private String nombre;
	
	private String apellido;
	private String optativa;
	private String ciudadEstudio;
	private String idioma;
		public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getOptativa() {
		return optativa;
	}
	public void setOptativa(String optativa) {
		this.optativa = optativa;
	}
	public String getCiudadEstudio() {
		return ciudadEstudio;
	}
	public void setCiudadEstudio(String ciudadEstudio) {
		this.ciudadEstudio = ciudadEstudio;
	}
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
}
