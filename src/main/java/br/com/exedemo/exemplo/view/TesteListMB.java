package br.com.exedemo.exemplo.view;

import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import br.gov.frameworkdemoiselle.annotation.NextView;
import br.gov.frameworkdemoiselle.annotation.PreviousView;
import br.gov.frameworkdemoiselle.stereotype.ViewController;
import br.gov.frameworkdemoiselle.template.AbstractListPageBean;
import br.gov.frameworkdemoiselle.transaction.Transactional;
import br.com.exedemo.exemplo.business.TesteBC;
import br.com.exedemo.exemplo.domain.Teste;

@ViewController
@NextView("./teste_edit.jsf")
@PreviousView("./teste_list.jsf")
public class TesteListMB extends AbstractListPageBean<Teste, Long> {

	private static final long serialVersionUID = 1L;

	@Inject
	private TesteBC testeBC;
	
	@Override
	protected List<Teste> handleResultList() {
		return this.testeBC.findAll();
	}
	
	@Transactional
	public String deleteSelection() {
		boolean delete;
		for (Iterator<Long> iter = getSelection().keySet().iterator(); iter.hasNext();) {
			Long id = iter.next();
			delete = getSelection().get(id);
			if (delete) {
				testeBC.delete(id);
				iter.remove();
			}
		}
		return getPreviousView();
	}

}