package dao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import company_employee_onetomany.Employee;

public class EmployeeDao 
{
	public EntityManager getEm()
	{
		return Persistence.createEntityManagerFactory("solo").createEntityManager();
	}
	
	public Employee saveEmployee(Employee e)
	{
		EntityManager em = getEm();
		em.getTransaction().begin();
		em.persist(e);
		em.getTransaction().commit();
		return e;
	}
	
	public Employee findEmployee(int empId)
	{
		EntityManager em = getEm();
		Employee e = em.find(Employee.class, empId);
		if(e != null)
		{
			return e;
		}
		else
		{
			return null;
		}
	}
	
	public Employee deleteEmployee(int empId)
	{
		EntityManager em = getEm();
		Employee e = em.find(Employee.class, empId);
		if(e != null)
		{
			em.getTransaction().begin();
			em.remove(e);
			em.getTransaction().commit();
			return e;
		}
		return null;
	}

	public Employee updateEmployee(Employee e, int empId)
	{
		EntityManager em = getEm();
		Employee exEmployee = em.find(Employee.class, empId);
		if(exEmployee != null)
		{
			e.setEmpId(empId);
			em.getTransaction().begin();
			Employee e1 = em.merge(e);
			em.getTransaction().commit();
			return e1;
		}
		return null;
	}

	
}