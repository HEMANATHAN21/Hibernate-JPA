package dao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import company_employee_onetomany.Company;

public class CompanyDao 
{
	public EntityManager getEm()
	{
		return Persistence.createEntityManagerFactory("solo").createEntityManager();
	}
	
	public Company saveCompany(Company c)
	{
		EntityManager em = getEm();
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();
		return c;
	}
	
	public Company findCompany(int companyId)
	{
		EntityManager em = getEm();
		Company c = em.find(Company.class, companyId);
		if(c != null)
		{
			return c;
		}
		else
		{
			return null;
		}
	}
	
	public Company deleteCompany(int companyId)
	{
		EntityManager em = getEm();
		Company c = em.find(Company.class, companyId);
		if(c != null)
		{
			em.getTransaction().begin();
			em.remove(c);
			em.getTransaction().commit();
			return c;
		}
		return null;
	}
	
	public Company updateCompany(Company c, int companyId)
	{
		EntityManager em = getEm();
		Company exCompany = em.find(Company.class, companyId);
		if(exCompany != null)
		{
			c.setCompanyId(companyId);
			em.getTransaction().begin();
			Company co = em.merge(c);
			em.getTransaction().commit();
			return co;
		}
		return null;
	}

}