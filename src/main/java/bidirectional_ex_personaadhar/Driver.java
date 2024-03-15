package bidirectional_ex_personaadhar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver {

	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("solo");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
//		PersonBidire p = new PersonBidire();
//		p.setpName("hemanathan");
//		p.setpEmail("hemanathan@gmail.com");
//		
//		AadharBidirec a = new AadharBidirec();
//		a.setaAddress("chennai");
//		a.setaContact(123456789);
//		
//		a.setP(p);
//		p.setA(a);
//		
//		et.begin();
//		em.persist(p);
//		et.commit();
		
		PersonBidire p1 = em.find(PersonBidire.class, 23);
		System.out.println(p1);
	}

}
