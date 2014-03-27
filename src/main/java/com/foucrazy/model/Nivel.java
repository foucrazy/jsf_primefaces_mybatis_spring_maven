package com.foucrazy.model;

public class Nivel {

	private Integer idNivel;
	private String valor;
	
	public Nivel() {
		super();
	}

	public Nivel(Integer idNivel) {
		super();
		this.idNivel = idNivel;
	}

	public Integer getIdNivel() {
		return idNivel;
	}

	public void setIdNivel(Integer idNivel) {
		this.idNivel = idNivel;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Nivel [idNivel=" + idNivel + ", valor=" + valor + "]";
	}

}
