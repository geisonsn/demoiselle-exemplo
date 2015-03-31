
package br.com.exedemo.exemplo.business;

import br.gov.frameworkdemoiselle.stereotype.BusinessController;
import br.gov.frameworkdemoiselle.template.DelegateCrud;
import br.com.exedemo.exemplo.domain.*;
import java.util.*;
import javax.faces.model.*;
import br.com.exedemo.exemplo.persistence.TesteDAO;

// To remove unused imports press: Ctrl+Shift+o

@BusinessController
public class TesteBC extends DelegateCrud<Teste, Long, TesteDAO> {
	private static final long serialVersionUID = 1L;
	
	
}
