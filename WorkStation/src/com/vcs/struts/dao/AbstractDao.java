package com.vcs.struts.dao;

import java.sql.Connection;

import org.hibernate.Session;

public interface AbstractDao {

	Connection getConnection();
	void setConnection(Connection connection);
	
	Session getSession();
	void setSession(Session session);
	
}
