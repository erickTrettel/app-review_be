package com.backend.projetofinal.SpringBootRestLastProject;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Review implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String review;
	private double nota;
	private int idAplicacao;
	private String descricaoAplicacao;
	private String usuarioId;
	private String usuarioNome;
	private String usuarioEmail;
	private String usuarioFoto;

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public String getReview() {
		return review;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public double getNota() {
		return nota;
	}

	public void setUsuarioFoto(String usuarioFoto) {
		this.usuarioFoto = usuarioFoto;
	}

	public String getUsuarioFoto() {
		return usuarioFoto;
	}

	public void setIdAplicacao(int idAplicacao) {
		this.idAplicacao = idAplicacao;
	}

	public int getIdAplicacao() {
		return idAplicacao;
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

	public String getDescricaoAplicacao() {
		return descricaoAplicacao;
	}

	public void setDescricaoAplicacao(String descricaoAplicacao) {
		this.descricaoAplicacao = descricaoAplicacao;
	}

}
