
package br.com.exedemo.exemplo.view;

import javax.inject.Inject;
import br.gov.frameworkdemoiselle.annotation.PreviousView;
import br.gov.frameworkdemoiselle.stereotype.ViewController;
import br.gov.frameworkdemoiselle.template.AbstractEditPageBean;
import br.gov.frameworkdemoiselle.transaction.Transactional;
import br.com.exedemo.exemplo.business.*;
import br.com.exedemo.exemplo.domain.*;
import javax.faces.model.*;
import org.primefaces.event.TransferEvent;
import org.primefaces.model.DualListModel;
import java.util.*;

// To remove unused imports press: Ctrl+Shift+o

@ViewController
@PreviousView("./teste_list.jsf")
public class TesteEditMB extends AbstractEditPageBean<Teste, Long> {

	private static final long serialVersionUID = 1L;

	@Inject
	private TesteBC testeBC;
	

	
	@Override
	@Transactional
	public String delete() {
		this.testeBC.delete(getId());
		return getPreviousView();
	}
	
	@Override
	@Transactional
	public String insert() {
		this.testeBC.insert(this.getBean());
		return getPreviousView();
	}
	
	@Override
	@Transactional
	public String update() {
		this.testeBC.update(this.getBean());
		return getPreviousView();
	}
	
	@Override
	protected Teste handleLoad(Long id) {
		return this.testeBC.load(id);
	}	
}