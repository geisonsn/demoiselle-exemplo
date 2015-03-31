package br.com.exedemo.exemplo.persistence;

import br.gov.frameworkdemoiselle.stereotype.PersistenceController;
import br.gov.frameworkdemoiselle.template.JPACrud;

import br.com.exedemo.exemplo.domain.Teste;

@PersistenceController
public class TesteDAO extends JPACrud<Teste, Long> {

	private static final long serialVersionUID = 1L;
	

}
