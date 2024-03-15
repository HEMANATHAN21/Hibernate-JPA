package dao;


import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import com.student.Student;

public class StudentDao  
{
	public EntityManager getEm()
	{
		return Persistence.createEntityManagerFactory("solo").createEntityManager();
	}
	
	public Student saveStudent(Student s)
	{
		EntityManager em = getEm();
		em.getTransaction().begin();
		em.persist(s);
		em.getTransaction().commit();
		return s;
	}
	
	public Student findStudent(int id)
	{
		EntityManager em = getEm();
		Student s = em.find(Student.class, id);
		if(s != null)
		{
			return s;
		}
		else
		{
			return null;
		}
	}
	
	public Student deleteStudent(int id)
	{
		EntityManager em = getEm();
		Student s = findStudent(id);
		if(s != null)
		{
			em.getTransaction().begin();
			em.remove(s);
			em.getTransaction().commit();
			return s;
		}
		return null;
		
	}
	
	public Student updateStudent(Student s, int id)
	{
		EntityManager em = getEm();
		Student exStudent = em.find(Student.class, id); 
		if(exStudent != null)
		{
			em.getTransaction().begin();
			s.setId(id);
			Student st = em.merge(s);
			em.getTransaction().commit();
			return st;
		}
		return null;
	}
}
