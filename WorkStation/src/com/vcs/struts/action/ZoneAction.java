/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.vcs.struts.action;

import java.lang.reflect.InvocationTargetException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.sun.org.apache.commons.beanutils.BeanUtils;
import com.vcs.hibernate.Floor;
import com.vcs.hibernate.Zone;
import com.vcs.struts.dao.ZoneDao;
import com.vcs.struts.form.ZoneForm;


public class ZoneAction extends Action {
	
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		ZoneForm zoneForm = (ZoneForm) form;
		Zone zone=new Zone();
		
		try {
			BeanUtils.copyProperties(zone, zoneForm);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Floor floor=new Floor();
		floor.setFloorId(Integer.parseInt(zoneForm.getFloorId()));
		zone.setFloor(floor);
		
		String status=null;
		ZoneDao zoneDao=new ZoneDao();
		status=zoneDao.zoneCreate(zone);
		
		
		System.out.println("zone Action");
		return mapping.findForward("success");
	}
}