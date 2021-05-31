package br.com.gustavolima.myinvest.resources;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.gustavolima.myinvest.domain.Investimentos;
import br.com.gustavolima.myinvest.repository.InvestimentoRepository;

@RestController
@RequestMapping("/investimentos")
@CrossOrigin(origins = "http://localhost:3000")
public class InvestimentoResource {
	@Autowired
	private InvestimentoRepository investimentoRepostory;
	
	@GetMapping
	public List<Investimentos> listarTodos() {
		return investimentoRepostory.findAll();
	}
	
	@GetMapping("/{codigo}")
	public Investimentos buscarPeloCodigo(@PathVariable Long codigo) {
		return investimentoRepostory.findById(codigo).orElse(null);
	}
	
	@DeleteMapping
	public void remover(@PathVariable Long codigo) {
		investimentoRepostory.deleteById(codigo);
	}
	
	@PostMapping
	public Investimentos cadastrar(@RequestBody Investimentos investimento) {
		return investimentoRepostory.save(investimento);
	}
}
