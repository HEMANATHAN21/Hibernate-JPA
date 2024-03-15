package appusers_manytomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("solo");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Application a1 = new Application();
		a1.setAppName("bgmi");
		a1.setAppCost(100);
		
		Application a2 = new Application();
		a2.setAppName("snapchat");
		a2.setAppCost(1000);
		
		Application a3 = new Application();
		a3.setAppName("instagram");
		a3.setAppCost(100);
		
		User u1 = new User();
		u1.setUserName("hemanathan");
		u1.setUserContact(123456789);
		
		User u2 = new User();
		u2.setUserName("jeyavarshan");
		u2.setUserContact(123456789);
		
		List<Application> user1apps = new ArrayList<Application>();
		user1apps.add(a1);
		user1apps.add(a2);
		user1apps.add(a3);
		
		List<Application> user2apps = new ArrayList<Application>();
		user2apps.add(a2);
		user2apps.add(a3);
		
		u1.setUserApplications(user1apps);
		u2.setUserApplications(user2apps);
		
		et.begin();
		em.persist(u2);
		em.persist(u1);
		et.commit();
	}

}
