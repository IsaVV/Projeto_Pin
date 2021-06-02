package br.com.pin.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pin.controllers.RegistroParada;
import br.com.pin.repository.RegistroRepository;

@RestController
@RequestMapping("/registro")
public class RegistroResource {
	
	@Autowired
	private RegistroRepository registroRepository;
	
	@GetMapping
	public List<RegistroParada> listarTodos() {
		return registroRepository.findAll();
	}
	
	@GetMapping("/{codigo}")
	public RegistroParada buscarPeloCodigo(@PathVariable Long id) {
		return registroRepository.findById(id).orElse(null);
	}
	
	@DeleteMapping
	public void remover(@PathVariable Long id) {
		registroRepository.deleteById(id);
	}
	
	@PostMapping
	public RegistroParada cadastrar(@RequestBody RegistroParada registro) {
		return registroRepository.save(registro);
	}
	
}