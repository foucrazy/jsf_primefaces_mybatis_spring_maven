package com.foucrazy.model;

public class Curso{
	
	private Integer idCurso;
	private String titulo;
	private Integer horas;
	private Nivel nivel;
	private Profesor profesor;
	private boolean activo;
	private String documento;
	public Curso(){
		
	}	
	

	public Curso(String titulo, Integer horas, Nivel nivel, Profesor profesor,
			boolean activo, String documento) {
		super();
		this.titulo = titulo;
		this.horas = horas;
		this.nivel = nivel;
		this.profesor = profesor;
		this.activo = activo;
		this.documento = documento;
	}


	public String getDocumento() {
		return documento;
	}


	public void setDocumento(String documento) {
		this.documento = documento;
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

	public Nivel getNivel() {
		return nivel;
	}

	public void setNivel(Nivel nivel) {
		this.nivel = nivel;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
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
				+ horas + ", nivel=" + nivel + ", profesor=" + profesor
				+ ", activo=" + activo + ", documento=" + documento + "]";
	}
	
}
