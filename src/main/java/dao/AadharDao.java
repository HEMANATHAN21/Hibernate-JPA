package dao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import personaadhar_onetoone.Aadhar;


public class AadharDao 
{
	public EntityManager getEm()
	{
		return Persistence.createEntityManagerFactory("solo").createEntityManager();
	}
	
	public Aadhar saveAadhar(Aadhar a)
	{
		EntityManager em = getEm();
		em.getTransaction().begin();
		em.persist(a);
		em.getTransaction().commit();
		return a;
	}
	
	public Aadhar findAadhar(long aNumber)
	{
		EntityManager em = getEm();
		Aadhar a = em.find(Aadhar.class, aNumber);
		if(a != null)
		{
			return a;
		}
		else
		{
			return null;
		}
	}
	
	public Aadhar deleteAadhar(long aNumber)
	{
		EntityManager em = getEm();
		Aadhar a = em.find(Aadhar.class, aNumber);
		if(a != null)
		{
			em.getTransaction().begin();
			em.remove(a);
			em.getTransaction().commit();
			return a;
		}
		return null;
	}
	
	public Aadhar updateAadhar(Aadhar a, long aNumber)
	{
		EntityManager em = getEm();
		Aadhar exAadhar = em.find(Aadhar.class, aNumber);
		if(exAadhar != null)
		{
			a.setaNumber(aNumber);
			em.getTransaction().begin();
			Aadhar ad = em.merge(a);
			em.getTransaction().commit();
			return ad;
		}
		return null;
	}

}
