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
	
	@Override
	public String toString() {
		return "Curso [idCurso=" + idCurso + ", titulo=" + titulo + ", horas="
				+ horas + ", idNivel=" + idNivel + ", idProfesor=" + idProfesor
				+ ", activo=" + activo + "]";
	}
	
}
