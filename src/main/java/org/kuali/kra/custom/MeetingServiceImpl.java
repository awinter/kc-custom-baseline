package org.kuali.kra.custom;

import java.sql.Date;

import org.kuali.kra.committee.bo.CommitteeSchedule;
import org.kuali.kra.meeting.CommScheduleActItem;
import org.kuali.rice.kns.service.BusinessObjectService;

public class MeetingServiceImpl extends org.kuali.kra.meeting.MeetingServiceImpl {
    @Override
	public void addOtherAction(CommScheduleActItem newOtherAction,
			CommitteeSchedule committeeSchedule) {
		// TODO Auto-generated method stub
		System.out.println("override addOtherAction in custom");
		super.addOtherAction(newOtherAction, committeeSchedule);
	}

	BusinessObjectService businessObjectService;

	public void setBusinessObjectService(BusinessObjectService businessObjectService) {
		this.businessObjectService = businessObjectService;
		// TODO : need to do this because super is no longer a bean.
		System.out.println("override setbos in custom");
		super.setBusinessObjectService(businessObjectService);
	}
    

}
