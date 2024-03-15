package com.student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateAndMerge 
{

	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("solo");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Student st = em.find(Student.class, 2);
		System.out.println(st);
		st.setName("solohema");
		//st.setId(5);//not possible to change id because of datached entity happened
		et.begin();
		Student updatedData = em.merge(st);
		et.commit();
		System.out.println(updatedData);

	}

}
