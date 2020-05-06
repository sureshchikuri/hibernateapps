package com.vcs.struts.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.util.Calendar;

import org.hibernate.Session;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.vcs.hibernate.Floor;
import com.vcs.hibernate.Floorxtra;
import com.vcs.service.FloorService;
import com.vcs.service.FloorServiceImpl;
import com.vcs.struts.util.HibernateUtil;

public class FloorDaoImplTest {

	static FloorDaoImpl floorDaoNew;
	static FloorServiceImpl floorService;
	static Floor floor;
	static Floorxtra floorxtra;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		floorService=new FloorServiceImpl();
		floorDaoNew =new FloorDaoImpl();
		floor=new Floor();
		floorxtra =new Floorxtra();
		Session session=HibernateUtil.getSession();
		//Transaction tx=session.beginTransaction();
		floorDaoNew.setSession(session);
		
		floor.setFloorId(762);
		floor.setFloorName("shivanicomplex");
		floor.setFloorDesc("Service oriented materials");
		
		floorxtra.setFloorId(floor.getFloorId());
		floorxtra.setCreatedBy("vicky");
		floorxtra.setUpdatedBy("kranthi");
		floorxtra.setCreatedDate(Calendar.getInstance().getTime());
		floorxtra.setUpdatedDate(Calendar.getInstance().getTime());
		floor.setFloorxtra(floorxtra);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
		System.out.println("all null");
	}

	@Test
	public void testSetSession() {
		fail("Not yet implemented");
	}

	@Test
	public void testCreateFloor() {
		
		//assertEquals("floor Created", floorDaoNew.createFloor(floor));
		
	}

	

	@Test
	public void testIsFloorExist() {
		assertNotNull(floorDaoNew.isFloorExist(111));
	}

	@Test
	public void testSearchFloor() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCount() {
		fail("Not yet implemented");
	}

}
