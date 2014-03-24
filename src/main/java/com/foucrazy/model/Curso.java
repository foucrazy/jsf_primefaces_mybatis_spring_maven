package com.foucrazy.model;

public class Curso {

	public Integer idCurso;
	public String titulo;
	public Integer horas;
	public Integer idNivel;
	public Integer idProfesor;
	public boolean activo;
	
	public Curso(){
		
	}
	
	public Curso(String titulo, Integer horas, Integer idNivel,
			Integer idProfesor, boolean activo) {
		super();
		this.titulo = titulo;
		this.horas = horas;
		this.idNivel = idNivel;
		this.idProfesor = idProfesor;
		this.activo = activo;
	}

	public Curso(Integer idCurso, String titulo, Integer horas,
			Integer idNivel, Integer idProfesor, boolean activo) {
		super();
		this.idCurso = idCurso;
		this.titulo = titulo;
		this.horas = horas;
		this.idNivel = idNivel;
		this.idProfesor = idProfesor;
		this.activo = activo;
	}
	
	
	
	public Integer getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(Integer idCurso) {
		this.idCurso = idCurso;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}

	public Integer getIdNivel() {
		return idNivel;
	}

	public void setIdNivel(Integer idNivel) {
		this.idNivel = idNivel;
	}

	public Integer getIdProfesor() {
		return idProfesor;
	}

	public void setIdProfesor(Integer idProfesor) {
		this.idProfesor = idProfesor;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	@Override
	public String toString() {
		return "Curso [idCurso=" + idCurso + ", titulo=" + titulo + ", horas="
				+ horas + ", idNivel=" + idNivel + ", idProfesor=" + idProfesor
				+ ", activo=" + activo + "]";
	}
	
}
