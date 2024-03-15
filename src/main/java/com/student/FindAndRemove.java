package com.student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FindAndRemove 
{

	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("solo");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		Student st = em.find(Student.class, 2);
		System.out.println(st);
		em.remove(st);
		et.commit();
		System.out.println("Row Deleted Successfully...");
		

	}

}
