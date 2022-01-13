package com.guilhermeoscp.questao5.endpoint;

import java.time.LocalDateTime;

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

import com.guilhermeoscp.questao5.error.CustomErrorType;
import com.guilhermeoscp.questao5.model.Veiculo;
import com.guilhermeoscp.questao5.util.DateUtil;

@RestController
@RequestMapping("veiculos")
public class VeiculoEndpoint {
	
	@Autowired
	private DateUtil dateUtil;
	
	@GetMapping
	public ResponseEntity<?> listAll() {
		System.out.println(dateUtil.formatLocalDateTimeDatabaseStyle(LocalDateTime.now()));	
		return new ResponseEntity<>(Veiculo.veiculoList, HttpStatus.OK);
	}
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<?> getVeiculoById(@PathVariable("id") int id) {
		Veiculo veiculo = new Veiculo();
		veiculo.setId(id);
		int index = Veiculo.veiculoList.indexOf(veiculo);
		if(index == -1) {
			return new ResponseEntity<>(new CustomErrorType("Veiculo não encontrado"), HttpStatus.NOT_FOUND);			
		} else {
			return new ResponseEntity<>(Veiculo.veiculoList.get(index), HttpStatus.OK);
		}
	}
	
	@PostMapping
	public ResponseEntity<?> save(@RequestBody Veiculo veiculo) {
		Veiculo.veiculoList.add(veiculo);
		return new ResponseEntity<>(veiculo, HttpStatus.OK);
	}
	
	@DeleteMapping
	public ResponseEntity<?> delete(@RequestBody Veiculo veiculo) {
		Veiculo.veiculoList.remove(veiculo);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<?> update(@RequestBody Veiculo veiculo) {
		Veiculo.veiculoList.remove(veiculo);
		Veiculo.veiculoList.add(veiculo);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}

