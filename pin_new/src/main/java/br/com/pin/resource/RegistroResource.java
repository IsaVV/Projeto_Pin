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
	public RegistroParada buscarPeloCodigo(@PathVariable Integer id) {
		return registroRepository.findById(id).orElse(null);
	}

	@GetMapping("/localProducao/{local}")
	public List<RegistroParada> buscarPeloLocalProducao(@PathVariable String local) {
		return (List<RegistroParada>) registroRepository.findByLocalProducao(local);
	}

	@GetMapping("/localCausador/{local}")
	public List<RegistroParada> buscarPeloLocalCausador(@PathVariable String local) {
		return (List<RegistroParada>) registroRepository.findByLocalCausador(local);
	}

	@GetMapping("/componente/{componente}")
	public List<RegistroParada> buscarPeloComponente(@PathVariable String componente) {
		return (List<RegistroParada>) registroRepository.findByComponente(componente);
	}

	@GetMapping("/lote/{lote}")
	public List<RegistroParada> buscarPeloLote(@PathVariable String lote) {
		return (List<RegistroParada>) registroRepository.findByLote(lote);
	}

	@GetMapping("/causa/tipo/{tipo}")
	public List<RegistroParada> buscarPeloCausaTipo(@PathVariable String tipo) {
		return (List<RegistroParada>) registroRepository.findByCausaTipo(tipo);
	}

	@GetMapping("/causa/atributo/{atributo}")
	public List<RegistroParada> buscarPeloCausaAtributo(@PathVariable String atributo) {
		return (List<RegistroParada>) registroRepository.findByCausaAtributo(atributo);
	}

	@GetMapping("/causa/disfuncao/{disfuncao}")
	public List<RegistroParada> buscarPeloCausaDisfuncao(@PathVariable String disfuncao) {
		return (List<RegistroParada>) registroRepository.findByCausaDisfuncao(disfuncao);
	}

	@GetMapping("/dataHora/dataInicio/{data}")
	public List<RegistroParada> buscarPeloDataHoraDataInicio(@PathVariable String data) {
		return (List<RegistroParada>) registroRepository.findByDataHoraDataInicio(data);
	}

	@GetMapping("/dataHora/dataFinal/{data}")
	public List<RegistroParada> buscarPeloDataHoraDataFinal(@PathVariable String data) {
		return (List<RegistroParada>) registroRepository.findByDataHoraDataFinal(data);
	}

	@GetMapping("/dataHora/horaInicial/{hora}")
	public List<RegistroParada> buscarPeloDataHoraHoraInicial(@PathVariable String hora) {
		return (List<RegistroParada>) registroRepository.findByDataHoraHoraInicial(hora);
	}

	@GetMapping("/dataHora/horaFinal/{hora}")
	public List<RegistroParada> buscarPeloDataHoraHoraFinal(@PathVariable String hora) {
		return (List<RegistroParada>) registroRepository.findByDataHoraHoraFinal(hora);
	}

	@DeleteMapping
	public void remover(@PathVariable Integer id) {
		registroRepository.deleteById(id);
	}
	
	@PostMapping
	public RegistroParada cadastrar(@RequestBody RegistroParada registro) {
		return registroRepository.save(registro);
	}
	
}
