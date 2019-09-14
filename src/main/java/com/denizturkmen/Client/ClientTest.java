package com.denizturkmen.Client;

import org.hibernate.Session;

import com.denizturkmen.util.HibernateUtil;


public class ClientTest {

	public static void main(String[] args) {
		
	try(Session session= HibernateUtil.getSessionFactory().openSession()){
		String SQL = "select version()";
		String result=(String) session.createNativeQuery(SQL).getSingleResult();
		System.out.println("Mysql version Is : :");
		System.out.println(result);
	
	}
	catch (Exception e) {
		e.printStackTrace();
	}

	}

}
