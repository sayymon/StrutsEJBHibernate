package br.com.saymon.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import br.com.saymon.form.TesteStrutsForm;

public class TesteStrutsAction extends Action {

	@Override
	public ActionForward execute(ActionMapping map, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
	
		TesteStrutsForm testeStrutsForm = (TesteStrutsForm) form;
		testeStrutsForm.setMessage("Teste Struts");
		return map.findForward("success");
	}
	
}
