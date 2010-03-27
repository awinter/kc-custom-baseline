package org.kuali.kra.custom;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.kuali.kra.infrastructure.KraServiceLocator;

public class MeetingAction extends org.kuali.kra.meeting.MeetingAction {

	@Override
	public ActionForward start(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// TODO Auto-generated method stub
		((CustomService)KraServiceLocator.getService(CustomService.class)).customTest();
		return super.start(mapping, form, request, response);
	}

}
