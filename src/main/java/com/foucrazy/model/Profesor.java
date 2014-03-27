package com.foucrazy.model;

public class Profesor {

	private Integer idProfesor;
	private String nombre;
	
	public Profesor() {
		super();
	}

	public Profesor(Integer idProfesor) {
		super();
		this.idProfesor = idProfesor;
	}

	public Integer getIdProfesor() {
		return idProfesor;
	}

	public void setIdProfesor(Integer idProfesor) {
		this.idProfesor = idProfesor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Profesor [idProfesor=" + idProfesor + ", nombre=" + nombre
				+ "]";
	}

}
