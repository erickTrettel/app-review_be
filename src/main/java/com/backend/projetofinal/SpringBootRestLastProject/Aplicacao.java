package com.backend.projetofinal.SpringBootRestLastProject;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Aplicacao implements Serializable  {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String descricao;
	private String categoria;
	private String usuarioId;
	private String usuarioNome;
	private String usuarioEmail;

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setUsuarioId(String usuarioId) {
		this.usuarioId = usuarioId;
	}

	public String getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioNome(String usuarioNome) {
		this.usuarioNome = usuarioNome;
	}

	public String getUsuarioNome() {
		return usuarioNome;
	}

	public void setUsuarioEmail(String usuarioEmail) {
		this.usuarioEmail = usuarioEmail;
	}

	public String getUsuarioEmail() {
		return usuarioEmail;
	}
	
	@Override
	public String toString() {
	return "Empregado [id=" + id + ", descricao=" + descricao + ", categoria=" 
	+ categoria + ",usuarioId=" + usuarioId + ", usuarioNome=" + usuarioNome + ",usuarioEmail="+usuarioEmail+"]";
	}

}
