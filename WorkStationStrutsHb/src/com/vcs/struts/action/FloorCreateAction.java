/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.vcs.struts.action;

import java.lang.reflect.InvocationTargetException;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.sun.org.apache.commons.beanutils.BeanUtils;
import com.vcs.hibernate.Floor;
import com.vcs.hibernate.Floorxtra;
import com.vcs.service.ServiceFactory;
import com.vcs.struts.form.FloorForm;

public class FloorCreateAction extends Action {
	
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		FloorForm floorForm = (FloorForm) form;
		System.out.println("floorCreateAction");
		Floor floor=new Floor();
		try {
			BeanUtils.copyProperties(floor, floorForm);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Floorxtra floorxtra=new Floorxtra();
		floorxtra.setFloorId(floor.getFloorId());
		floorxtra.setCreatedBy("suresh");
		floorxtra.setUpdatedBy("kiran");
		floorxtra.setCreatedDate(Calendar.getInstance().getTime());
		floorxtra.setUpdatedDate(Calendar.getInstance().getTime());
		floor.setFloorxtra(floorxtra);
		
		String status=ServiceFactory.getFloorService().createFloor(floor);
		
		HttpSession hsession=request.getSession();
		hsession.setAttribute("status", status);
		
		return mapping.findForward("success");
	}
}