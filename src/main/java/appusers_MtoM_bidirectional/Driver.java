package appusers_MtoM_bidirectional;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import appusers_manytomany.User;

public class Driver 
{

	public static void main(String[] args) 
	{
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("solo");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		EntityManager em2 = emf.createEntityManager();
		EntityManager em3 = emf.createEntityManager();
		
//		UserBidir u1 = new UserBidir();
//		u1.setUserName("hemanathan");
//		u1.setUserContact(123456789);
//		
//		UserBidir u2 = new UserBidir();
//		u2.setUserName("jeyavarshan");
//		u2.setUserContact(123456789);
//		
//		UserBidir u3 = new UserBidir();
//		u3.setUserName("purushothaman");
//		u3.setUserContact(123456789);
//		
//		ApplicationBidir a1 = new ApplicationBidir();
//		a1.setAppName("netflix");
//		a1.setAppCost(1000);
//		
//		ApplicationBidir a2 = new ApplicationBidir();
//		a2.setAppName("instagram");
//		a2.setAppCost(100);
//		
//		ApplicationBidir a3 = new ApplicationBidir();
//		a3.setAppName("chrome");
//		a3.setAppCost(10);
//		
//		ApplicationBidir a4 = new ApplicationBidir();
//		a4.setAppName("snapchat");
//		a4.setAppCost(1000);
//		
//		List<ApplicationBidir> u1apps = new ArrayList<ApplicationBidir>();
//		u1apps.add(a3);
//		u1.setUserApplications(u1apps);
//		
//		List<ApplicationBidir> u2apps = new ArrayList<ApplicationBidir>();
//		u2apps.add(a1);
//		u2apps.add(a2);
//		u2apps.add(a3);
//		u2.setUserApplications(u2apps);
//		
//		List<ApplicationBidir> u3apps = new ArrayList<ApplicationBidir>();
//		u3apps.add(a1);
//		u3apps.add(a2);
//		u3apps.add(a4);
//		u3.setUserApplications(u3apps);
//		
//		List<UserBidir> a1users = new ArrayList<UserBidir>();
//		a1users.add(u2);
//		a1users.add(u3);
//		a1.setUserList(a1users);
//		
//		List<UserBidir> a2users = new ArrayList<UserBidir>();
//		a2users.add(u2);
//		a2users.add(u3);
//		a2.setUserList(a2users);
//		
//		List<UserBidir> a3users = new ArrayList<UserBidir>();
//		a3users.add(u1);
//		a3users.add(u2);
//		a3.setUserList(a3users);
//		
//		List<UserBidir> a4users = new ArrayList<UserBidir>();
//		a4users.add(u3);
//		a4.setUserList(a4users);
//		
//		et.begin();
//		em.persist(u1);
//		em.persist(u2);
//		em.persist(u3);
//		em.persist(a4);
//		et.commit();
		
		em.find(ApplicationBidir.class, 1);
		em2.find(ApplicationBidir.class, 1);
		em2.find(ApplicationBidir.class, 1);
		em3.find(ApplicationBidir.class, 1);
	}

}
