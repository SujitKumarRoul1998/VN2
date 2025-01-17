package com.vn2.entity;

import java.lang.module.Configuration;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import jakarta.transaction.Transaction;

public class MainDriver {

	public static void main(String[] args) {
		User u =new User();
		u.setId(1);
		u.setName("Sujit");
		u.setPhone("7609933937");
		u.setPassword("sujitsuji");
		
		/*
		 * Configuration cfg=new Configuration("hibernate.cfg.xml");
		 * cfg.configure(); 
		 * SessionFactory sf=cfg.buildSessionFactory(); //For One DataBase
		 * Session s=sf.openSession();  // 
		 * Transaction t=s.beginTransaction();
		 * s.save(null);
		 * t.commit();
		 */
	}

}
