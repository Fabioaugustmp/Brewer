package com.algaworks.brewer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.algaworks.brewer.model.Cerveja;
import com.algaworks.brewer.repository.Cervejas;

@Service
public class CadastroCervejaService {

	@Autowired
	private Cervejas cervejas;
	
	//Service section
	@Transactional
	public void salvar(Cerveja cerveja) {
		//One way to do it
		//cerveja.setSku(cerveja.getSku().toUpperCase());
		cervejas.save(cerveja);
	}
	
}
