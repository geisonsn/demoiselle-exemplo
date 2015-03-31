

package br.com.exedemo.exemplo.business;

import static org.junit.Assert.*;
import java.util.*;
import javax.inject.Inject;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import br.gov.frameworkdemoiselle.junit.DemoiselleRunner;
import br.com.exedemo.exemplo.domain.Teste;
import br.com.exedemo.exemplo.business.TesteBC;

@RunWith(DemoiselleRunner.class)
public class TesteBCTest {

    @Inject
	private TesteBC testeBC;
	
	@Before
	public void before() {
		for (Teste teste : testeBC.findAll()) {
			testeBC.delete(teste.getId());
		}
	}	
	
	
	@Test
	public void testInsert() {
				
		// modifique para inserir dados conforme o construtor
		Teste teste = new Teste("texto");
		testeBC.insert(teste);
		List<Teste> listOfTeste = testeBC.findAll();
		assertNotNull(listOfTeste);
		assertEquals(1, listOfTeste.size());
	}	
	
	@Test
	public void testDelete() {
		
		// modifique para inserir dados conforme o construtor
		Teste teste = new Teste("texto");
		testeBC.insert(teste);
		
		List<Teste> listOfTeste = testeBC.findAll();
		assertNotNull(listOfTeste);
		assertEquals(1, listOfTeste.size());
		
		testeBC.delete(teste.getId());
		listOfTeste = testeBC.findAll();
		assertEquals(0, listOfTeste.size());
	}
	
	@Test
	public void testUpdate() {
		// modifique para inserir dados conforme o construtor
		Teste teste = new Teste("texto");
		testeBC.insert(teste);
		
		List<Teste> listOfTeste = testeBC.findAll();
		Teste teste2 = (Teste)listOfTeste.get(0);
		assertNotNull(listOfTeste);

		// alterar para tratar uma propriedade existente na Entidade Teste
		// teste2.setUmaPropriedade("novo valor");
		testeBC.update(teste2);
		
		listOfTeste = testeBC.findAll();
		Teste teste3 = (Teste)listOfTeste.get(0);
		
		// alterar para tratar uma propriedade existente na Entidade Teste
		// assertEquals("novo valor", teste3.getUmaPropriedade());
	}

}