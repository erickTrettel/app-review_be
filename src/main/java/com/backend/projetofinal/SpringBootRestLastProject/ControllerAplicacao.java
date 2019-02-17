package com.backend.projetofinal.SpringBootRestLastProject;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerAplicacao {
	private final static String URL = "/api/v1/aplicacao";
	@Autowired
	private AplicacaoService service;

	@RequestMapping("/aplicacao")
	public String index() {
		return "Hello Spring Boot";
	}

	@GetMapping(URL + "/{id}")
	public ResponseEntity<Aplicacao> getAplicacaoById(@PathVariable("id") Integer id) {
		Aplicacao e = service.getAplicacaoById(id);
		return new ResponseEntity<Aplicacao>(e, HttpStatus.OK);
	}

	@GetMapping(URL)
	public ResponseEntity<List<Aplicacao>> getAllAplicacaos() {
		List<Aplicacao> list = service.getAllAplicacaos();
		return new ResponseEntity<List<Aplicacao>>(list, HttpStatus.OK);
	}

	@PostMapping(URL)
	public ResponseEntity<Aplicacao> addAplicacao(@RequestBody Aplicacao e) {
		Aplicacao novo = service.addAplicacao(e);
		return new ResponseEntity<Aplicacao>(novo, HttpStatus.CREATED);
	}

	@PutMapping(URL)
	public ResponseEntity<Aplicacao> updateArticle(@RequestBody Aplicacao e) {
		service.updateAplicacao(e);
		return new ResponseEntity<Aplicacao>(e, HttpStatus.OK);
	}

	@DeleteMapping(URL + "/{id}")
	public ResponseEntity<Void> deleteArticle(@PathVariable("id") Integer id) {
		service.deleteAplicacao(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
}
