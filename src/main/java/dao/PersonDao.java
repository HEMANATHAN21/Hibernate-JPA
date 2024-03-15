package dao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import personaadhar_onetoone.Person;


public class PersonDao 
{
	public EntityManager getEm()
	{
		return Persistence.createEntityManagerFactory("solo").createEntityManager();
	}
	
	public Person savePerson(Person p)
	{
		EntityManager em = getEm();
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
		return p;
	}
	
	public Person findPerson(int pId)
	{
		EntityManager em = getEm();
		Person p = em.find(Person.class, pId);
		if(p != null)
		{
			return p;
		}
		else
		{
			return null;
		}
	}
	
	public Person deletePerson(int pId)
	{
		EntityManager em = getEm();
		Person p = em.find(Person.class, pId);
		if(p != null)
		{
			em.getTransaction().begin();
			em.remove(p);
			em.getTransaction().commit();
			return p;
		}
		return null;
	}
	
	public Person updatePerson(Person p, int pId)
	{
		EntityManager em = getEm();
		Person exPerson = em.find(Person.class, pId);
		if(exPerson != null)
		{
			em.getTransaction().begin();
			p.setpId(pId);
			Person pe = em.merge(p);
			em.getTransaction().commit();
			return pe;
		}
		return null;
	}

}
