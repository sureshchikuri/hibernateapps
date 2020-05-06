package com.vcs.struts.dao;

import java.sql.Connection;

import org.hibernate.Session;

public class AbstractDaoImpl implements AbstractDao {

	Connection connection;
	Session session;
	
	@Override
	public Connection getConnection() {
		return connection;
	}

	@Override
	public Session getSession() {
		return session;
	}

	@Override
	public void setConnection(Connection connection) {

		this.connection=connection;
	}

	@Override
	public void setSession(Session session) {

		this.session=session;
	}

}
