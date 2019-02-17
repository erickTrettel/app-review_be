package com.backend.projetofinal.SpringBootRestLastProject;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AplicacaoService {
	@Autowired
	private AplicacaoRepositorio rep;

	public Aplicacao getAplicacaoById(int id) {
		Aplicacao e = null;
		try {
			e = rep.findById(id).get();
		} catch (Exception exp) {
			System.out.println(exp);
		}
		return e;
	}

	public List<Aplicacao> getAllAplicacaos() {
		List<Aplicacao> list = new ArrayList<Aplicacao>();
		rep.findAll().forEach(e -> list.add(e));
		return list;
	}

	public synchronized Aplicacao addAplicacao(Aplicacao e) {
		Aplicacao novo = rep.save(e);
		return novo;
	}

	public void updateAplicacao(Aplicacao e) {
		rep.save(e);
	}

	public void deleteAplicacao(int id) {
		rep.delete(getAplicacaoById(id));
	}
}